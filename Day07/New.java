// package Day07;

public class New {
    public static void main(String[] args) {
        // String s = "hello";// scp ,immutable
        //  StringBuilder sb=new StringBuilder("abc");
        //  StringBuilder sb1=new StringBuilder("abc"); // not a valid way";
        // System.out.println(sb1);

        String s1="abc";
        String s2=s1;
        s1="pqr";
        System.out.println(s1==s2 ? "yes":"no");

    }
}
