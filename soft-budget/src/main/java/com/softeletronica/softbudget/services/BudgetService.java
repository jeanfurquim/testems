package com.softeletronica.softbudget.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softeletronica.softbudget.dto.BudgetDTO;
import com.softeletronica.softbudget.dto.ProductDTO;
import com.softeletronica.softbudget.feignclients.SoftBudgetFeignClient;

@Service
public class BudgetService {

	

	@Autowired
	private SoftBudgetFeignClient softBudgetFeignClient;

	public BudgetDTO getBudget(long productId, double tax, double discount) {
	

		ProductDTO product = softBudgetFeignClient.findById(productId).getBody();
		return new BudgetDTO(product.getName(), product.getPrice(), tax, discount);

	}

}
