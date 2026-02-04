import java.util.Scanner;

public class Atm1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int balance = 100000;
        for(int i=1;i<10000;){

        System.out.println("** Welcome to My ATM ! **");
//            System.out.println("please choose anyone option :");
        System.out.println("1 : Balance Enquiry");
        System.out.println("2 : Withdraw");
        System.out.println("3 : Deposit cash");
        System.out.println("4 : Exit");

        System.out.print("Input choice : ");
        int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("balance = " + balance + "\n");
                    System.out.println("---Thank You---\n");
                    break;
                case 2:
                    System.out.print("Input withdraw Amount : ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= 0) System.out.println("please! enter amount greater than 0.");
                    else if (withdraw > balance) System.out.println("Insufficient Balance");
                    else if (withdraw <= balance && withdraw > 0) {
                        balance = balance - withdraw;
                        System.out.println("Your Amount successfully withdraw !\n");
                        System.out.println("---Thank You---\n");
                    }
                    break;
                case 3:
                    System.out.print("Input Deposit Amount : ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Your Amount successfully deposit !\n");
                    } else if (deposit <= 0) {
                        System.out.println("please! enter amount greater than 0.");
                    }
                    System.out.println("---Thank You---\n");
                    break;
                case 4:
                    System.out.println("---Thank You---\n");
                    System.exit(0);
                default:
                    System.out.println("oops! invalid choice.");
                    System.out.println("Please! choose correct option.");
                    System.out.println("---Thank You---\n");
            }
        }
    }
}
