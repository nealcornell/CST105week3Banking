package edu.gcu.cst105.week3.friday;

import java.util.Scanner;

public class Bank {
	
	private String name;
	Scanner sc = new Scanner(System.in);
    static Bank bank = new Bank("GCU Credit Union");
	
	public static void main(String[] args) {		
		
		 Saving saving = new Saving(5000.00, "191923");
		 Checking checking = new Checking(5000.00, "991773");
		 checking.setBalance(5000.00);
		 saving.setBalance(5000.00);
		 saving.setServiceFee(25.00);
		 saving.setMinBalance(200.00);
		 checking.setOverDraft(45.00);
		 saving.setAnnualInterestRate(.06);
		 bank.displayMenu(checking, saving);		 
	}
	
	Bank(String name) {
				this.name = name;				
			}	

	private void displayMenu(Checking checking, Saving saving) {
		int option;
		do {
			System.out.println("=========================");		
			System.out.println("        MAIN MENU");
			System.out.println("        "+ this.name.toUpperCase());
			System.out.println("=========================");
			System.out.println("Pick an option: ");
			System.out.println("---------------------");
			System.out.println(" 1:  : Deposit to Checking");
			System.out.println(" 2:  : Deposit to Savings");
			System.out.println(" 3:  : Write a Check");
			System.out.println(" 4:  : Withdraw from Savings");
			System.out.println(" 5:  : Get Balance");
			System.out.println(" 6:  : Close Month");
			System.out.println("---------------------");
			System.out.println(" 9:  : Exit");
			option = sc.nextInt();
			sc.nextLine();
			this.actionMenu(option, checking, saving);
		} while	 (option != 9);		
	}	
	private void actionMenu(int option, Checking checking, Saving saving) {
		if (option == 1) {
		bank.displayDepositChecking(checking);}
		else if (option == 2) {
		bank.displayDepositSaving(saving);}	
		else if (option == 3) {
		bank.displayWithdrawChecking(checking);}
		else if (option == 4) {
		bank.displayWithdrawSavings(saving);}
		else if (option == 5) {
		bank.displayBalanceScreen(checking, saving);}
		else if (option == 6) {
		bank.doEndMonth(checking,saving);}	
		else if (option == 9) {
		bank.displayExitScreen();	
		}
		}		
			
	private void doEndMonth(Checking checking, Saving saving) {
		double interest;
		interest = ((saving.getAnnualInterestRate()/12) * saving.getBalance());
		System.out.println("Your interest for the period is $" + interest);
		if (saving.getBalance() < saving.getMinBalance()) {
			System.out.println("You have been assessed a service fee of $"  + saving.getServiceFee());
			System.out.println("Thank you for your contribution,  Quit overspending!");
		}
		System.out.println("Your savings balance is $" + (saving.getBalance() + interest));
		System.out.println("Your checking balance is $" + ((checking.getBalance())));		
	}	
	private void displayExitScreen() {
		System.out.println("Thank you and have a great day!");
	}	
	private void displayBalanceScreen(Checking checking, Saving saving) {		
		System.out.println("Your checking balance is $" + checking.getBalance());
		System.out.println("Your savings balance is $ " + saving.getBalance());
	}	
	private void displayWithdrawSavings(Saving saving) {		
		System.out.println("Your savings balance is $" + saving.getBalance());		
		System.out.println("You will have a $" + saving.getServiceFee() + " service fee is balance is below $200.00 at end of the month!");
		System.out.println("How much to withdraw?");
		int amount = sc.nextInt();
		saving.setBalance(saving.getBalance() - amount);
		System.out.println(" Your balance is $" + saving.getBalance());
	}
	private void displayWithdrawChecking(Checking checking) {
		System.out.println("Your checking balance is $" + checking.getBalance());
		System.out.println("You will have a $" + checking.getOverDraft() + " overdraft fee if check amount is greater than balance.");		
		System.out.println("How much to withdraw?");
		int amount = sc.nextInt();
		if (amount > checking.getBalance()) {		
		checking.setBalance(checking.getBalance() - checking.getOverDraft() - amount);
		System.out.println( checking.getOverDraft() + "Fee Assessed! Ha Ha Ha  now you are really broke! ");}
		else {
			checking.setBalance(checking.getBalance() - amount);
		}
		System.out.println("Your balance is " + checking.getBalance());
	}			
	private void displayDepositSaving(Saving saving) {
		System.out.println("Your saving balance is $" + saving.getBalance());
		System.out.println("How much would you like to deposit?");
		int amount = sc.nextInt();
		saving.setBalance(saving.getBalance() + amount);
		System.out.println(" Your balance is $" + saving.getBalance());		
	}
	private void displayDepositChecking(Checking checking) {
		System.out.println("Your checking balance is $" + checking.getBalance());
		System.out.println("How much would you like to deposit?");
		int amount = sc.nextInt();
		checking.setBalance(checking.getBalance() + amount);
		System.out.println(" Your balance is $" + checking.getBalance());	
}
}



	
		



