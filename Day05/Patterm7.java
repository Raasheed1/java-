// package Day05;

public class Patterm7 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){ //-i+1
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
