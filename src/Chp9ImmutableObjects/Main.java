package Chp9ImmutableObjects;

public class Main {
    public static void main(String [] args) {

        String s = "hello";
        String t = new String("hello");

        //make a version of s that is capitalized
        String s1 = Character.toUpperCase(s.charAt(0)) //makes first character uppercase
        + s.substring(1);

        // StringBuolder- mutable strings


        // string are immutable (cannot modify them)
        // Character objects are also immutable

        char ch = 'z';
        Character ch2 = 'z';
        Character ch3 = new Character('a');


        int x = 33;
        Integer y = 33;
        Integer y1 = new Integer(33);

        double pi = 3.14159;
        Double pi1 = 3.14159; // non primitive value b/c capital value //pi1= reference to an object
        Boolean flag = false; // non primitive value b/c capital letter
        Long ll = 43L;
        // immutable values = pi1

        pi1 = 2.7128;
        // re-assigning the refernce to an object--- making  a new reference assigned to object which is 2.7128


        // Double, Long, Integer, Boolean, Character, Short, Float are  all wrapper classes
        //for their respective primitive type.
        // taking a primitive value and wrapping it in an object is called: autoboxing
        // turning an object into its primitive is called autounboxing.

        Student student1 = new Student("Hermoine", "Granger",
                "123", "The Smart One");
        // student1.first = "Harry"; === error (cannot access private data from outside of class)
        //student1.nickname = ""; // remove Hermione's nickname --- can modify her nickname bc the object
        // "nickname" is nor private-- thus mutable
        System.out.println(student1.toString()); //toString is implicitly called

        Student student2 = new Student("Harry", "Potter", "456", "The boy");
        System.out.println(student2);

    }
}
