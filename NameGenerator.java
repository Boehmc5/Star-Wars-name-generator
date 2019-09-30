
/**
 * This code creates a number generator that makes your made up custom starwars name.
 *
 * @author (Christopher Boehm)
 * @version (9/29/2019)
 */
import java.util.Scanner;

public class NameGenerator
{
//declare variables
private static String firstName;
private static String secondName;
private static String townName;
private static String mothersMaidenName;
private static String name;

public static void generateStarWarsName(String arg[])
    {
       //creates a scanner variable and asks the user to input strings
       Scanner scan = new Scanner(System.in); 
       System.out.print("Enter first name: ");
       firstName = scan.nextLine();
       System.out.print("Enter second name: ");
       secondName  = scan.nextLine();
       System.out.print("Enter town name: ");
       townName  = scan.nextLine();
       System.out.print("Enter mothers maiden name: ");
       mothersMaidenName  = scan.nextLine();
       
       //use substrings to create name
       String starWarsFirstName = secondName.substring(0,3) + firstName.substring(0,2);
       String starWarsLastName = mothersMaidenName.substring(0,2) + townName.substring(0,3);
       
       //output your complete star wars name
       System.out.println(starWarsFirstName + " " + starWarsLastName);
    }

}
