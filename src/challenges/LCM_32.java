package Challenges;

import java.util.Scanner;

public class LCM_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Least Common Multiple (LCM)");
        System.out.print("input num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("num 2 : ");
        int num2 = sc.nextInt();
        float lcm=0;
        for(int i=num1; i>=1;i--){
            if(num1%i==0 && num2%i==0){
                lcm = (float)(num1/i)*(num2/i)*i;
                break;
            }

        }
        System.out.println("LCM = "+lcm);
    }
}
