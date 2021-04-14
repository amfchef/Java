package Johansson;
import java.util.Scanner;
public class calculator {
	   
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);  //creating a new Scanner
	        
	        boolean continuePlaying = true;	//creating a boolean to be able to return to main menu
	        String equals = " = ";
	        
	        while (continuePlaying)	//creating a while loop to loop back if the boolean is true.
	        {
	            String menuChoice = "0";	//creating a string to save the user's input
	            boolean back = true;	//creating a backup returning boolean to return to main menu
	            //this text below are showing the main menu, and the user can choose a number between 1-5
	            System.out.println("Created by: Jakob Johansson\n01/09/2020\nWelcome to your calculator!");
	            System.out.println("Which operator would you like to use?\nPlease enter from the menu below");
	            System.out.println("[1] [+] [Addition]");
	            System.out.println("[2] [-] [Subtraction]");
	            System.out.println("[3] [x] [Multiplication]");
	            System.out.println("[4] [/] [Division]");
	            System.out.println("[5] [Exit the calculator]");
	            menuChoice = input.nextLine();	//the user's input will be saved in the integer "menuChoice"
	            try	//exception handler, in case the user enters something the programming cant handle.
	            {
	               Integer.parseInt(menuChoice);	//this will convert the string to int
	            }
	            catch(NumberFormatException ex)	//the code below will be executed in case something is wrong with the user's input
	            {
	            System.out.println("Enter a valid number!");	
	            back = false;
	            menuChoice = "0";	//the "menuChoice" will be reset to 0, so the user can enter another input
	            }  
	            int menuInput = Integer.parseInt(menuChoice);	//creating an integer that will be equals the user's input
	            												//this is because an if statement below will work
	            double num1 = 0;	//two doubles was created to store the user's two numbers that will be used in the calculation
	            double num2 = 0;
	            String operator = "";	//a string was created to store which operator that will be used
	            double result = 0;		//a double was created to show the result to the user.
	            if (menuInput == 1 || menuInput == 2 || menuInput == 3 || menuInput == 4)	
	            {//is statement, this will only be executed if the user's input is a number between 1 and 4
	                try//this is an exception handle to see if the user enters from format or else.
	                {
	                System.out.println("Please enter your first number you wish to use: ");
	                num1 = input.nextDouble();
	                System.out.println("Please enter your second number you wish to use: ");
	                num2 = input.nextDouble();		//this will save the input from the user to num1 and num2
	                }
	                catch(Exception e)
	                {	//the below code will be executed if there is something wrong with the num1 or num2.
	                    System.out.println("Error!\nYour input is invalid\nPlease return to the main menu, to try again");
	                    back = false;	//this will let the user go back to the main meny, as the user needs to enter new nums
	                    menuChoice = "0";	//reset string	
	                    operator = "0";		//reset string
	                }
	            }
	            switch (menuChoice)	//creating a switch statement, that will execute the following code, depending which menuchoice the user's input is.
	            {
	                case "1":
	                    result = Addition(num1, num2);	//calling the Addition method
	                    operator = " + ";				//saving which operator symbol, in the string
	                    break;	
	                case "2":
	                    result = Subtraction(num1, num2);
	                    operator = " - ";
	                    break;
	                case "3":
	                    result = Multiplication(num1, num2);
	                    operator = " X ";
	                    break;
	                case "4":
	                    result = Division(num1, num2);
	                    operator = " / ";
	                    break;
	                case "5":
	                    System.out.println("Thanks for playing!\nHave a great day!");	//exit text will show, and the user will exit the loop
	                    continuePlaying = false;
	                    back = false;
	                    break;
	                default:
	                    System.out.println("Error!\nYour input is invalid\nPlease try again\n");	//if the user enters something else than 1-5 this will be shown, "Error"
	                    back = false;	//returning to main menu
	                    
	            }
	     
	            if (operator == " + " || operator == " - " || operator == " X " || operator == " / " || back == true)
	            {//this will be executed if the user's menuchoice are a num between 1-4. It need to access a calculation in order to ask the user for two numbers to calculate
	            	//double roundOff = Math.round(result * 100)/100;
	            	
	            	System.out.format("%.1f %s %.1f %s %.1f", num1, operator, num2, equals, result);
	            	
	                //showing the entire calculation to the user and also rounding up or down to one decimal
	                
	                String number1 = "num1"; String number2 = "num2"; String resultArray = "result";
	                String[] list = {number1, operator, number2, resultArray};
	                
	                
	                
	                System.out.println("\nPress any key, to return to the main menu...");	//this will let the user press any key to continue
	                try
	                {        
	                    System.in.read();
	                }
	                    catch(Exception e)
	                {	
	                    e.printStackTrace();
	                }
	            }
	        }   
	        
	    }//below are the methods that will be used for the calculations
	    public static double Addition(double num1, double num2)
	    {  
	        return num1 + num2;
	    }
	    public static double Subtraction(double num1, double num2)
	    {
	        return num1 - num2;
	    }
	    public static double Multiplication(double num1, double num2)
	    {
	        return num1 * num2;
	    }
	    public static double Division(double num1, double num2)
	    {
	        return num1 / num2;
	    }
	}