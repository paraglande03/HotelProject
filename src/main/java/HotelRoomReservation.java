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



    public static void setLakeWood() {


        List<Integer> lakeWoodRegular = new ArrayList<>();
        lakeWoodRegular.add(110);
        lakeWoodRegular.add(90);


        lakeWood.put("Regular", lakeWoodRegular);


    }

    public void setBridgeWood() {


        List<Integer> bridgeWoodRegular = new ArrayList<>();
        bridgeWoodRegular.add(160);
        bridgeWoodRegular.add(60);


        bridgeWood.put("Regular", bridgeWoodRegular);

    }

    public void setRidgeWood() {


        List<Integer> ridgeWoodRegular = new ArrayList<>();
        ridgeWoodRegular.add(220);
        ridgeWoodRegular.add(150);



        ridgeWood.put("Regular" , ridgeWoodRegular);
        System.out.println();

    }
    public void printRates(){
        System.out.println("Prices for regular customers weekdays / weekends resp.");
        System.out.println("Lakewood Prices:- "+lakeWood.entrySet());
        System.out.println("Bridgewood Prices:- "+bridgeWood.entrySet());
        System.out.println("Ridgewood Prices:- "+ridgeWood.entrySet());
    }
}