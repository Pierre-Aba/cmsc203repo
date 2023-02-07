/*
 * Class: CMSC203 
 * Instructor:Grigoriy Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 02/20/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Pierre Aba
*/


import java.util.Scanner;
public class WifiDiagnosis {
final static String PROGRAMMER_NAME = "Pierre Aba"; //Global variable
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		final String YES = "yes", NO = "no",DECISION_PROMPT = "Did that fix the problem?";
		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.");
		System.out.println("\nReboot the computer and try to connect\n"+DECISION_PROMPT);
		String answer = sc.nextLine();
		if(answer.equalsIgnoreCase(NO))
		{
			System.out.print("Make sure the cables connecting the router are firmly plugged in "
					+"and power is getting to the router\n"+DECISION_PROMPT);
			answer = sc.nextLine();
			if(answer.equalsIgnoreCase(NO))
			{
				System.out.print("Move the computer closer to "
						+"the router and try to connect\n"+DECISION_PROMPT);
				answer = sc.nextLine();
				if(answer.equalsIgnoreCase(NO))
					System.out.print("Contact your ISP\n");
				else if(answer.equalsIgnoreCase(YES))
					System.out.print("\nDone\n");
				else
					System.out.print("\nInvalid answer; try again\n");
			}
			else if(answer.equalsIgnoreCase(YES))
				System.out.print("\nDone\n");
			else
				System.out.print("\nInvalid answer; try again\n");
		}
		else if(answer.equalsIgnoreCase(YES))
			System.out.print("\nDone\n");
		else
			System.out.print("\nInvalid answer; try again\n");

		System.out.print("Programmer: "+PROGRAMMER_NAME);
	}

}
