package com.myapp.rest.api;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.rest.dto.AccountInput;
import com.myapp.rest.models.Account;
import com.myapp.rest.repository.AccountRepository;

//this is a rest resource
@RestController
@RequestMapping("api/v1")
public class AccountApi {
	
	@Autowired
	private AccountRepository repo ;
	
	@PostMapping("/accounts")
	public ResponseEntity<?> findAccountBalance(@Valid @RequestBody AccountInput input){
		
		Optional<Account> accno=repo.findByAccountNumber(input.getAccountNumber());
		
		return new ResponseEntity<>(accno.get(),HttpStatus.OK);
		
		
	}

}
