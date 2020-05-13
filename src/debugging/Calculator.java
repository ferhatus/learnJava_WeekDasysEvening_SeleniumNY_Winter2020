package debugging;

public class Calculator {

    //psvm
    public static void main(String[] args) {

        // sout
        System.out.println();

        // format : Windows: ctrl + alt + L        Mac: command + opt + L

        Calculator.result();
    }

    public static int doSummation(){
        int num1=45;
        int num2=55;

        int sum=num1+num2;
        System.out.println("Sum of two value is " +sum);
        return sum;
    }
    public static double doDivision(){
        int num1=4500;
        int num2=55;

        int div=num1/num2;
        System.out.println("Division of two value is " +div);
        return div;
    }
    public static void result(){
        int num=doSummation();
        int salary=5000;
        double divValue=doDivision();
        double total=(num+salary)/divValue;
        System.out.println("Total salary is "+total);




    }
}
