import java.util.Scanner;
public class Task2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter any word");
    String name = sc.nextLine();
    int len = name.length();
    
    for( int index=0; index<len; index++)
    {
      char lol = name.charAt(index);
      
      System.out.println(lol);
    }
  }
}