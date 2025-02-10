
import java.lang.reflect.Array;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Tab";
        String s2 = "bat";
        s1= s1.toLowerCase();
        s2= s2.toLowerCase();
        boolean Anagram = false;

        if(s1.length()!=s2.length()){
            Anagram=false;
        }
        char A1[]=s1.toCharArray();
        char A2[]=s2.toCharArray();
        Arrays.sort(A2);
        Arrays.sort(A1);
        if(Arrays.equals(A1,A2)){
            Anagram = true;
        }
        System.out.println(Anagram?"it is":"no not");

    }

}
