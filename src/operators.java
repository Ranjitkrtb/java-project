import java.util.Scanner;

public class operators {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world ");
        System.out.print("Input num1 : ");
        int num1=sc.nextInt();
        System.out.print("Input num2 : ");
        int num2 = sc.nextInt();
        int xor = num1&num2;
        System.out.println(xor);
        System.out.println("hello world ");
    }
}
