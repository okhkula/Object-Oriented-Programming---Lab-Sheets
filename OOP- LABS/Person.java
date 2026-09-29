public class Person
{
  private String firstName;
  private String lastName;
  
  public Person()
  {
    firstName = "";
    lastName = "";
  }
  
  public Person(String fname, String lname)
  {
    // setPersonData(fname, lastName);
    firstName = fname;
    lastName = lname;
  }
  
  public void setPersonData(String fname, String lname)
  {
    firstName = fname;
    lastName = lname;
  }
  
  public String getFirstName()
  { return firstName; }
  
  public String getLastName()
  { return lastName; }
  
  public void print()
  {
    System.out.println("Person: "+firstName+" "+lastName);
  }
  
}
