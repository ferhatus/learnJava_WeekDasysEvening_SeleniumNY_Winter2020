package controlflow;

public class ForLoop {
	
	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		
		// Nested For Loop
		for(int i = 0; i < 5; i++) {
			// parents for loop
			System.out.println("We are Learning For Loop");
			// child for loop
			for (int j = 0; j < 2; j++) {
				System.out.println("Nested Loop");
			}
		}
		
		
	}

}
