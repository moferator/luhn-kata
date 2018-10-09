package com.acmebank.interviews.luhn;


public interface CreditCardNumberValidator {
	
	public void validate(String number) throws CreditCardNumberValidationException;

}
