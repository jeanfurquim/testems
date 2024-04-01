package com.softeletronica.softuser.services;


import com.softeletronica.softuser.dto.UserDTO;
import com.softeletronica.softuser.entities.Role;
import com.softeletronica.softuser.entities.User;
import com.softeletronica.softuser.projections.UserDetailsProjection;
import com.softeletronica.softuser.repositories.RoleRepository;
import com.softeletronica.softuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Transactional(readOnly = true)
    public Page<UserDTO> findAllPaged(Pageable pageable) {
        Page<User> list = repository.findAll(pageable);
        return list.map(x -> new UserDTO(x));
    }

    @Transactional(readOnly = true)
    public User findEmail(String email)  {
        List<UserDetailsProjection> result = repository.searchUserAndRolesByEmail(email);
        if(result.size()==0) {
            throw new IllegalArgumentException("User not found");
        }
        User user = new User();
        user.setEmail(result.get(0).getUsername());
        user.setPassword(result.get(0).getPassword());
        for (UserDetailsProjection projection : result) {
            user.addRole(new Role(projection.getRoleId(),projection.getAuthority()));
        }
        return user;
    }

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        Optional<User> obj = repository.findById(id);
        User entity = obj.orElseThrow(() -> new RuntimeException("Entity not found"));
        return new UserDTO(entity);
    }

}



