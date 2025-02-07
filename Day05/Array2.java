import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int a [] = {2,5,7,8,9,};
    int a [] = new int[4];
    for (int i =0;i<a.length;i++){
        a[i] = sc.nextInt();
    }
    for(int j =1;j<a.length;j++ ){
       if(j%2==0){
        System.out.print(a[j]+" ");
       }
    }
    }
}
