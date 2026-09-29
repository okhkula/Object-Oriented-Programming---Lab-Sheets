public class Student1 {
 private String name;
 private String ID;
 private double GPA;
 
 public Student(){
 name = "";
 ID = "";
 GPA = 0;
 }
  public Student(String n, String i, Double g){
 name = n;
 ID = i;
 GPA = g;
 }
 public void setStudent(String n, String i, Double g) {
 name = n;
 ID = i;
 GPA = g;
 }
 public String getName() 
 { return name;}
 public String getID() 
 { return ID;}
 public double getGPA()
  { return GPA;}
  
 public void makeCopy(Student temp)
 {
   name=temp.name;
   ID=temp.ID;
   GPA=temp.GPA;
  }
  
public Student getCopy()
{
  Student temp=new Student(name,ID,GPA);
  return temp;
 }

 public void Print(){
 System.out.println(name +" " + ID + " " + GPA);
 }
 public String toString()
 {
 return name +" " + ID + " " + GPA;
 }
}