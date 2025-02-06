import java.util.Scanner;

public class Neonnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int sq = n*n;
        int rem=0;
        while (sq!=0){
            rem=sq%10;
            sum=sum+rem;
            sq/=10;
        }
        // if(sum==n){
        //     System.out.println("its");
        // }
        // else{
        //     System.out.println("no");
        // }
        System.out.println(sum == n ? "neon":"notneon");
    }

}
