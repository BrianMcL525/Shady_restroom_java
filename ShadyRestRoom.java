//imports scanner 
import java.util.Scanner;
// sets class name and makes file public to me accesable in other files
public class ShadyRestRoom
{
	//main shell that executes program
   public static void main (String args[])
   {
	   //Declaring global Variables
      int selection;
      int price;
      String result;
	  //constants for the different types of beds
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,SPRICE = 165; 
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
      	  INVALIDSTRING = "an invalid option";
	
	  //Creating scanner
      Scanner in = new Scanner(System.in); 
	  //Displays the menu of which bed has which value
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
	  //prompts the user which bed they would like
      System.out.print("Enter Selection (1, 2, or 3) >> ");
	  //uses scanner to take the next interger that is entered 
      selection = in.nextInt();
      //Test if user selected queen king or suite and provides the variables result and price the apporatie value 
	  if(selection == QUEEN)
      {
         result = QSTRING;
         price = QPRICE;
      }
      else
         if(selection == KING)
         {
            result = KSTRING;
            price = KPRICE;
         }
         else
            if (selection == SUITE)
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             }
	// Displays the user which bed they selected and the price of the bed they selected 
      System.out.println("You selected " + result + "  $" + price);
   }
}