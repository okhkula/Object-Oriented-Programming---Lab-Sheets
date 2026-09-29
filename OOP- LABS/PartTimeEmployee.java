public class PartTimeEmployee extends Person
{
 private double wageRate;
 private double workedHours;

public PartTimeEmployee()
{
  super();
  wageRate=0;
  workedHours=0;
 }

public PartTimeEmployee(String fname, String lname,double R,double H)
 {
 super(fname,lname);
   wageRate=R;
  workedHours=H;
 }
 public void setPartTimeEmployee(String fname, String lname,double R,double H)
 {
  super.setPersonData(fname,lname);
   wageRate=R;
  workedHours=H;
  
 }
 
 public double getwageRate()
 {
  return wageRate;
 }
  
  public double getworkedHours()
  {
   return workedHours;
  }
 public void print()
 {
    super.print();
    System.out.println("partTimeEmployee: " +wageRate+""+workedHours);
  }

public void calcTotalPay()
{
  double TotalPay=wageRate * workedHours;
   System.out.println("Total pay: "+TotalPay);
  
 }

}