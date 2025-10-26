package pcg;
import java.util.*;

import pcg.services.*;


public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentService();
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
			}
			
		}while(true);
	}

}
