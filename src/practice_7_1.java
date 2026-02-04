import java.util.Scanner;

public class practice_7_1 {
//    static int sum( int ...arr){
//        int result=0;
//        for(int a : arr){
//            result+=a;
//        }
//             return result;
//    }
//    public static void main(String [] args) {
//        System.out.println("sum of nothing is :"+sum());
//        System.out.println("sum of 5 and 8 : "+sum(5,8));
//        System.out.println("sum of 7 and 8 : "+sum(7,8));
//        System.out.println("sum of 5 , 8 and 5 : "+sum(5,8,5));
//        System.out.println("sum of 5 , 8, 1 and 9 : "+sum(5,8,1,9));
//        System.out.println("sum of 5 ,8 , 6 , 7 , 6 and 45 : "+sum(5,8,6,7,6,45));

        static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }
//            else {
                return n * factorial(n - 1);
//            }
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.print("Input Number : ");
            int x = sc.nextInt();
        System.out.printf("factorial of %d is : %d",x,factorial(x));
    }
}
