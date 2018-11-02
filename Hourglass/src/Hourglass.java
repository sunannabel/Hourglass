/* second try at hourglass code. still broken
 * @author Annabel Sun
 * @version November 2 2018
 */

import java.util.*;

public class Hourglass {
	public static void main (String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print("How wide should the hourglass be? ");
		int width = userInput.nextInt();
		
		base(width);
		hourglass(width-2);
		base(width);
	}
	
	public static void base (int loop) 
	{ //prints the top / bottom base
		System.out.print("|");
		for (int i = 1; i <= loop; i++) 
		{
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void hourglass (int numColons)  //set up the hourglass
	{
		if (numColons % 2 == 1) {boolean odd = true;} //check if odd
		
		for (int i = numColons; i >= -1*numColons; i -= 2) //iterates based on numcolons
		{
			if (numColons > 0) //top half
			{
				for (int j = 1; j <= (numColons - i + 2); j++) //BROKEN BROKEN BROKEN BROKEN
				{
				System.out.print("\\"); //BROKEN BROKEN BROKEN BORKNE
				}
			}
		}
		
	}
	
	public static void colons (int numColons) //all the colons
	{
		for (int i = 1; i <= numColons; i++) 
		{
			System.out.print(":");
		}
	}
}

