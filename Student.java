package map;

public class Student {
	
	private int id;
	private String name;
	private String branch;
	private int marks;
	
	Student(int id,String name,String branch,int marks)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
	 return id;	
	}
	public void SetName(String name)
	{
	  this.name=name;	
	}
	public String  getName()
	{
	  return name;	
	}
	public void setBranch(String branch)
	{
	  this.branch=branch;	
	}
	public String getBranch()
	{
	return branch;	
	}
	public void setMarks(int marks)
	{
	  this.marks=marks;	
	}
    public int getMarks()
    {
	 return marks;
	}
    public String toString()
    {
	return id+" "+name+" "+branch+" "+marks;	
	}
}
