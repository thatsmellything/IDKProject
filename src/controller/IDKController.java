package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;
//allows for keyboard inputs

public class IDKController
{

	
	public void start()
	{
		loops();
		moreInput();
		
	//	System.out.println("Standard output for java :D");
	//	System.out.println("boom next line bois!");
	//	System.out.print("same line text but on different line text for code!");
	//	System.out.print("gotta mind the spaces!");
	//	System.out.println(" ");
		
	//	questions();
		//Call the other method using this method
	}
	
	private void questions()
	{
		System.out.print("What is the meaning to life? ");
		
		Scanner inputScanner = new Scanner(System.in);
				//Using a scanner to record what the user types. System.in is the keyboard 
				//and it is the parameter for the Scanner. You must have the parameter for it to 
				//function and others can include mouse or whatever but this time it is the keyboard.
				//YOU MUST USE NEW IN JAVA WHEN MAKING AN INSTANCE!
		String answer = inputScanner.nextLine();
				//Create a string of the answer the user types
		System.out.println(answer);
				//Prints the things typed down in the console back on the screen on a new line
				//Scanners process input into strings
				//Constructors build the object
		
		System.out.print("What is your name? ");
		answer = inputScanner.next();
		System.out.println("So your first name is " + answer +"? ");
		String nameq = inputScanner.nextLine();
		nameq = inputScanner.nextLine();
		while(nameq.equals("yes") == false)
			//Needs to be while because if only goes through the loop once. .equals("x") compares text pretty much.
			//super nifty little thing for adventure or text based things.
		{
			System.out.println("Ah darn, what is it then?  ");
			answer = inputScanner.nextLine();
			System.out.println("So your first name is " + answer +"? ");
			nameq = inputScanner.nextLine();
		}
			
		System.out.println("Nice! Do you play any sports? ");
		String sports = inputScanner.next();
		
		if(sports.equals("no"))
		{
			System.out.println("Thats Okay! But you should maybe try one sometime! ");
		}
			else
			{
			System.out.println("That sounds like so much fun, sports are great! ");
			}
		System.out.println("I've gotta go but it was fun talking with you! ");
		inputScanner.close();
		
	
	}

	private void moreInput() 

	{
		Scanner anotherInputScanner;
		
		anotherInputScanner = new Scanner(System.in);
		//Constructor is "Scanner" and the "System.in" is the default scanner for keyboard input.
		
		System.out.println("What is the meaning of life, the universe, and everything?");
		
		int answer = anotherInputScanner.nextInt();
		System.out.println("You typed: " + answer);
		anotherInputScanner.nextLine();
		//Used to consume the enter key pressed. AKA ignore the returned string value
		System.out.print("Words- Why the error? Type a guess?");
		String secondResponse = anotherInputScanner.nextLine();
		System.out.println(secondResponse);
		double magicnumber;
		//doubles hold decimals
		
		System.out.println("Type in a fractinal number aka decimal");
		magicnumber = anotherInputScanner.nextDouble();
		System.out.println(magicnumber);
		
		
		anotherInputScanner.close();
	}

	
	//--------Catch ERRORS------------
	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		//Immediately assign create and make a value equal to something. then return that
		try
		{
			Integer.parseInt(example);
			isValid = true;
			
		}
		
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valid number boi");
		}
		return isValid;
		//always put return at the bottom for the boolean or else you get red death
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating values are allowed for input");
		}
		
		return isValid;
	}
	
	//You can only use == for ints and booleans
	
	
	
	//While loops need a predefined variable and that variable must change at some point otherwise it will be infinite
	// loop an dyou will be a sad boi
	private void loops()
	{
		int count = 0;
		boolean isDone = false;
		while (!isDone)
		{
			count++;
			JOptionPane.showMessageDialog(null, "Brother may i have some oats");
			if(count>10)
			{
				isDone=true;
			}
		}
		int ab = 0;
		while (ab <= 10)
		{
			JOptionPane.showMessageDialog(null, ab);
			ab++;
		}
	}
}
