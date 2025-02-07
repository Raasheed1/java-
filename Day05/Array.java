import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // int a [] = {1,2,3,4,5};
        // System.out.println(a);
        // for(int i=0; i<a.length;i++){
        //     System.out.println(a[i]+"");
        // }
        //2nd 

        Scanner sc = new Scanner(System.in); //new = object
        int b[]= new int[4];
        for(int i =0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        //foreach loop
        for(int value:b){
            System.out.print(value+"  ");
        }
    }
}
