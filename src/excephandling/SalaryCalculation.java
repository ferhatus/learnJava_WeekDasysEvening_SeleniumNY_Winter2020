package excephandling;

public class SalaryCalculation {
// what is final, finally and finalize
    final String name="Denys";
    public static void division() {
        try{
            int num1 = 4500;
            int num2 = 0;

            int div = num1 / num2;
            System.out.println("Division of two value is " + div);
        }catch(Exception e){
           // e.printStackTrace();
            System.out.println("Arithmetic Exception");
        }finally {
            System.out.println("Division value is good");
        }
    }

    public static void doSummation() {
        int num1 = 45;
        int num2 = 0;
        int sum = num1 / num2;
        System.out.println("Sum of two value is " + sum);
    }

    public static void main(String[] args) throws ArithmeticException{
        SalaryCalculation.division();
        SalaryCalculation.doSummation();
    }
}
