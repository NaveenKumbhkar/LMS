package pcg.services;
import java.util.*;
import pcg.models.*;

public class StudentService {
	
	ArrayList<Student> lOS = new ArrayList<>();
	static int id = 100; 
	//String name ;
	
	public void registerStudent(Scanner sc)
	{
		System.out.print("Enter Student name : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		
		Student st = new Student(id,name);
		
		lOS.add(st);
		id++;
		
		System.out.println("Student is registered successfully...");
	}
	
	public void viewAllStudents()
	{
		System.out.println("All registered students : ");
		for(int i=0; i<lOS.size();i++)
		{
			System.out.println("Name : "+lOS.get(i).getName()+" , ID :"+lOS.get(i).getID());
		}
	}
}
