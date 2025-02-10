public class SuperMarket {
    static String name ;
    String proname; //these all 4 called non Static,global var/fields
    int price;
    int discount;

    public static void main(String[] args) {
        SuperMarket product1= new SuperMarket();
        product1.name = "rice";
        product1.price = 50;
        product1.discount = 2;
        product1.proname = "soru";
        System.out.println(name);
    }
}
