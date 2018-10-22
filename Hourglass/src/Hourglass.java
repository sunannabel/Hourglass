
public class Hourglass {
	public static void main (String[] args) {
		int maxColons = 8;
		int minColons = 2;
		
		//base
		base(maxColons + 2); 
		
		//top half
		for(int i = maxColons; i >= minColons; i -= 2) {
			for(int j = maxColons/2; j >= minColons/2; j-=2) {
				System.out.print(" ");
			}
			System.out.print("\\");
			colons(i);
			System.out.println("/");
		}
		
		//middle
		System.out.println("||");
		
		//bottom half
		for(int i = minColons; i <= maxColons; i += 2) {
			System.out.print("/");
			colons(i);
			System.out.println("\\");
		}
		
		//bottom base
		base(maxColons + 2);
	}
	
	public static void base (int loop) {
		System.out.print("|");
		for (int i = 1; i <= loop; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void colons (int loop) {
		String colon = "";
		for (int i = 1; i <= loop; i++) {
				colon += ":";
		}	
		System.out.print(colon);
	}
}
