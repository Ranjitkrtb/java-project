import java.util.Scanner;
public class ps_1_1 {
    public static void main(String[] args) {
        System.out.println("Write a program to calculate Sum of three number in java");
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,sum;
        System.out.println("Input three number :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sum = num1 + num2 + num3;
        System.out.println("Sum = " + sum);
    }
}
