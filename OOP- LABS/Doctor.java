public class Doctor
{
   private String Name;
   private int Salary;
 
public Doctor()
{
  Name="";
  Salary=0;
}
public Doctor(String name,int salary)
{
 Name=name;
 Salary=salary;
}
public void setData(String name,int salary)
{
  Name=name;
  Salary=salary;
}
public String getName()
{
 return Name;
}
public int getSalary()
{
 return Salary;
}
}
 