package OPPs;

class Student{
    String name;
    int id ;
    int age;
    int semester;

    public Student(String name , int id , int age , int semester){
       this.name=name;
       this.id = id ;
       this.age = age ;
       this.semester = semester ;
    }
    public String getName() { return name ;}
    public int getId(){return id;}
    public int getAge() {return age;}
    public int  getSemester(){return semester;}

    @Override
    public String toString() {
        return "Name : "+name+
                "\nid : "+id+
                "\nage : "+age+
                "\nsemester : "+semester;
    }

}

public class PracticeOOPs {
    public static void main(String[] args) {
        Student st = new Student("Ranjit",2513040,17,2);
        System.out.println(st);
    }
}
