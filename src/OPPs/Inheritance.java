package OPPs;

import org.w3c.dom.ls.LSOutput;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark (){
        System.out.println("Barking...");
    }
}
class Cat extends Dog {
    void run(){
        System.out.println("runing...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//        d.bark();
        Cat ct = new Cat();
        ct.run();
        ct.eat();;
        ct.bark();
    }
}