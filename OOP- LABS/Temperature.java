public class Temperature
{ 
    private double tempDegrees;
    
   
 public Temperature()
 {
   tempDegrees=0;
  
  }
 public void setTemperature(double temp)
 {
   tempDegrees=temp;
 
 }

public double getFarenheit()
{ 
   return tempDegrees;
}
 
 public double getCelsius()
 { 
  double  tempC= (tempDegrees-32.0) *5.0/9.0;
   return tempC  ;
 }
 }