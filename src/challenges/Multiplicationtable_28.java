package Challenges;

import java.util.Scanner;

public class Multiplicationtable_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("multiplication table");
        System.out.print("input no. of table : ");
        int num = sc.nextInt();
        int table = 0;
        int i =1;
        while(i<=10){
            table = num*i;
            System.out.printf("%d*%d = %d\n",num,i,table);
            i++;
        }
    }
}
