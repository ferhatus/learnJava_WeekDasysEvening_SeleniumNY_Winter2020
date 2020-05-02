package advance;

public class UseRecursion {
	
	
	static int  count = 0;
	public static void pizzainfo() {
		count++;
		if (count<=10) {
			System.out.println("Pizza is Amazing");
			pizzainfo(); // Recursion 
		}
		
	}
	
	public static void main(String[] args) {
		UseRecursion.pizzainfo();
		
	}

}
