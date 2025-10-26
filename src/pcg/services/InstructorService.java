package pcg.services;

import java.util.Scanner;

public class InstructorService {
	String userName = "naveen@124";
	String password = "12345";
	
	public void instructorLogin(Scanner sc)
	{
		System.out.print("Enter your user name : ");
		String userN = sc.nextLine();
		System.out.print("Enter your password : ");
		String pass = sc.nextLine();
		
		if(userName.equals(userN) && password.equals(pass))
		{
			System.out.println("Welcome to Intructor Menu");
			System.out.println("Enter 1 for Create Course");
			System.out.println("Enter 2 for view all courses");
			System.out.println("Enter 3 for Enroll student in course");
			System.out.println("Enter 4 for Exit");
			System.out.print("Enter your choice : ");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				
			}
		}
	}
	

}
