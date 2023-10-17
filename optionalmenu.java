package ATM;
import java.util.*;
import java.io.IOException;
import java.util.HashMap;
import java.text.DecimalFormat;

public class optionalmenu extends account1 {
	
	
	public optionalmenu(int customerNumber, int pinNumber, double checkingBalance, double savingBalance) {
		super(customerNumber, pinNumber, checkingBalance, savingBalance);
		// TODO Auto-generated constructor stub
	}
	
	Scanner menuInput=new Scanner(System.in);        
	DecimalFormat moneyFormat= new DecimalFormat("'$'####,##0.00");
	
	HashMap<Integer,HashMap<String,Integer>> Data = new HashMap<>(); 
	/*
	/*
	 {
	  "roger" : 10000,
	  "divakar" : 20000
	  }
	 * 
	 */
	
	public void getRegistered() {
		System.out.println("Please Enter the customer no: ");
		int cn = menuInput.nextInt();
		System.out.println("Enter the following details: \n");
		System.out.println("choose a  pin: \n");
		int pin= menuInput.nextInt();
		HashMap<String,Integer> data=new HashMap<>();
		data.put("pinNumber", pin);
		data.put("savingBalance", 0);
		data.put("currentBalance", 0);
		Data.put(cn, data);
	}
	
	public void getlogin() throws IOException{
		
		int flag=1;
		do {
			
			try {					
					System.out.println("Welcome to the ATM");
					System.out.println("Enter the customer number");
					setCustomerNumber(menuInput.nextInt());
					
					
				}
				catch (Exception e) {
					System.out.println("/n " +"invalid characters"+ "/n");
					
					flag=0;
				}
			
			 
        int cn=getCustomerNumber();
        HashMap<String,Integer> customerDetails = Data.get(cn);
        if (customerDetails.get("pinNumber") == getPinNumber()){
           getAccountType();

       } else 
            System.out.println("\n"+ "Wrong Customer Number or pin Number" + "\n");
       } while (flag==1);
}

public void getAccountType(){
System.out.println(" Select the account type you want to access");
System.out.println("Type 1 for Checking Account");
System.out.println("Type 2 for saving Account");
System.out.println("Type 3 to exit");


int selection = menuInput.nextInt();

switch(selection){

case 1:
getChecking();
break;

case 2:
getSaving();
break;

case 3:
System.out.println("Thank you for using the ATM");
break;

default:
System.out.println("Thank you for using the ATM");
getAccountType();


}
}

public void getChecking(){
System.out.println(" Checking Account");
System.out.println("Type 1 to view the balance");
System.out.println("Type 2 to make a withdraw");
System.out.println("Type 3 to make a deposit");
System.out.println("Type 4 to exit ");
System.out.println("Choice");


int selection = menuInput.nextInt();

switch(selection){

case  1:
System.out.println("Checking Account Balance");
getAccountType();
break;

case 2:
getCheckingWithdrawInput();
getAccountType();
break;

case 3:
getCheckingDepositInput();
getAccountType();
break;

case 4:
System.out.println("Thank you for using the ATM, bye!");
break;

default:
System.out.println("invalid choice");
getChecking();

   }
}

		public void getSaving(){
					System.out.println(" Saving Account");
					System.out.println("Type 1 to view the balancet");
					System.out.println("Type 2 to make a withdrawt");
					System.out.println("Type 3 to make a deposit");
					System.out.println("Type 4 to exit ");
					System.out.println("Choice");
		
					int selection = menuInput.nextInt();
					switch(selection){
					
						case 1:
						System.out.println("Checking Account Balance");
						getAccountType();
						break;
						
						case 2:
				        getCheckingWithdrawInput();
						getAccountType();
						break;
						
						case 3:
						getCheckingDepositInput();
						getAccountType();
						break;
						
						case 4:
						System.out.println("Thank you for using the ATM, bye!");
						break;
						
						default:
						System.out.println("invalid choice");
						getChecking();
					
					}
										
		}
			
} // end of the class
	
/*/*
 * 
 HashMap<String,HashMap<String, String>> hm =new HashMap<>();
 
 # for adding data in hm
 hm.put("c00003", {"pinNumber" : "1234",
 	"savingBalance": "$0",
 	"currentBalance": "$0"
});

# for getting element from hm
hm.get("c00003")

 {
 "C00001": {
 	"pinNumber" : "4080",
 	"savingBalance": "$20,000",
 	"currentBalance": "$30,000"
 },
 "C00002": {
 	"pinNumber" : "5091",
 	"savingBalance": "$40,000",
 	"currentBalance": "$70,000"
 }
 }
 */


