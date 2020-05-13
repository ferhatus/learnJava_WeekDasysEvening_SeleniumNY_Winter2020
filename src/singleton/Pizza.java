package singleton;

public class Pizza {

    public String pizzaPrice="20";
    public String pizzaName="American Pizza";
    public double deliveryFee=2.5;
    private char size='M';
    private boolean isAvailable=true;

    private Pizza() {
        // private constructor
    }
    // create a instance variable/ object
    private static Pizza instance=new Pizza();

    public static Pizza getInstance(){
        return instance;
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaPrice, String pizzaName) {
        this.pizzaPrice = pizzaPrice;
        this.pizzaName = pizzaName;
    }
}
