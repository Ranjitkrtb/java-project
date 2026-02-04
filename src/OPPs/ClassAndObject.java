package OPPs;

class Students{
    int id;
    String name;

    public void display(int id,String name){
        this.id=id;
        this.name= name;
    }
    public void display(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
      Students st = new Students();
//      st.id = 2513040;
//      st.name = "Ranjit Kumar";
      st.display(2513040,"Ranjit");
      st.display();
    }

}
