package pcg.services;

import java.util.Scanner;


public class InstructorService {
	String userName = "admin";
	String password = "12345";
	CourseService courseService = new CourseService();
	
	public void instructorLogin(Scanner sc)
	{
		
		System.out.print("Enter your user name : ");
		sc.nextLine();
		String userN = sc.nextLine();
		System.out.print("Enter your password : ");
		//sc.nextLine();
		String pass = sc.nextLine();
		
		if(userName.equals(userN) && password.equals(pass))
		{
			System.out.println("\nWelcome to Intructor Menu\n");
            while(true)
            {
            	System.out.println("\n========= Intructor Menu ==========\n");
    			System.out.println("Enter 1 for Create Course");
    			System.out.println("Enter 2 for view all courses");
    			System.out.println("Enter 3 for Enroll student in course");
    			System.out.println("Enter 4 for Exit");
    			System.out.print("Enter your choice : ");
    			
    			int ch = sc.nextInt();
    			
    			switch(ch)
    			{
    			case 1:
    				courseService.createCourse(sc);
    				break;
    			case 2:
    				courseService.viewAllCourses();
    				break;
    			case 3:
    				System.out.println("incomplete...");
    				break;
    			case 4:
    				System.out.println("Instructor logout successfully");
    				return;
    			default :
    				System.out.println("Please enter valid option");
    			}          	
            }
		}
		else
		{
			System.out.println("\nIncorrect user name or password..... \n");
		}
	}
	

}
