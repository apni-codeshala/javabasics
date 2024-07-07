/*
 * Method overloading
 * 
 * If a class have multiple methods by same name but different signature, it is known as Method Overloading
 * Advantages of methos overloading
 *  - Perform only one operation, having same name of methods increases the readability of program
 */

class MethodDemo {
    int a, b, c;
    void add(int x) {
        a=x;
        System.out.println("Add = " + (a));
    } 
    void add(int x, int y) {
        a=x;
        b=y;
        System.out.println("Add = " + (a+b));
    }
    void add(int x, int y, int z) {
        a=x; 
        b=y;
        c=z;
        System.out.println("Add = "+ (a+b+c));
    }
} 

public class MethodOverloading {
    public static void main(String[] args) {
        MethodDemo m1 = new MethodDemo();
        m1.add(1);
        m1.add(1, 2);
        m1.add(1, 2, 3);   // These methods are performing polymophism
    }
}
