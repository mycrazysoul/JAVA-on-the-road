//import required API classes
import java.util.Scanner;

//import the required API packages
import java.lang.*;

class SayHello2
{
	public static void main(String args[])
	{
		//create an instance of the Scanner class to use for keyboard access
		Scanner getName = new Scanner(System.in);
		
		//Create a variable to hold the user's name, this variable is designd to hold text
		String userName;
		
		//Ask the user's name and place this name in userName
		System.out.print("What is your name?");
		userName = getName.nextLine();
		
		//create a variable to hold the number of letters in the user's name
		Integer letterCount;
		
		//Get the number of letters in the user's name 
		letterCount = userName.length();
		
		//Display a message to the user with the user's name in view.
		System.out.println("Hello" + " " + userName + " " + "your name has" + " " + letterCount + " " + "letters in it!");
	}
}