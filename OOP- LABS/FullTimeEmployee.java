public class  FullTimeEmployee extends Person
{
  private double salary;
  private double bonus;
 
 public FullTimeEmployee()
 {
   super();
   salary=0;
   bonus=0;
 }
 public FullTimeEmployee(String fname, String lname,double s,double b)
 {
  super(fname,lname);
  salary=s;
  bonus=b;
 }
 
public void setFullTimeEmployee (String fname, String lname,double s,double b)
 {
  super.setPersonData(fname,lname);
  salary=s;
  bonus=b;
 }

 public double getsalary()
 {
  return salary;
 }

public double getbonus()
{
  return bonus;
}
 
 public void print()
  {
    super.print();
    System.out.println("FullTimeEmployee: " +salary+""+bonus);
  }
  
public void calcTotalPay(double salary,double bonus)
{
  double TotalPay=salary+bonus;
   System.out.println("Total pay: "+TotalPay);
  
 }

}
