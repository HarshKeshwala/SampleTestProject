package application;

import java.util.Scanner; // used for input

import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args)
	{

		// declarations and initializations
		Account defaultAccount = new Account(); // represents an account object
		Account accTwo; // represents another an account object
		Scanner input =  new Scanner(System.in);

		String userName; // represents the user's name
		double userBalance; // repreents balance

		System.out.println("The default account: " + defaultAccount.getName()+","+defaultAccount.getBalance());


		// prompt the user
		/*System.out.println("Enter your name: ");
		userName = input.nextLine();
		System.out.println("Enter your balance: ");
		userBalance = input.nextDouble();*/

		userName = JOptionPane.showInputDialog("Enter your name : ");
		userBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance : "));

		// initialize accTwo
		accTwo = new Account(userName, userBalance);

		System.out.printf("The second account: %s , $%.2f",accTwo.getName(),accTwo.getBalance());


	}
}
