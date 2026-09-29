import java.util.*;
public class Tester
{
static Scanner s=new Scanner(System.in);
  public static void main(String [] args)
  {
  String name,specialization,degree;
  int salary;
    surgeon S1=new surgeon();
    surgeon S2=new surgeon();
   
   System.out.println("Enter Surgeon 1 info: ");
   name=s.next();
   salary=s.nextInt();
   specialization=s.next();
   degree=s.next();
   S1.setData(name,salary,specialization,degree);
  
   System.out.println("Enter Surgeon 2 info: ");
   name=s.next();
   salary=s.nextInt();
   specialization=s.next();
   degree=s.next();
   S2.setData(name,salary,specialization,degree);
   
  
surgeon R=new surgeon();
 R=R.HigherSalary(S1,S2);
 R.print();
 

  }
  }
 
 

  