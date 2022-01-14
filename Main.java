package Rashed;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//Global variables
	public static String[] items = {"55 and below", "above 55 to 60", "above 60 to 65", "above 65"  };
	public static double[] employee_rate = {20,13,7.5 ,5 };
        public static double[] employer_rate = {17,13,9,7.5 };
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Integer> orders = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		while (true)
		{

			System.out.println("#####################################\n \t Welcome to Pension Calculation System");
                        System.out.println("#####################################\n##################################### ") ;
                        System.out.println("Enter your choice (1,2,3,4): ");
			int choice = scan.nextInt();
			
                    switch (choice) {
                        case 1:
                          
                            chooseItem1();
                            break;
                        case 2:
                            chooseItem2();
                            break;
                        case 3:
                            chooseItem3();
                            break;
                        case 4:
                            chooseItem4();
                            break;
                            
                        default:
                            chooseItem0();
                            break;
                    }
		}
	}
	
	public static void chooseItem1()
	{
  System.out.println("Enter your Age: ");
                           int choice1 = scan.nextInt();
		System.out.println("Enter your salaty (Within AED 6000 only): ");
                int choice = 1 ;
                 int choice11 = scan.nextInt();
                            System.out.println("Your choice is: " + choice);
                            System.out.println("Your Age is: " + choice1);
                            System.out.println("Your Salary is: " + choice11);
                         
                System.out.println("Your pension Eligibility is: " + (choice11*(employee_rate[0]+ employer_rate[0])/100) +" AED");
                            
	}

	public static void chooseItem2()
	{System.out.println("Enter your Age: ");
                           int choice1 = scan.nextInt();
		System.out.println("Enter your salaty (Within AED 6000 only): ");
                int choice = 2 ;
                 int choice11 = scan.nextInt();
                            System.out.println("Your choice is: " + choice);
                            System.out.println("Your Age is: " + choice1);
                            System.out.println("Your Salary is: " + choice11);
                            
                System.out.println("Your pension Eligibility is: "+ (choice11*(employee_rate[1]+ employer_rate[1])/100) +" AED");
	}
	
	public static void chooseItem3()
	{
		System.out.println("Enter your Age: ");
                           int choice1 = scan.nextInt();
		System.out.println("Enter your salaty (Within AED 6000 only): ");
                int choice = 3 ;
                 int choice11 = scan.nextInt();
                            System.out.println("Your choice is: " + choice);
                            System.out.println("Your Age is: " + choice1);
                            System.out.println("Your Salary is: " + choice11);
                            
                System.out.println("Your pension Eligibility is: "+ (choice11*(employee_rate[2]+ employer_rate[2])/100) +" AED");
	}
        public static void chooseItem4()
	{
		System.out.println("Enter your Age: ");
                           int choice1 = scan.nextInt();
		System.out.println("Enter your salaty (Within AED 6000 only): ");
                int choice = 4 ;
                 int choice11 = scan.nextInt();
                            System.out.println("Your choice is: " + choice);
                            System.out.println("Your Age is: " + choice1);
                            System.out.println("Your Salary is: " + choice11);
                            
                System.out.println("Your pension Eligibility is: "+ (choice11*(employee_rate[3]+ employer_rate[3])/100) +" AED");
	}
         public static void chooseItem0()
	{
		System.out.println("invalid choice Please Re Enter : ");
                           
	}
}