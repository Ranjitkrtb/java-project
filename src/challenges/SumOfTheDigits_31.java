package Challenges;

import java.util.Scanner;

public class SumOfTheDigits_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum all odd numbers");
        System.out.print("input total odd no. : ");
        int n = sc.nextInt();
        int[] num=new int[n];
        int i=0;
        while(i<num.length){
            System.out.printf("num %d : ",i+1);
            num[i]=sc.nextInt();
            i++;
        }
        int sum=0;
        i=0; // again get value because i is increase value before loop
        while(i<num.length){
            sum=sum+num[i];
            i++;
        }
        System.out.println("sum = "+sum);
    }
}
