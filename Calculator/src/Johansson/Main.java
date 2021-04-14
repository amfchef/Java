package Johansson;

import java.util.Scanner;
public class Main
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        
        boolean continuePlaying = true;
        
        
        while (continuePlaying)
        {
            String menuChoice = "0";
            boolean back = true;
            System.out.println("Created by: Jakob Johansson\n01/09/2020\nWelcome to your calculator!");
            System.out.println("Which operator would you like to use?\nPlease enter from the menu below");
            System.out.println("[1] [+] [Addition]");
            System.out.println("[2] [-] [Subtraction]");
            System.out.println("[3] [x] [Multiplication]");
            System.out.println("[4] [/] [Division]");
            System.out.println("[5] [Exit the calculator]");
            menuChoice = input.nextLine();
            try
            {
               Integer.parseInt(menuChoice);
            }
            catch(NumberFormatException ex)
            {
            System.out.println("Enter a valid number!");
            back = false;
            menuChoice = "0";
            }  
            int menuChoice2 = Integer.parseInt(menuChoice);
            double num1 = 0;
            double num2 = 0;
            String operator = "";
            double result = 0;
            if (menuChoice2 == 1 || menuChoice2 == 2 || menuChoice2 == 3 || menuChoice2 == 4)
            {
                try
                {
                System.out.println("Please enter your first number you wish to use: ");
                num1 = input.nextDouble();
                System.out.println("Please enter your second number you wish to use: ");
                num2 = input.nextDouble();
                }
                catch(Exception e)
                {
                    System.out.println("Error!\nYour input is invalid\nPlease return to the main menu, to try again");
                    back = false;
                    menuChoice = "0";
                    operator = "0";
                }
            }
            switch (menuChoice)
            {
                case "1":
                    result = Addition(num1, num2);
                    operator = "+";
                    break;
                case "2":
                    result = Subtraction(num1, num2);
                    operator = "-";
                    break;
                case "3":
                    result = Multiplication(num1, num2);
                    operator = "X";
                    break;
                case "4":
                    result = Division(num1, num2);
                    operator = "/";
                    break;
                case "5":
                    System.out.println("Thanks for playing!\nHave a great day!");
                    continuePlaying = false;
                    back = false;
                    break;
                default:
                    System.out.println("Error!\nYour input is invalid\nPlease try again\n");
                    back = false;
                    
            }
     
            if (operator == "+" || operator == "-" || operator == "X" || operator == "/" || back == true)
            {
                
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                String number1 = "num1"; String number2 = "num2"; String resultArray = "result";
                String[] list = {number1, operator, number2, resultArray};
                
                
                
                System.out.println("\nPress any key, to return to the main menu...");
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
        
    }
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
    public static String Menu()
    {
        String menuChoice= "0";
        Scanner input = new Scanner(System.in); 
        System.out.println("Created by: Jakob Johansson\n01/09/2020\nWelcome to your calculator!");
            System.out.println("Which operator would you like to use?\nPlease enter from the menu below");
            System.out.println("[1] + [Addition]");
            System.out.println("[2] + [Subtraction]");
            System.out.println("[3] + [Multiplication]");
            System.out.println("[4] + [Division]");
            System.out.println("[5] + [Exit the calculator]");
            menuChoice = input.nextLine(); 
            try
            {
               Integer.parseInt(menuChoice);
            }
            catch(NumberFormatException ex)
            {
            System.out.println("Enter a valid number!");
            
            }  
            return menuChoice;
    }
    
}