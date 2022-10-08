
import java.util.*;

public class atm {
	public static void main(String[]args) {
		while(true) {
			int a1 = 1234;
			String a2 = "aditya";

			Scanner obj = new Scanner(System.in);

			System.out.println("Enter a username");
			String name = obj.next();

			System.out.println("Enter a password");
			int password =obj.nextInt();
			
			
			if (name.equals(a2) && password==a1) {
				
				System.out.println("\nHello mr "+a2+ " Welcome to ATM \n");
				int balance = 10000;
				while(true) {
					System.out.println("Welcome to ATM machine");
					System.out.println("1) withdraw");
					System.out.println("2) Deposite");
					System.out.println("3) check balance");
					System.out.println("4)  exit");
					
					System.out.println("----Select One Option------------- ");
					int number  = obj.nextInt();
					
					switch(number) {
					case 1:
						System.out.println("how much u want to withdraw");
						int withdraw=obj.nextInt();
						if(balance>=withdraw) {
							balance = balance-withdraw;
							System.out.println("done");
						}else {
							System.out.println("Not enough balance :( \n ");
						}
					break;
					case 2:
						System.out.println("how much u want to deposite");
						int deposite=obj.nextInt();
						balance = balance+deposite;
						System.out.println("Money Deposite Sucessfully :) \n");		
					break;	
					case 3:
						System.out.println("current balance is : "+balance+"\n");
					break;	
					default :
						System.out.println("enter invalid option \n");
					break;	
					
					case 4 :
						System.exit(0);
						System.out.println(" ");
					}	
				}		
			}else {
				System.out.println("\n Invalid Username or Password ");
				System.out.println("      Please Try Again :) \n");
			}
			
			
			

		}
			}
	
}
