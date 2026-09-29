public class Book {
   private String bookTitle;
   private String bookPublisher;
   private double bookPrice;
   public Book(){
      bookTitle = "";
      bookPublisher = "";
	bookPrice = 0;
   }	
   public void setBookInfo(String title, String publisher, double price){
     bookTitle = title;
     bookPublisher = publisher;
     bookPrice = price;
   }
   public void  setBookTitle(String title) {
	bookTitle =  title;
   }
   public void setBookPublisher(String publisher){
	bookPublisher = publisher;
   }
   public void setBookPrice(double price){
 	bookPrice = price;
   }
   public void printInfo(){
      System.out.println("Title: " + bookTitle);
	System.out.println("Publisher: " + bookPublisher);
	System.out.printf("Price: $%.2f%n", bookPrice);
   }
   public String getBookTitle()    {
	return bookTitle;
   }
   public String getBookPublisher()    {
	return bookTitle;
   }
   public double getBookPrice()    {
	return bookPrice;
   }
}// End of class book
