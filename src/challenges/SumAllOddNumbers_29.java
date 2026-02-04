package Challenges;

import java.util.Scanner;

public class SumAllOddNumbers_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum all odd numbers 1 to n. ");
        System.out.print("input n no. : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n; i++){
            if(i%2==0) continue;
            else {
                sum = sum + i;
            }
        }
        System.out.println("sum = "+sum);

    }
}
