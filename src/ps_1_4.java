import java.util.Scanner;
public class ps_1_4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Convert Kilometers into Miles");
        System.out.print("Input Kilometer : ");
        double Kilometer = sc.nextDouble();
        double Miles = Kilometer * 0.621371;
        System.out.println("Miles = "+ Miles);
    }
}
