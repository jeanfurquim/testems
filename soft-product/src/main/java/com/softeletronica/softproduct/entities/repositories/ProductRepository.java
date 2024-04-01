package com.softeletronica.softproduct.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softeletronica.softproduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
