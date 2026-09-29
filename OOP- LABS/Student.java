public class Student
{
  private String Name;
  private String ID;
  private double GPA;
 
 public Student()
{
   Name=" ";
   ID=" ";
   GPA=0;
}
public Student(String Name, String ID, double GPA)
{
 this.Name=Name;
 this.ID=ID;
 this.GPA=GPA;
}
public void setStudent(String N, String id, double gpa)
{ 
   Name=N;
   ID=id;
   GPA=gpa;
}
public String getName()
{
  return Name;
}

public String getID()
{
 return ID;
}

public int getGPA()
{
  return GPA;

}
public void print()
{
  System.out.println("Student Name: "+Name);
  System.out.println("Student ID: "+ID);
  System.out.println("Student GPA: "+GPA);
}
 }   

  
  