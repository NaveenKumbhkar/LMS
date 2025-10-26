package pcg;
import java.util.*;

import pcg.services.*;


public class Main {
	StudentService studentService = new StudentService();
	InstructorService instructorService = new InstructorService();
	public void menuFun()
	{
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("============ Learning Managment System ==============");
			System.out.println();
			System.out.println("Enter 1 for Enroll Student");
			System.out.println("Enter 2 for view all students");
			System.out.println("Enter 3 for Intructor login");
			System.out.println("Enter 4 for Exit");
			System.out.print("Enter your choice : ");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				studentService.registerStudent(sc);
				break;
			case 2:
				studentService.viewAllStudents();
				break;
			case 3:
				instructorService.instructorLogin(sc);
				break;
			case 4:
				System.out.println("\nThank you for visiting. Please come again....");
				sc.close();
				System.exit(0);
			default :
				System.out.println("Please enter valid option");
			}
			
		}while(true);		
	}
	public static void main(String args[])
	{
		Main m = new Main();
        m.menuFun();
	}

}
