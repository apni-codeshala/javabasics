/*
 * General syntax of define class in java
 * 
 * class-modifier class className extends clause implements clause {
 *      Declaration variables; (static and non-static)
 *      Declaration method(); (static and non static)
 *      Declaration inner class;
 *      Declaration nested interface
 *      Declaration constructor();
 *      Declaration Main Method();
 * }
 * 
 */

class Example {
    int a, b;
    void set(int x, int y) {
        a = x;
        b = y;
    }
    void show() {
        System.out.println("a = " + a + ", b = "+ b);
    }
}

public class Class {  // Main method is only in that class that name was same as file name
    int a=10;
    void show() {
        System.out.println("Class method");
    }
    public static void main(String[] args) {

        // System.out.println(a); -> now you cannot directly acess the variable of the class you hav to create the object of the class because variable is not local to function

        Class c1 = new Class();
        System.out.println(c1.a);
        c1.show();

        Example e1 = new Example();
        System.out.println(e1.a);
        e1.set(10, 20);
        e1.show();
    }
}
