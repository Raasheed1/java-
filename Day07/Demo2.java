public class Demo2 {
    public static void main(String[] args) {
        String s = "heelo i need the answer";

        // // System.out.println(s1.subSequence(s1.length(), 0));
        // int s2 = s1.lastIndexOf(" ");
        // System.out.println(s2);
        // System.out.println(s1.subSequence(s2+1,s1.length()));
        
        s.trim();
        int s2 = s.lastIndexOf(" ");
         System.out.println(s2);
        int s3 = s.length();
        int e = s3-s2;
        System.out.println(e-1);  
        // s.subSequence(s2+1,s.length());
        

    }
}
