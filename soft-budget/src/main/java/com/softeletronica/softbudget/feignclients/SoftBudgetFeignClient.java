package com.softeletronica.softbudget.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.softeletronica.softbudget.dto.ProductDTO;



@Component
@FeignClient(name = "soft-product",path = "/products" )
public interface SoftBudgetFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<ProductDTO> findById(@PathVariable Long id);

}
