import java.util.Scanner;

public class takingInput_05 {
    public static void main(String[] args){
        System.out.println("taking inputs by the User");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Taking number1 :");
//        int a = sc.nextInt();
//        System.out.print("Taking number2 :");
//        int b = sc.nextInt();
//        int sum = a + b ;
//        System.out.print("Sum of these Number:");
//        System.out.println(sum);
//        String str = sc.next();     //input single words
//        System.out.println(str);
        String str1 = sc.nextLine();  //input multi-words
        System.out.println(str1);
    }
}
