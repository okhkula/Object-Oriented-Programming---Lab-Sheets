import java.util.*;
public class BookReader
{
  static Scanner s=new Scanner(System.in);
   public static void main(String[] args)
   {
     Book [] b1=new Book[10];
     int data_of_memebers=values_read(b1);
     for(int i=0;i<data_of_memebers;i++)
     {
        b1[i]. printInfo();
      }
      System.out.println("Number of books read: "+data_of_memebers);
     double average=price_of_all_books(b1);
     System.out.println("Average price of all books: "+average);
     
   }
   
   public static int values_read(Book [] b1)
   {
     int i;
     for (i=0;i<b1.length;i++)
     {  
        System.out.println("Enter the data of members: ");
        b1[i]=new Book();
        b1[i].setBookInfo(s.next(),s.next(),s.nextDouble());
      }
      return i;
      } 
      
    public static double price_of_all_books(Book [] b1)
    {
    double sum=0;
      for(int i=0;i<b1.length;i++)
      {
        sum=sum+b1[i].getBookPrice();
      }
      return sum/b1.length;
      }
      }

        
      
   