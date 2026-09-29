import java.util.*;

public class ExceptionExercise_1 {

      static Scanner s=new Scanner(System.in); 
      
 public static void main(String[] args) 
 {
 try{
 int i, occurences, num;
 int []data = {30,7,49, 8, 12, 18,17, 25, 12, 20, 12, 8,7,12,7};
 arraySum(data);
 }
 catch(Exception ae)
 {
  if(ae instanceof ArrayIndexOutOfBoundsException)
     System.out.println("Array index exception raised by arraySum() method" +ae.toString());
  else if(ae instanceof InputMismatchException)
      System.out.println("nput mismatch exception raised by arraySum() method"+ae.toString());
 } 
 }
 
 public static void arraySum(int[]dataArray) throws Exception
 {
 try{
 int i, num, sum=0;
 System.out.printf("Enter number of the first array values to be added: max %-3d: ",dataArray.length);
 num = s.nextInt();
 for(i=0; i<num;++i)
 sum = sum + dataArray[i];
 System.out.printf("Sum of first %-3d values is %-6d \n", num, sum);
 }
 catch(Exception ae)
 {
  throw ae; } 

  
 }
}


