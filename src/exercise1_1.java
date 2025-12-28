import java.util.Scanner;
public class exercise1_1 {
    public static void main(String[] args) {
        System.out.println("Write a program to calculate percantage of a given student in CBSC board exam .His marks from 5 subjects must be token as input from the keyboard (marks are out of 100)");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Marks (marks are out of 100)");
        System.out.print("Physics: ");
        int phy = sc.nextInt();
        System.out.print("Chemistry: ");
        int chy = sc.nextInt();
        System.out.print("Mathematic: ");
        int mth = sc.nextInt();
        System.out.print("English: ");
        int eng = sc.nextInt();
        System.out.print("Computer Science: ");
        int cms = sc.nextInt();
        int totalmarks = phy+chy+mth+ eng +cms;
        float percentage = (totalmarks/500.0f)*100;
        //display result
        System.out.println("Total Marks = " + totalmarks);
        System.out.println("Percentage = "+ percentage + " %");
    }
}
