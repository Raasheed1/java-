import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b;
        int i = a;
        int r ;
        int count =0;
        for( ;i!=0;i=i/10){
            // num=num/10;
            count++;
        }
        while ( i!= 0) {
            
            r =i%10;
            b = (int)Math.pow(r,count);
            sum = sum + b ;
            i = i/10;
            
        }
        // System.out.println(count);
        // if(a==sum){
        //     System.out.println("its a Amstrong");
        // }
        // else{
        //     System.out.println("Not a Amstrong");
        // }
        System.out.println(sum);
        sc.close();
    }

}
