import java.util.Scanner;
//write a program to print table of given number in java.
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input no : ");
        int num=sc.nextInt();
        int table;
        int i=1;
        while(i<=10) {
            table = num * i;
            System.out.printf("%d*%d = %d\n",num,i,table);
            i++;
        }
    }
}
