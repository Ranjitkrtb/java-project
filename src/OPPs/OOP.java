package OPPs;//import org.w3c.dom.ls.LSOutput;
//
//class OPPs.Student {
//    String name;
//    int age;
//    public void info(){
//        this.name= name;
//        this.age=age;
//        System.out.println("the name of this student is "+this.name);
//        System.out.println("the age of this student is "+this.age);
//    }
//    class extend OPPs.Student{
//
//    }
//
//}
//public class OPPs.OOPs {
//    static void main(String[] args) {
//        OPPs.Student s1 = new OPPs.Student();
//        s1.name= "ranjit";
//        s1.age=18;
//        OPPs.Student s2 = new OPPs.Student();
//        s2.name = "ranjeet";
//        s2.age= 20;
//        s1.info();
//        s2.info();
//
//    }
//}

//    class School{
//        String teacher;
//        int salary ;
//        public void infor(){
//            System.out.println(this.teacher+"\t"+this.salary);
//            System.out.println("salary of the teacher : "+ this.salary);
//            System.out.println(this.teacher.length());
//        }
//}
//
//public class OOP {
//    public static void main(String[] args) {
//        System.out.println("teacher name \t salary");
//        School sc = new School();
//        sc.teacher = "ranjit kumar  ";
//        sc.salary = 15000;
//        sc.infor();
//        School sc1 = new School();
//        sc1.teacher = "harry kumar   ";
//        sc1.salary = 20000;
//        sc1.infor();
//        School sc2 = new School();
//        sc2.teacher  = "prarik yadav   ";
//        sc2.salary = 18000;
//        sc2.infor();
//        School sc3 = new School();
//        sc3.teacher =  "pihu yadav     ";
//        sc3.salary = 16000;
//        sc3.infor();
//    }
//}
 class Car{
     String color;
     int whell;
     int fuel;
     int maxSpeed;
     public void start(){
         if(fuel>=5) {
             System.out.println("welcome to driving ! started...");
         }
         else if(fuel>0) System.out.println("low fuel!");
         else System.out.println("insufficient fuel");
     }
     public void drive(){
         if(fuel >0) {
             System.out.println("driving car!");
             fuel= fuel - 1;
         }
     }
}
class Mycar {
     public static void main(String[] args) {
         Car cr = new Car();
         cr.color = "red";
         cr.fuel = 3;
         System.out.println(cr.fuel);
         cr.start();
         cr.drive();
         cr.drive();
         System.out.println(cr.fuel);
     }
    }