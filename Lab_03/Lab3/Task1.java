import java.util.Scanner;
public class Task1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter any word");
    String name = sc.nextLine();
    int len = name.length();
    
    System.out.println(len);
  }
}