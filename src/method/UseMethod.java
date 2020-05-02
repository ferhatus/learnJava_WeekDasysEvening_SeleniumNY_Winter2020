package method;

public class UseMethod {
	
	int a=25;
	int age=45;
	String mango="Apple";
	String mobileBrend="Apple";
	
	// Non Return Type Method/Non  Parameterized  :
	public void dosummation() {
		int number1=45;
		int number2=55;
		int summation=number1+number2;
		System.out.println("Summation value is " +summation);
	}
	
	// Dynamic Non Return Type Parameterized :
	public void doSommution (int num1, int num2) {
		int number1=num2;
		int number2=num2;
		int summation=num1+num2;
		System.out.println("Summation value is " +summation);
	}
	
	//Return Type Method / Non Parameterized:
	public int doSubstruction() {
		
		int number1=70;
		int number2=55;
		int substruction=number1-number2;
		System.out.println("Substruction value is " +substruction);
		
		return substruction;
	}
	
	public int doSubstruction(int num1, int num2) {
		
		int number1=num1;
		int number2=num2;
		int substruction=number1-number2;
		System.out.println("Substruction value is " +substruction);
		
		return substruction;
		
	}
	public static void main(String[] args) {
		UseMethod obj=new UseMethod();
		obj.dosummation(); // call by object name
		 
		//UseMethod.dosummation(); // call by class name 
		
		obj.doSommution(400, 55);
		obj.doSubstruction();
		obj.doSubstruction(780, 654);
	}
	

}
