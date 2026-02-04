import java.util.Scanner;

public class ps_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Input Number : ");
        int num = sc.nextInt();
        for(int i=1; i<=num;i++){
            fact = fact * i;
        }
        System.out.println("factorial of "+num+" is = "+fact);
    }
}
