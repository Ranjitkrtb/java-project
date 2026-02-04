import java.util.Scanner;

public class arrayclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[2];
        System.out.println("input array");
        for(int i=0 ; i<arr.length;i++){
            System.out.print("num"+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum = "+sum);
    }
}
