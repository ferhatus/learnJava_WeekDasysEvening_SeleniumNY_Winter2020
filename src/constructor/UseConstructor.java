package constructor;



public class UseConstructor {
	
	String name;
	String address;
	 int id;
	public UseConstructor() {
		
		System.out.println("Hello World");
		
	}
	
	public UseConstructor(String name){
	    this.name=name;
	    System.out.println(this.name);
	}
	
	public UseConstructor(String newName, String address) {
		this.name= newName;
		this.address=address;
		System.out.println("Name is " + this.name + " " + "Address is " + this.address);
		
		
	}
	
	
	public static void main(String[] args) {
		
		UseConstructor obj=new UseConstructor();
		UseConstructor myObj=new UseConstructor("Ferhat");
		UseConstructor snObj=new UseConstructor("Nelia", "Austin");
		
		
				
		
	}
	
	
	
	


}
