package constructor;

public class Mobile {
	
	String mobileBrend;
	String mobileModel;
	double price;
	int ramSize;
	
	public Mobile() {
		
	}

	public Mobile(String mobileBrend) {
		this.mobileBrend = mobileBrend;
	}

	public Mobile(String mobileBrend, String mobileModel) {
		this.mobileBrend = mobileBrend;
		this.mobileModel = mobileModel;
	}

	public Mobile(String mobileBrend, String mobileModel, double price) {
		this.mobileBrend = mobileBrend;
		this.mobileModel = mobileModel;
		this.price = price;
	}

	public Mobile(String mobileBrend, String mobileModel, double price, int ramSize) {
		this.mobileBrend = mobileBrend;
		this.mobileModel = mobileModel;
		this.price = price;
		this.ramSize = ramSize;
	}
	
	public static void main(String[] args) {
		
		Mobile mobil=new  Mobile();
		
	}
	
	
	
	

}
