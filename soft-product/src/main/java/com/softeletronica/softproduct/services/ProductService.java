package com.softeletronica.softproduct.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.softeletronica.softproduct.entities.Product;
import com.softeletronica.softproduct.entities.dto.ProductDTO;
import com.softeletronica.softproduct.entities.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Page<ProductDTO> findAll(Pageable pageable){
		Page<Product> list = repository.findAll(pageable);
		return list.map(x-> new ProductDTO(x));
	}
	
	public ProductDTO findById(Long id) throws Exception {
		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(()-> new Exception("erro"));
		return new ProductDTO(entity);
	}
	
}
