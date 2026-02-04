package Challenges;

import java.util.Scanner;

public class CalculatesFactorial_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculates the factorial");
        System.out.print("input no of factorial : ");
        int n = sc.nextInt();
        int fact = 1;
        if(n==0){
            fact = 1;}
        else {
            int i = 1;
            while (i <=n){
                fact = fact*i;
                i++;
            }
        }
        System.out.println("factorial of "+n+" is = "+fact);
    }
}
