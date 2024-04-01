package com.softeletronica.softbudget.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softeletronica.softbudget.dto.BudgetDTO;
import com.softeletronica.softbudget.services.BudgetService;

@RestController
@RequestMapping(value = "/budgets")
public class BudgetController {
	
	
	@Autowired
	private BudgetService service;
	
	@GetMapping(value = "/{productId}/tax/{tax}/discount/{discount}")
	public ResponseEntity <BudgetDTO> getBudget(@PathVariable Long productId,@PathVariable Double tax, @PathVariable Double discount) {
		BudgetDTO budget = service.getBudget(productId, tax, discount);
		return ResponseEntity.ok(budget);
	}

}
