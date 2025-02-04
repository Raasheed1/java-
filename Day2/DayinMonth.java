public class DayinMonth {
    public static void main(String[] args) {
        System.out.print("Enter the nunmber 1 to 12:");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month>12){
            System.out.println("Invalid input");
        }

        switch (month) {
            case 1:
                System.out.println("Janvary has 31 days" );
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:day=4;
                System.out.println("Thursday");
                break;
            case 5:day=5;
                System.out.println("Friday");
                break;
            case 6:day=6;
                System.out.println("Saturday");
                break;
            case 7:day=7;
                System.out.println("Sunday");
                break;        
            default:
                break;
        }
    }

}
