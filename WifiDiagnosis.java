/*
 * Class: CMSC203 22377
 * Instructor:Professor Gary Thai
 * Project 1.
 * Description: This is an application that steps through trouble shooting steps
 * to diagnose a Wi-Fi that connects to the internet that may not be functioning 
 * as intended. By using a flow-diagram the program is able to offer trouble shooting 
 * steps intended to help  restore internet connectivity.
 * Due: 09/18/2022
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: George Ngatha
*/


import java.util.Scanner;

/**
	This program/application steps through a series of questions 
	to help diagnose Wifi internet connection problems
 **/

public class WifiDiagnosis 
{
	public static void main(String[] args)
	{
		String programmerName = "George Ngatha";
		char answer;    //To hold 'y' or 'n'
		String input;  //To hold input "Yes" or "yes" or "No" or "no".
	  
		
		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		
		do
		{
		//State Purpose of this application
		System.out.println("If you have a problem with internet connectivity this " 
					+ "WiFi Diagnosis might work.\n");
		
		//Initiate diagnosis with First Prompt
		System.out.println("First Step: Reboot the computer and try to reconnect ");
		System.out.println("Did that fix the problem? (Yes or No)");
		input = keyboard.nextLine(); //Read input
		answer = input.charAt(0);    //Read the first char
		
	if (answer == 'Y' || answer == 'y')
		{
			System.out.println("Rebooting your computer seemed to work");
			System.out.println("Wi-Fi Diagnosis Complete");
			System.out.println("programmer name: " + programmerName);
			break;
		}
		else if (answer == 'N' || answer == 'n')
		{
			System.out.println("Second step: Reboot your computer");
			System.out.println("Did that fix the problem? (Yes or No)");
			input = keyboard.nextLine(); //Read input
			answer = input.charAt(0);    //Read the first char
		}
		 if (answer == 'Y' || answer == 'y')
			{
			 System.out.println("Rebooting your computer seemed to work");
				System.out.println("Wi-Fi Diagnosis Complete");
				System.out.println("programmer name: " + programmerName);
				break;
			}
		 
		else if (answer == 'N' || answer == 'n')
			{
			System.out.println("Third step: Make sure the cables connecting "
								+ "the router " +
								"are firmly plugged in and power is " +
								"getting to the router");
			System.out.println("Did that fix the problem? (Yes or No)");
			input = keyboard.nextLine();
			answer = input.charAt(0); 
			}
		if (answer == 'Y' || answer == 'y')
			{
				System.out.println("Wi-Fi Diagnosis Complete");
				System.out.println("programmer name: " + programmerName);
			}
			else if (answer == 'N' || answer == 'n')
			{
				System.out.println("Fourth step: move the computer closer to "
						+ " the router and try to connect");
				System.out.println("Did that fix the problem? (Yes or No)");
				input = keyboard.nextLine();
				answer = input.charAt(0); 
			}
			if (answer == 'Y' || answer == 'y')
			{
				System.out.println("Wi-Fi Diagnosis Complete");
				System.out.println("programmer name: " + programmerName);
				break;
			}
			else if (answer == 'N' || answer == 'n')
			{
				System.out.println("Fifth step: Contact your ISP");
				System.out.println("Make sure your ISP is connected to your router");
				System.out.println("Do you want to run the diagnosis again? "
						+ "(Yes or No)");
				input = keyboard.nextLine();
				answer = input.charAt(0); 
			}
			else
			{
				System.out.println("Invalid entry, please try again");
				System.out.println("Programmer name: " + programmerName);
			}
		}while(answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n' );

}

			
	}

			
			
			
		



	
		
		
	
	

		
	
		