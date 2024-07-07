/*
 * StringBufferClass
 * 
 * In java, StringBuffer class is mutalbe(modifiable) means we can modify the string using StringBuffer class methods.
 * The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed
 * 
 * StringBuffer class methods
 * synchronized means -> You cannot use these methos in multithreading, at a time only one particular thread can use this particular method
 * speed is low compared to string methods
 * 
 * append(String a) -> return synchronized StringBuffer 
 * insert(int offset, String s) -> return synchronized StringBuffer 
 * replace(int startIndex, int endIndex, String str) -> return synchronized StringBuffer 
 * delete(int startIndex, int endIndex) -> return synchronized StringBuffer 
 * reverse()  -> return synchronized StringBuffer 
 * 
 * From now the methos is not synchronized but you can use in string buffer
 * 
 * capacity()  -> return int
 * charAt(int index) -> return char
 * length()  -> return int
 * substring(int beginIndex) -> return String
 * substring(int beginIndex, int endIndex) -> return String
 * 
 */
public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world");  // THe function change in the original array
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Kya hai");
        sb2.insert(1, "Kitna example hai");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.replace(1, 3, "World");
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.delete(1, 3);
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer("Hello");
        sb5.reverse();
        System.out.println(sb5);

        StringBuffer sb6 = new StringBuffer();
        System.out.println(sb6.capacity());
        sb6.append("Kya haal chal bhai log, java language kaisi lagi tum logo ko");
        System.out.println(sb6.capacity());  // Automatic increase th size of string when needed

    }
}
