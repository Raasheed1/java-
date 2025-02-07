// package Day05;

public class Pattern8 {
    public static void main(String[] args) {
        int n =5 ;
        for (int i =1;i<=n;i++)
        {
            for(int j =1;j<=n-i;j++){ // 1st loop print 4 space
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){ //its print 1 *  
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
