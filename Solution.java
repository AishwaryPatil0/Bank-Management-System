package com.icici;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Welcome to ICICE Bank");
		System.out.println("----------------");
		 Bank bank= new BankImpl(5000);
        while(true)
        {
        	 
        	System.out.println("1.Deposite\n2.Withdraw amount\n3.checkBalance");
        	System.out.println("4.Exit\nEnter Choice");
        	int choice=ip.nextInt();
        
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Enter the amount to be Deposite:");
        		int amountToDeposite=ip.nextInt();
        		bank.deposite(amountToDeposite); //bank.deposite(ip.nextInt());
	             break;
	         
	        case 2:
	        	 System.out.println("Enter the amount to be Withdraw:");
	        	 int amountToWithdraw=ip.nextInt();
	        	 bank.withdraw(amountToWithdraw);	//bank.withdraw(ip.nextInt());
		         break;
		         
		    case 3:
		         System.out.println("Available Balance: Rs."+bank.getBalanace());
			     break;
			         
			case 4:
			     System.out.println("Thank you! Visit again!");
			     System.exit(0);
				  break;
				         
			default:
			   try {
				   throw new InsuffcientChoiceException("insuffienent balance");
			   }
			   catch (Exception e)
			   {
				   System.out.println(e.getMessage());
			   }
				
        	}
        	System.out.println("--------------");
        }
	}

}
