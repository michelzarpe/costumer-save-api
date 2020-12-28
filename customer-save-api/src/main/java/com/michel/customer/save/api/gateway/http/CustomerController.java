package com.michel.customer.save.api.gateway.http;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.michel.customer.save.api.service.SaveCustomerService;

@RestController
@RequestMapping("/v1")
public class CustomerController {

	@Autowired
	private SaveCustomerService saveCustomerService;
	
	@PostMapping("/")
	public String create(@RequestBody CustomerJson customerJson) throws ExecutionException, InterruptedException, JsonProcessingException{
		return saveCustomerService.execute(customerJson);
	}
	
	
}
