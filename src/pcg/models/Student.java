package pcg.models;

public class Student {
	private int id ;
	private String name;
	
	public Student(int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void  setID(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
}
