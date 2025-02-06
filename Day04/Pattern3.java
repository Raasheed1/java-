public class Pattern3 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++){
            for(int c=5;c>=r;c--){  //(c=6-i;c>0;c--)
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
