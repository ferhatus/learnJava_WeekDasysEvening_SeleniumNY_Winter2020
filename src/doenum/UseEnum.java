package doenum;

public class UseEnum {
	
	
	
	public enum Color{
		
		RED,BLUE,YELLOW,GREEN;
		
		public static void display() {
			System.out.println("Display is Good");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Color.RED); // call by enum name
		
		Color.display();
		System.out.println(Level.HIGH);
	}

}
