import java.util.*;
public class testTemperature
{
  static Scanner s=new Scanner(System.in);
   public static void main(String [] args)
   {
    
    Temperature t1 =new Temperature();
    System.out.println("Enter the value of temperature: ");
  double  t=s.nextDouble();
    t1.setTemperature(t);
    System.out.println("Temperature in Fahrenheit: ");
     System.out.println(t1.getFarenheit());
     System.out.println("Temperature in Celsius: ");
     System.out.println(t1.getCelsius());
     }
  }
  