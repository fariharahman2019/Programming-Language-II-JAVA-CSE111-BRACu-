import java.util.Scanner;
public class Task6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    
    System.out.println(name);
    System.out.println(name.concat("==THE END=="));
    System.out.println(name.lastIndexOf());
  }
}