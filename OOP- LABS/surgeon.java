public class surgeon extends Doctor
{
  private String specialization ;
  private String degree;
 
public surgeon()
{
  super();
  specialization="";
  degree="";
}
public surgeon(String name,int salary,String specialization, String degree)
{
 Doctor(name,salary);
 this.specialization=specialization;
 this.degree=degree;
}
public void setData(String name,int salary,String specialization, String degree)
{
 super.setData(name,salary);
 this.specialization=specialization;
 this.degree=degree;
}

public String getSpecialization()
{
  return specialization;
}
public String getDegree()
{
 return degree;
}
public void print()
{
  System.out.print("Name: "+getName());
  System.out.print(" Salary: "+getSalary());
  System.out.print(" Specialization: "+getSpecialization());
  System.out.print(" Degree: "+getDegree());
}

public surgeon HigherSalary(surgeon temp,surgeon temp1)
{
 if(temp1.getSalary()>temp.getSalary())
  return temp1;
 else
 return temp;
 
   }
 }