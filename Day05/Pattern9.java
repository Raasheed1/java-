// package Day05;

public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i =1 ;i<=n*2;i++){
            int Totalcolum  =i>n? n*2-i : i;  
            int space = n-Totalcolum;

            for(int j=1;j<=space;j++){
                System.out.print("-");
            }
            for(int k = Totalcolum;k>0;k--){
                
                System.out.print(k);
            }
            for(int l = 2;l<=Totalcolum;l++){
                System.out.print(l);
            }
            for(int m = 1;m<=space;m++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
     }
}    
