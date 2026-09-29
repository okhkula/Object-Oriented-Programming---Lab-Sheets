import java.util.*;
  public class Lab2
  {
    static Scanner s=new Scanner(System.in);
    
  public static void main(String [] args)
  {
  System.out.println("Enter a sentence: ");
   String sentence=s.nextLine();
   int count=uppercase(sentence);
   System.out.println("Number of uppercase in the sentance: "+count);
   int n=10;
   int findMax=readValues(n);
   System.out.println("Max value " +findMax);
  System.out.println("Enter the temperature: ");
  int tempur=s.nextInt();
  char type=s.next().charAt(0);
  double findTemp=convert(tempur,type);
  System.out.println("The temperature is : "+findTemp);
  int num=1234;
  System.out.println("Enter numbers: "+num);
  int findReverse=reverseDigit(num);
  System.out.println("Reversed number: " +findReverse);
  
  }
  
  public static int uppercase( String sentence) //EX1
  {
       
   }
   public static int readValues(int n) //EX2
   {
    int max;
    System.out.print("Enter the first value");
    int values=s.nextInt();
    max=values;
    

        for(int i=2; i<n; i++)
        {
        System.out.print("Enter 10 numbers: ");
         values=s.nextInt();
        if(values>max)
        max=values;
           }
     return max;
    }
    public static double convert(int tempur, char type) //EX3
    {
         double converted_temp=0;
        double c=(double)tempur-32.0/1.8;
        double f=1.8*(double)tempur+32;
         
         if(type=='c' || type== 'C'){
          return converted_temp=f; 
          }
         else if(type=='f' || type=='F'){
          return converted_temp=c;
          }
         else{
          System.out.println("Invalid temperature");
          return -1;
         }
                        
     }
      public static int reverseDigit(int num)
      {
         int n=0;
         while(num !=0 )
         {
         int r=num%10;
          n=n*10+r;
          num=num/10;
          }
          return n;
           
     }
     }
    
  
  
  
  