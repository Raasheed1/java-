

public class Statement {
public static void main(String[] args) {
    
    String s1 = "Vanakam da mapla";
    System.out.println(s1.startsWith("Vanakam"));
    System.out.println(s1.startsWith("da",8));
    System.out.println(s1.indexOf("d",4));
    System.out.println(s1.lastIndexOf("a"));

    String s2 = "Hello world";
    System.out.println(s2.substring(6,s2.length()));
    System.out.println(s2.subSequence(4,10));
    }
}

