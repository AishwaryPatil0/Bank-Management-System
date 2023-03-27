package com.icici;

public class InsuffcientChoiceException extends RuntimeException{
private String message;
	
	public InsuffcientChoiceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
		
	}

}
