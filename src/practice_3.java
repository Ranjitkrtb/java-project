public class practice_3 {
    public static void main(String[] args) {
        String name = new String("Ranjit Kumar");
        System.out.println(name);
//        String name = "Ranjit yadav";
//        System.out.println(name);
        // *different ways to print java !
        int age =18;
        char ch = 'h';
        System.out.println(age);  //println() --> print a newline at the end !
        System.out.println(ch);
        System.out.print(age);  // print() --> not print newline at the end !
        System.out.print(ch);
        System.out.printf("age = %d",age);  // It is work just like a c programming language !
//        %d = int
//        %c = char
//        %f = float
//        %s = string
        String str = "Hello";  // index started 0 and end with (n-1)
        System.out.println(str.length()); // find length of string !
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str1 = "   Ranjit      ";
        System.out.println(str1.trim());
        System.out.println(str.substring(2)); // choose int then print after 2 index of all character !
        System.out.println(str.substring(1,3)); // Hello--> 0 1 2 3 4 -> el i.e end int are not print .
        System.out.println(str.replace('e','y'));
        System.out.println(str.replace("ll","bb"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("he"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.endsWith("he"));
        System.out.println(str.charAt(2)); // print the index of 2 letter
        System.out.println(str.indexOf("ll")); // print first index
        System.out.println(str.indexOf("arr")); // invalid string so print -1  * wrong string print -1
        System.out.println(str.indexOf("l",2));
        System.out.println(str.indexOf("a",5)); // invalid string and index so print -1.
        System.out.println(str.lastIndexOf("l")); // Hello --> 0  1 2 3 4
        System.out.println(str.lastIndexOf("s")); // invalid string so -1 print
        System.out.println(str.lastIndexOf("e",100));
        System.out.println(str.lastIndexOf("s",3)); // invalid
        System.out.println(str.equals("Hello")); // true matter Case
        System.out.println(str.equals("hello")); // false
        System.out.println(str.equalsIgnoreCase("hello")); // true hence ignore Case

        // * Escape Sequence characters
        String str2 = "wellcome\tjava";
        System.out.println(str2);
    }
}
