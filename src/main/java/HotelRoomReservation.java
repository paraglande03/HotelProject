import java.util.*;
public class HotelRoomReservation {

    public HotelRoomReservation(){
        setBridgeWood();
        setLakeWood();
        setRidgeWood();
    }
    
    private static HashMap<String, List<Integer>> lakeWood = new HashMap<>();
    private static HashMap<String, List<Integer>> bridgeWood = new HashMap<>();
    private static HashMap<String, List<Integer>> ridgeWood = new HashMap<>();



    public  static  List<Integer> setLakeWood() {


        List<Integer> lakeWoodRegular = Arrays.asList(110,90);



        lakeWood.put("Regular", lakeWoodRegular);

        return lakeWoodRegular;
    }

    public static List<Integer> setBridgeWood() {


        List<Integer> bridgeWoodRegular = Arrays.asList(160,60);



        bridgeWood.put("Regular", bridgeWoodRegular);
        return bridgeWoodRegular;
    }

    public static  List<Integer> setRidgeWood() {


         List<Integer> ridgeWoodRegular = Arrays.asList(220,150);




        ridgeWood.put("Regular" , ridgeWoodRegular);

            return ridgeWoodRegular;
    }
    public void printRates(){
        System.out.println("Prices for regular customers weekdays / weekends resp.");
        System.out.println("Lakewood Prices:- "+lakeWood.entrySet());
        System.out.println("Bridgewood Prices:- "+bridgeWood.entrySet());
        System.out.println("Ridgewood Prices:- "+ridgeWood.entrySet());
    }


    public static void getTotalRate(){
        System.out.println("enter no of days to stay");
        Scanner scanner=new Scanner(System.in);
        int noOfDays= scanner.nextInt();
        System.out.println("Enter choice of weekdays of weekends:- 1.weekdays 2. weekends");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                if (Integer.valueOf(setLakeWood().get(0)) <= Integer.valueOf(setBridgeWood().get(0)) && Integer.valueOf(setLakeWood().get(0)) <= Integer.valueOf(setRidgeWood().get(0))) {
                    System.out.println("lakewood is cheaper with price of : " + (Integer.valueOf(setLakeWood().get(0))) * noOfDays + "$");

                } else if (Integer.valueOf(setBridgeWood().get(0)) <= Integer.valueOf(setLakeWood().get(0)) && Integer.valueOf(setBridgeWood().get(0)) <= Integer.valueOf(setRidgeWood().get(0))) {

                    System.out.println("Bridgewood is cheaper with price of : " + (Integer.valueOf(setBridgeWood().get(0))) * noOfDays + "$");
                } else {
                    System.out.println("Ridgewood is cheaper with price of : " + (Integer.valueOf(setRidgeWood().get(0))) * noOfDays + "$");

                }

                break;
            case 2:
                if (Integer.valueOf(setLakeWood().get(1)) <= Integer.valueOf(setBridgeWood().get(1)) && Integer.valueOf(setLakeWood().get(1)) <= Integer.valueOf(setRidgeWood().get(1))) {
                    System.out.println("lakewood is cheaper with price of : " + (Integer.valueOf(setLakeWood().get(1))) * noOfDays + "$");

                } else if (Integer.valueOf(setBridgeWood().get(1)) <= Integer.valueOf(setLakeWood().get(1)) && Integer.valueOf(setBridgeWood().get(1)) <= Integer.valueOf(setRidgeWood().get(1))) {

                    System.out.println("Bridgewood is cheaper with price of : " + (Integer.valueOf(setBridgeWood().get(1))) * noOfDays + "$");
                } else {
                    System.out.println("Ridgewood is cheaper with price of : " + (Integer.valueOf(setRidgeWood().get(1))) * noOfDays + "$");

                }

                break;
            default:
                System.out.println("Enter valid choice");


        }
    }
}

