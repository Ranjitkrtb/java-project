import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();
        try {

            float divide = num1 / num2;
            System.out.println("divide = " + divide);
        } catch(ArithmeticException exception){
            System.out.println("ArithmeticException question");
        }
    }
}
