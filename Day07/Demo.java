public class Demo {{
    System.out.println("helo form non static");
}
static{
    System.out.println("hello from stastic");
}
public static void main(String[] args) { //static load only one as main intro

    Demo de = new Demo(); 
    Demo d1 = new Demo();  //non-static when ever the object created 
    
}

}
