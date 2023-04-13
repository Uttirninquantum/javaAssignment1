/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner c = new Scanner (System.in);
      System.out.print ("enter age : ");
    int age = c.nextInt ();
    if (age >= 18)
      {
	System.out.println ("you can vote");
      }
    else
      {
	System.out.println ("you cannot vote");
      }

  }
}
