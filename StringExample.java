/*
 * The string class represents character strings.
 * String class is an immutable means we can not modify the string.
 * The java.lang.String class can provide a lot of methods to work on string.
 * 
 * String class methods
 * charAt(int index) -> return char
 * compareTo(String anotherString) -> return int  -> When string is equal than return 0 else retrn other random number
 * compareToIgnoreCase(String str) -> return int
 * concat(String str) -> return String
 * endsWith(String suffix) -> return booleans
 * equals(Object anotherObjec) -> return booleans -> Compare this string to the speicfic object
 * equalsIgnoreCase(String anotherString)  -> return booleans
 * length() -> return int
 * toLowerCase() -> return String
 * toUpperCase() -> return String
 * 
 */

import java.lang.String;
public class StringExample {
    public static void main(String[] args) {
        String s1 = "Welcome";
        System.out.println("String length is "+ s1.length());
        System.out.println("Capitalize all the characters "+ s1.toUpperCase());
        System.out.println("To lowercasre all the characters " + s1.toLowerCase());
        System.out.println("Character at index 3 " + s1.charAt(3));
        System.out.println("Compare with welcome " + s1.compareTo("welcome"));
        System.out.println("Compare with ignoring the case " + s1.compareToIgnoreCase("welcome"));
        System.out.println("Concatenate with name " + s1.concat(" Abhishek"));
        System.out.println("Equals to welcome or not " + s1.equals("welome"));
        System.out.println("Equals to welcom ignoring the case " + s1.equalsIgnoreCase("welcome"));
    }
}
