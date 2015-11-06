//Import the required API classes;
import java.util.Scanner;
import java.lang.String;

class SayHello
{
	public static void main(String args[])
	{
		//Create an instance of the scanner class to
		//use for the keyboard access.
		Scanner getName = new Scanner(System.in);
		
		//Create a variable to hold the user's name
		//This variable is designed to hold text.
		String userName;
		
		//Ask user's name and place this name in userName.
		System.out.print("what is your name?");
		userName = getName.nextLine();
		
		//Display a message to the user with the user's name in view.
		System.out.println("Hello" + " " + userName + "!");
	}
}