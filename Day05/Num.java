import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=a/2;i++){
            if(a%i==0) {
                sum +=i; 
            }    
        }
        System.out.println(a==sum ? "perfectnum":"not a perfectnum");
    }
}
