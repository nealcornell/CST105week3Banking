package edu.gcu.cst105.week3.friday;
import java.util.Scanner;

public class Checking extends Account {
	
	Scanner sc = new Scanner(System.in);	
	private double overDraft;

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
				
	}
	
	public  double doWithdraw(double amount) {
		return (amount);
		
	}
	
	public Checking (double balance, String account) {
		
	}

}
