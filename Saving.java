package edu.gcu.cst105.week3.friday;
import java.util.Scanner;
public class Saving extends Account {
	
	Scanner sc = new Scanner(System.in);
	private double serviceFee;
	private double annualInterestRate;
	private double minBalance;
	
	public double getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
		
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
		
	}
	
	public Saving (double balance, String account) {
		
	}
	
}
