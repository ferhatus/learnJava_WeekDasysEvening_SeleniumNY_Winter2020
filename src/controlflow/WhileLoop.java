package controlflow;

public class WhileLoop {
	
	public static void main(String[] args) {
		int x=35;
		int y=20;
		
		// while(condition){ ++ }
		
		while (x > 30) {
			System.out.println("We are learnig while loop");
			x--;
			
			while (y < 25) {
				System.out.println("Nested for while loop");
				y++;
			}
		}
		
	}

}
