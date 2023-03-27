package com.icici;

public class BankImpl implements Bank{
	
 //initializing using constructor
	int balance;
	BankImpl(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposite(int amount)
	{
		System.out.println("depositing rs."+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Successfully");
		
	}
	
	@Override
	public void withdraw(int amount)
	{
		if(amount <=balance)
		{
			System.out.println("withdrawing Rs."+amount);
			balance -= amount;
			System.out.println("Amount Withdraw Successfully");
		}
		else
		{
		try {
			throw new InsuficientBalanceException ("Insuficient Amount");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}
	
	@Override
	public int getBalanace()
	{
		return balance;
	}

}
