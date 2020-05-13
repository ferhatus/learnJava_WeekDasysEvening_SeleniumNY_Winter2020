package singleton;

public class TestPizza {

    public static void main(String[] args) {

        Pizza myPizza=Pizza.getInstance();
        myPizza.pizzaName="American Pizza";
        System.out.println(myPizza.pizzaName);
        System.out.println(myPizza.deliveryFee);
    }
}
