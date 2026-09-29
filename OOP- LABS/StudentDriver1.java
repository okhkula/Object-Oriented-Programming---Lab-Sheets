import java.util.*;
public class StudentDriver1
{
  static Scanner s=new Scanner(System.in);
public static void main(String [] args)
{
int count =0;//count the number of student details in array of st

Student [] st= new Student[50]; //creating array of st
Student std=new Student();//declare and initilize st
 while(true)
 {
   System.out.println("Enter Name, ID and GPA (Enter -99 to stop): " );
   String st1=s.next();//reading the data of students from the keyboard
   if(st1.equals("-99"))
   break;
   String stID=s.next();
   double g=s.nextDouble();
    st[count]=new Student(st1,stID,g);
    count++;
  }
int size=count;//size 
displayAllStudents(st,size);
Student lowest= StudentlowestGPA(st,size); // method lowest gpa 
System.out.println("Student with the lowest GPA: " + lowest);
 }
 
public static void displayAllStudents(Student [] st,int size)
{ 
  int i;
  for(i=0;i<size;i++)
  {
  st[i].Print();
  System.out.println();
  }
}

public static Student StudentlowestGPA(Student [] st,int size)
{
int low=0;
 double min=st[0].getGPA();
   for(int i=1;i<size;i++)
   {
     if(st[i].getGPA()<min)
     {
     min=st[i].getGPA();
     low=i;
     }
    }
    return st[low];
   }
   } 
     
  