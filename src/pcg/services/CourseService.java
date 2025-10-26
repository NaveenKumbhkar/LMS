package pcg.services;
import java.util.*;
import pcg.models.*;


public class CourseService {
	ArrayList<Course> lOC = new ArrayList<>();
	String courseName ;
	static int courseId = 1000;
	
	public void createCourse(Scanner sc)
	{
		System.out.print("Enter Course name : ");
		sc.nextLine();
		String name = sc.nextLine();
		
		
		Course cr = new Course(courseId,name);
		
		lOC.add(cr);
		courseId += 5;
		
		System.out.println("Course added successfully...");
	}
	
	public void viewAllCourses()
	{
		System.out.println("All Courses : ");
		for(int i=0; i<lOC.size();i++)
		{
			System.out.println("Course Name : "+lOC.get(i).getCourseName()+" , ID :"+lOC.get(i).getCourseId());
		}
	}
}
