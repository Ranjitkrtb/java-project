import java.util.Scanner;

public class practice_6_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //🔹 Basic Array Questions
        //1st question
//        System.out.println("Write a Java program to store and print elements of an array.");
//        int ary[]={10,76,30,6,8,66,5};
//        for(int i=0;i<ary.length;i++){
//            System.out.println(ary[i]);
//        }
//        2nd question
//        System.out.println("Write a program to find the sum of all elements in an array.");
//        int ary[]={10,20,50,20,70};
//        int sum=0;
//        for(int i=0;i<5;i++){
//            sum=sum+ary[i];
//        }
//        System.out.println(sum);
//        3rd question
//        System.out.println("Write a program to find the average of array elements.");
//        int ary[]={10,20,47,30,80};
//        int sum=0;
//        for(int i=0;i<ary.length;i++){
//            sum=sum+ary[i];
//        }
//        float avg = (float)sum/ary.length;
//        System.out.println("average = "+avg);
//        //4th question
//        System.out.println("Write a program to find the largest and smallest element in an array.");
//        int ary[]={1000,200,30,40,50};
//        int lar;
//        int sml;
//        lar = ary[0];
//        sml = ary[0];
//        for(int i=0;i<ary.length;i++){
//            if(ary[i]>lar){
//                lar=ary[i];
//            }
//            if(ary[i]<sml){
//                sml=ary[i];
//            }
//        }
//        System.out.println("smallest no. = "+sml);
//        System.out.println("largest no. = "+lar);
//        5th question
//         System.out.println("Write a program to count even and odd numbers in an array.");
//         int ary[]={2,3,4,8,6,66,55,6,55,5,67,22};
//         int odd,even;
//         int count_even=0;
//         int count_odd=0;
//         for(int i=0;i<ary.length;i++){
//             if(ary[i]%2==0){
//                 count_even=count_even+1;
//             }
//             else
//                 count_odd=count_odd+1;
//         }
//        System.out.println("total nos. : "+ary.length);
//        System.out.println("count even no. : "+count_even);
//        System.out.println("count odd no.  : "+count_odd);

        //🔹 Intermediate Array Questions
        //6th question
//        System.out.println("Write a program to reverse an array.");
//        System.out.print("input no. of elements : ");
//        int n = sc.nextInt();
//        int[] arr= new int[n];
//
//        for (int i=0;i<arr.length;i++){
//            System.out.print("arr["+i+"] : ");
//            arr[i]=sc.nextInt();
//        }
//            // display array
//        System.out.print("\n");
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }
//        System.out.println();

        // write a program to find sum of 2D array input by user
//        System.out.print("input no. of array mxn : ");
//        int[][] marks ;
//        int sum =0;
//        int m = sc.nextInt();
//        int n= sc.nextInt();
//        marks=new int[m][n];
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n;j++) {
//                System.out.printf("marks[%d][%d] : ", i, j);
//                marks[i][j]=sc.nextInt();
//            }
//        }
//        for (int i=0 ;i<m;i++){
//            for(int j=0; j<n;j++) {
//                sum = sum + marks[i][j];
//            }
//        }
//        System.out.println("sum = "+sum);

        // find an array of float value and calculate their sum
//        float sum = 0 ;
//        float[] num;
//        num = new float[5];
//        for (int i=0 ;i<num.length;i++){
//            System.out.printf("num[%d] : ",i);
//            num[i]=sc.nextFloat();
//        }
//        // display array
//        for(int i=0;i<num.length;i++){
//            sum = sum + num[i];
//        }
//        System.out.println("sum = "+sum);

        // calculate the average marks from an array containing marks of all students in physics using for-each loop.

//        int[] phy;
//        phy = new int[5];
//        int sum = 0;
//        float avg;
//        for (int i=0; i<phy.length;i++){
//            System.out.printf("phy[%d] : ",i);
//            phy[i] = sc.nextInt();
//        }
//        for(int i=0 ; i<phy.length;i++){
//            sum = sum + phy[i];
//        }
//        avg = sum/phy.length;
//        System.out.println("average = "+ avg);

        // write a java program to find the maximum element in an array.
        int []arry = {12,22,33,44,55};
        int max = arry[0];
        for (int i=0 ; i<arry.length;i++){
            if(arry[i]>max)
                max = arry[i];
        }
        System.out.println(max);
    }
}
