
public class EmployeeDriver
{ 
 public static void main(String[] args)
 {
 
   
  Person [] P=new Person[8];
  
 P[0] = new Person("Ahmad", "Ali");
 P[1] = new FullTimeEmployee("Saeed", "ahmad", 50000, 4000);
 P[2] = new FullTimeEmployee("Amira", "Mahmoud", 35000, 3000);
 P[3] = new PartTimeEmployee("Amir", "Wissam", 50, 250);
 P[4] = new PartTimeEmployee("Latifa", "Mohd", 40, 450);
 P[5] = new FullTimeEmployee("Saod", "Mahmoud", 40000, 2000);
 P[6] = new Person("Mariam", "Ahmad");
 P[7] = new PartTimeEmployee("Fatima", "Wassim", 30, 150);
 
 FullTimeEmployee[] FT=new FullTimeEmployee[8];
 PartTimeEmployee[] PT=new PartTimeEmployee[8];
 int size=P.length;
int calc=CreateFullTimeArray(P,FT);
System.out.println("The number of full-time employees: "+calc);
int Calc=CreatePartTimeArray(P,PT);
System.out.println("The number of part-time employees: "+Calc);
System.out.println("Content of Array P:");
Display(P,size);
System.out.println("Content of Array FT:");
Display(FT,calc);
System.out.println("Content of Array FT:");
Display(PT,Calc);




}

public static int CreateFullTimeArray(Person[] P,FullTimeEmployee[] FT)
{
  int NumOfEmp=0;
  for(int i=0;i<8;i++)
  {
    if(P[i]instanceof FullTimeEmployee)
    {
    FT[NumOfEmp]=(FullTimeEmployee)P[i];
    NumOfEmp++;
    }
   }
   return NumOfEmp;
 }
 public static int CreatePartTimeArray(Person[] P, PartTimeEmployee[] PT)
{
  int NumOfEmp=0;
  for(int i=0;i<8;i++)
  {
    if(P[i]instanceof PartTimeEmployee)
    {
    PT[NumOfEmp]=(PartTimeEmployee)P[i];
    NumOfEmp++;
    }
   }
   return NumOfEmp;
 }
 
 public static void Display(Person [] TAB,int size)
 {
  
    int i=0;
   for(i=0;i<size;i++)
   TAB[i].print();
   }
    }
 


