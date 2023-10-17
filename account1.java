package ATM;
import java.util.*;

public class account1 {
	 int CustomerNumber;
	 int PinNumber;
	 double CheckingBalance;
	 double SavingBalance;
	 double amount;
	 
	 
	 Scanner input = new Scanner(System.in);
	 
	public account1(int customerNumber, int pinNumber, double checkingBalance, double savingBalance) {
		super();
		CustomerNumber = customerNumber;
		PinNumber = pinNumber;
		CheckingBalance = checkingBalance;
		SavingBalance = savingBalance;
	}


	public int getCustomerNumber() {
		return CustomerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}


	public int getPinNumber() {
		return PinNumber;
	}


	public void setPinNumber(int pinNumber) {
		PinNumber = pinNumber;
	}


	public double getCheckingBalance() {
		return CheckingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		CheckingBalance = checkingBalance;
	}


	public double getSavingBalance() {
		return SavingBalance;
	}


	public void setSavingBalance(double savingBalance) {
		SavingBalance = savingBalance;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
@Override
	public String toString() {
		return "account1 [CustomerNumber=" + CustomerNumber + ", PinNumber=" + PinNumber + ", CheckingBalance="
				+ CheckingBalance + ", SavingBalance=" + SavingBalance + ", amount=" + amount + "]";
	}


public double calcCheckingWithdrawal(double amount) {    //why????// instance
		
		CheckingBalance=(CheckingBalance-amount);
		return CheckingBalance;
	}
	
public double calcSavingWithdrawal(double amount) {    //why????//
		
		SavingBalance =(SavingBalance-amount);
		return SavingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {    //why????//
	
			CheckingBalance=(CheckingBalance+amount);
			return CheckingBalance;
		}
		
		public double calcSavingDeposit(double amount) {    //why????//
		
				CheckingBalance=(SavingBalance+amount);
			     return SavingBalance;
			}
		
		public void CheckingWithdrawInput() {
			System.out.println("Your Checking Account Balance is;"+CheckingBalance);
			System.out.print("How much do you want to withdraw from Checking Account?");
			double amount=input.nextDouble();
			
			if ((CheckingBalance-amount)>=0) {
				setCheckingBalance (amount);
				System.out.println("Your New Checking Account Balance;"+CheckingBalance);
			}
				
			else {
				
				
				System.out.println("Balance can not be negative"+ " ");
			}
}

		
		public void SavingWithdrawInput() {
			System.out.println(" Your Checking Account Balance;"+SavingBalance);
			System.out.print("Amount you want to withdraw from Saving Account");
			double amount=input.nextDouble();
			
			if ((SavingBalance-amount)>=0) {
				calcSavingWithdrawal (amount);
				System.out.println("Your New Saving Account Balance;"+SavingBalance);
			}
				
			else {
				
				
				System.out.println("Balance can not be negative"+ " ");
			}	
		
		
		
		
		}
		
		
		public void SavingDepositInput() {
			System.out.println("Your Saving Account Balance;"+SavingBalance);
			System.out.print("Amount you want to deposit");
			SavingBalance=SavingBalance + amount;
			double amount=input.nextDouble();
						
		}
		



public void CheckingDepositInput() {
	System.out.println("Your  Account Balance;"+CheckingBalance);
	System.out.print("Amount you want to deposit");
	CheckingBalance=CheckingBalance + amount;
	double amount=input.nextDouble();
				
}

}

