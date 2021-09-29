package com.myapp.rest.dto;

import javax.validation.constraints.NotBlank;

public class AccountInput {
	
	@NotBlank(message="Account number is Mandatory")
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
