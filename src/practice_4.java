import java.util.Scanner;

public class practice_4 {
   public static void main(String[] args) {
       // if-else conditions
//       if(true){
//           System.out.println("yes");
//       }
//
//       if(true)
//           System.out.println("yes");
//       else
//           System.out.println("No");
//       int age = 16;
//       if(age>=18)
//           System.out.println("You can drive a car !");
//       else
//           System.out.println("You cannot drive a car !");
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Your age : ");
       int age = sc.nextInt();
       if (age>60) {
           System.out.println("You are old !");
       }
       else if (age>21) {
           System.out.println("You are Youth !");
       }
       else if(age>=21) {
           System.out.println("You can marrige !");
       }
       else if (age>=18) {
           System.out.println("You can vote !");
       }
       else if(age<18) {
           System.out.println("you are child !");
       }
       else {
           System.out.println("you are old");
       }

       // switch conditions
       String ch;
       System.out.print("Input Character : ");
       ch = sc.next();
       switch(ch){
           case "a":
               System.out.println("apple");
                break;
           case "b":
               System.out.println("ball");
               break;
           case "c":
               System.out.println("cat");
               break;
           case "d":
               System.out.println("dog");
               break;
           default :
               System.out.println("invalid String !");
       }

   }
}
