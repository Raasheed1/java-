public class ArayMax {
public static void main(String[] args) {
    int a [] = {6,7,8};
    int min=a[0];
    for(int i =1;i<a.length;i++){
        if(a[i]<min){
            min= a[i];
        }
    }
        System.out.println(min);
    
}
}
