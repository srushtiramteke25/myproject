import java.util.Scanner;

public class FactorialInRecusion {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial find---- ");
        int fact = factorialInLoop(sc.nextInt());
        System.out.println("Factorial of is "+fact);
    }

    private static int factorial(int next) {
        if(next==1){
            return 1;
        }
        return next * factorial(next - 1);
    }

    private static int factorialInLoop(int next) {
        int fact = 1;
        for(int i=1; i<=next;i++){
            fact = fact * (i);
        }
        return fact;
    }
}
