public class Mergeastring {
public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "pqr";
    String re ="";
    

    for(int i=0;i<s1.length()-1;i++){
        if(i!=0){
            re=re+s1.charAt(i);
         }
        // else{
        //     re=re+s1.charAt(i);
        // }
        for(int j =0;i<s2.length()-1;j++){
            if(i!=0){
                re=re+s1.charAt(j);
            // }
            // else{
            //     re=re+s1.charAt(j);
            // }

        }
        
    }   
    System.out.println(s2); 

    }
}
}
