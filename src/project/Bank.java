//1. package concept is used to combine classes..
package project;
 
// this is import statements
import java.time.LocalDate;
import java.util.Scanner;
 // 2.Scanner class...
public class Bank extends BankAccount{
  // 3.public=> access modifier is used...	
  // 4.Extends=>  extends keyword is used to achive inheritance concept...
	Bank(String cname, String cid) {
		super(cname, cid);
 // 5.super=> super keyWord is used to refer variable...		
	}

	public static void main(String[] args)//main method
	{
		// 6.static=> static keyword
	  BankAccount obj=new BankAccount("IDBI","P1234d");
	  obj.showMenu();
	 Aaa aa=() ->{
		 System.out.println("Have A Nice Day");
	 };//7. java8 feature => lambda function is used to saved lines
	 aa.show();
 // 8.object concept is used to call methods...	  
	}

}
@FunctionalInterface// 9.Annotation is used
interface Aaa{ // 10. functional interface is used
	void show();// only one method
}
class BankAccount{//normal class
	// 11.class concept is used...
	int balance;//int datatype ,balance is variable
	int pin;
	int op;
	int previousTransaction;
	String customerName;//String is a class
	String customerId;
	   // 12.Datatype used...
	   // 13.Variable declaration...
	
	BankAccount(String cname,String cid){//parameterized constructor
		customerName=cname;
		customerId=cid;
		// 14.constructor is created...
	}

	void deposit(int amount) {// 15.userdefine method is created...
		if(amount !=0) {// 16.if statement is used...
			            // 17.conditional operator is used...
			balance=balance+amount;
			previousTransaction=amount;			
		}
	}
	void withdraw(int amount) {
		if(amount !=0) {
			balance=balance-amount;
			previousTransaction= -amount;			
		}		
	}
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("deposited:" + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("withdraw:"+Math.abs(previousTransaction));			
		}
		else {
			System.out.println(".....No Transaction occur.....");
		}
	}
	void showMenu() {
		char option= '\0';
		try (Scanner sc = new Scanner(System.in)) {// 18.try block is used 
			System.out.println("*=*=*=*Welcome"+customerName+"*=*=*=*");
			LocalDate localdate=LocalDate.now();// 19.java 8 feature added date
			System.out.println(localdate);
			System.out.println("Enter your Pin");
			pin=sc.nextInt();
			System.out.println("\n");
			
			System.out.println("Choose Your Account");
			System.out.println("A : current");
			System.out.println("B : saving");
			op=sc.next().charAt(0);
							
			System.out.println("A : Check Your Balance");
			System.out.println("B : Deposit Money");
			System.out.println("C : Withdraw Money");
			System.out.println("D : Previous Transactions");
			System.out.println("E : Exit");
			
			do {
				//20. dowhile loops is used
				System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
				System.out.println("Enter Your Option");
				System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
				option=sc.next().charAt(0); //String Convert
				System.out.println("\n");
				
				switch (option){
				  // switch statement is used
				case 'A':
					System.out.println("--------------------------------------------------");
					System.out.println("Balance ="+ balance);
					System.out.println("--------------------------------------------------");
					System.out.println("\n");
					break;
					
				case 'B':
					System.out.println("--------------------------------------------------");
					System.out.println("Enter An Amount To Deposite");
					System.out.println("--------------------------------------------------");
					int amount=sc.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("--------------------------------------------------");
					System.out.println("Enter An Amount To Withdraw");
					System.out.println("--------------------------------------------------");
					int amount2=sc.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;

				case 'D':
					System.out.println("--------------------------------------------------");
					getPreviousTransaction();
					System.out.println("---------------------------------------------------");
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("==== Thanks for using Application ====");
					break;

			   default:	
				   System.out.println("Invalid Option!!  Please Enter Correct Otpion");
				   break;
				}
			}
			while(option != 'E');
			}	
	}	
}

