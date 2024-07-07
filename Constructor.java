/*
 * Constructor have must same name with that class name.
 * Constructor have not any accessible modifier/visibilty modifiers.
 * They do not have any return type.
 * Super and this keyword is not used to call constructor implicitly.
 * Constructor used only once for an object at creating time.
 * Constructor must declare inside the class
 */

class Example {
    int a;
    Example() {
        System.out.println("Default constructor");
    }
    Example(int x) {
        a = x;
        System.out.println("Parametarised constructor with value " + a);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(45);
    }
}
