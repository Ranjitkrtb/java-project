import java.util.Scanner;

public class ps_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check prime no. or not !");
        int n , flag=1;
        System.out.print("Input Number : ");
        n = sc.nextInt();
        if(n<=1) {
            flag = 0;
        }
        for(int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            } else {
                flag = 1;
            }
        }
            if(flag==1)
                System.out.println("prime number");
            else
                System.out.println("not prime number");

    }
}
