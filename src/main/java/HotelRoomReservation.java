import java.util.*;
public class HotelRoomReservation {

//    maps for hotels and prices
    private static HashMap<String, List<Integer>> lakeWood = new HashMap<>();
    private static HashMap<String, List<Integer>> bridgeWood = new HashMap<>();
    private static HashMap<String, List<Integer>> ridgeWood = new HashMap<>();
    private static int lakeWoodRating;
    private static int bridgeWoodRating;
    private static int rigdeWoodRating;
    int WeekDayLakeWoodCost= Integer.valueOf(setLakeWood().get(0));
    int WeekDayBridgeWoodCost= Integer.valueOf(setBridgeWood().get(0));
    int WeekDayRidgeWoodCost= Integer.valueOf(setRidgeWood().get(0));
    int WeekendLakeWoodCost= Integer.valueOf(setLakeWood().get(1));
    int WeekendBridgeWoodCost= Integer.valueOf(setBridgeWood().get(1));
    int WeekendRidgeWoodCost= Integer.valueOf(setRidgeWood().get(1));


    public  static  List<Integer> setLakeWood() {
        List<Integer> lakeWoodRegular = Arrays.asList(110,90);
        lakeWood.put("Regular", lakeWoodRegular);
        lakeWoodRating=3;
        return lakeWoodRegular;
    }

    public static List<Integer> setBridgeWood() {
        List<Integer> bridgeWoodRegular = Arrays.asList(160,60);
        bridgeWood.put("Regular", bridgeWoodRegular);
        bridgeWoodRating=5;
        return bridgeWoodRegular;
    }

    public static  List<Integer> setRidgeWood() {
         List<Integer> ridgeWoodRegular = Arrays.asList(220,150);
        ridgeWood.put("Regular" , ridgeWoodRegular);
        rigdeWoodRating=5;
            return ridgeWoodRegular;
    }


    public static void getTotalRate(){
        System.out.println("enter no of days to stay");
        Scanner scanner=new Scanner(System.in);
        int noOfDays= scanner.nextInt();
        System.out.println("Enter choice of weekdays of weekends:- 1.weekdays 2. weekends");

        int choice = scanner.nextInt();
        int i =choice-1;


        if (Integer.valueOf(setLakeWood().get(i)) <= Integer.valueOf(setBridgeWood().get(i)) && Integer.valueOf(setLakeWood().get(i)) <= Integer.valueOf(setRidgeWood().get(i))) {
            System.out.println("lakewood is cheaper with price of : " + (Integer.valueOf(setLakeWood().get(i))) * noOfDays + "$");

        } else if (Integer.valueOf(setBridgeWood().get(i)) <= Integer.valueOf(setLakeWood().get(i)) && Integer.valueOf(setBridgeWood().get(i)) <= Integer.valueOf(setRidgeWood().get(i))) {

            System.out.println("Bridgewood is cheaper with price of : " + (Integer.valueOf(setBridgeWood().get(i))) * noOfDays + "$");
        } else {
            System.out.println("Ridgewood is cheaper with price of : " + (Integer.valueOf(setRidgeWood().get(i))) * noOfDays + "$");

        }
    }
    public static String minCostBestRated(int lakeWoodCost, int bridgeWoodCost, int ridgeWoodCost) {
        int minCost = Math.min(lakeWoodCost, Math.min(bridgeWoodCost, ridgeWoodCost));
        if (minCost == lakeWoodCost && minCost == bridgeWoodCost) {
            return bridgeWoodRating > lakeWoodRating ? "BridgeWood" : "LakeWood";
        } else if (minCost == bridgeWoodCost && minCost == ridgeWoodCost) {
            return bridgeWoodRating > ridgeWoodCost ? "BridgeWood" : "RidgeWood";
        } else if (minCost == lakeWoodCost && minCost == ridgeWoodCost) {
            return lakeWoodCost > ridgeWoodCost ? "LakeWood" : "RidgeWood";
        } else {
            if (minCost == lakeWoodCost) {

                System.out.println("Lakewood is best rated cheaper hotel");
                return "lakewood";
            } else if (minCost == bridgeWoodCost) {
                System.out.println("Bridgewood is best rated cheaper hotel");
                return "Bridgewood";
            } else {
                System.out.println("Ridgewood is best rated cheaper hotel");
                return "RidgeWood";
            }
        }
    }

}

