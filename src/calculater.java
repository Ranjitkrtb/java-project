import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Input two number : ");
        a = sc.nextInt();
        String operator = sc.next();
        b = sc.nextInt();
        switch(operator) {
            case "+": System.out.println(a +"+"+ b  +" = "  + (a+b));
                break;
            case "-": System.out.println(a+ "-"+ b + " = " + (a-b));
                break;
            case "*": System.out.println(a +"*"+ b + " = " + (a*b));
                break;
            case "/": if(b != 0) {
                System.out.println(a +"/"+ b+" = " + (a / b));
            }
            else {
                System.out.println("Error! division by 0 is not allow !");
            }
                break;
            default: System.out.println("Invalid operator");
        }
    }
}
