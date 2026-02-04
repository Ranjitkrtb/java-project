package OPPs;
class Add {
    int sum(int a ,int b) {  // repeat same methods many times but argument different.
        return a+b;
    }
    int sum(int a , int b ,int c) {
        return a+b+c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("hello polymorphism");
        Add ad = new Add();
        System.out.println(ad.sum(10,52));
        System.out.println( ad.sum(65,45,25));
    }
}
