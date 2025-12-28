import java.util.Scanner;
public class ps_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a program to calculate CGPA using marks of three subjects (out of 100)\n");
        System.out.println("Input Marks (out of 100)");
        System.out.print("Physics : ");
        float phy = sc.nextFloat();
        System.out.print("Chemistry : ");
        float chy = sc.nextFloat();
        System.out.print("Mathematics : ");
        float mth = sc.nextFloat();
//        float total = phy + chy + mth;
//        float percentage = (total/300.0f)*100;
//        float cgpa = percentage/10f;
        float cgpa = (phy+chy+mth)/30;
//        System.out.println("Percentage = " + percentage + " %");
        System.out.println("CGPA = " + cgpa );
    }
}