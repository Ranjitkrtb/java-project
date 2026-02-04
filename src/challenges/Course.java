package Challenges;
class Employee {
    String name;
    int age;
    String gender;

    Employee(){

    }
    Employee(Employee em2){
        this.name = em2.name;
        this.age = em2.age;
        this.gender = em2.gender;
        System.out.println("copy constructor");
    }
    public void employee(){
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("Gender : "+gender);
    }
}

public class Course {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.name = "Ranjit Kumar";
        em.age = 18;
        em.gender = "male";
        Employee em2 = new Employee(em);
        em2.employee();
    }
 }