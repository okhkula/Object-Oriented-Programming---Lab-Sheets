public class Lab9
{
   public static void main(String [] args)
   {

      printLine(5);
      double result=power(4,3);
      System.out.println(result);
      int result2=add(5,3);
      System.out.println(result2);
    }
    public static void printLine(int n)
    { 
      if(n==0)
       return;      
      else
      {
        System.out.print("*");
         printLine(n-1);
       }
   }
   
   public static double power(int x, int y)
   {
     if(y==0)
     return 1;
     else if(y==1)
     return x;
     else if(y>1)
     return x*power(x,y-1);
     else if(y<0)
     return 1/power(x,-y) ;
     return 0;
    }
    public static int add(int m, int n)
    {
      if(n==0)
      return 0;
     else if(n==1)
     return m;
     else if(n>0)
     return m+add(m,n-1);
     else
     return -add(m,-n);
     
     }
     
      
    }
    
