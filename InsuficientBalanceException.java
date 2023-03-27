package com.icici;

public class InsuficientBalanceException extends RuntimeException {
	private String message;
	
	public InsuficientBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
		
	}

}
