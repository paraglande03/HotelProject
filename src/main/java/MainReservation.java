import java.util.Scanner;

public class MainReservation {
    public static void main(String[] args) {
        HotelRoomReservation hotelRoomReservation=new HotelRoomReservation();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter choice for \n1.total rate for weekend &weekdays\n2. rates for best rated weekday prices\n3. rates for best rated weekend prices ");
        int byCategory= scanner.nextInt();
        switch (byCategory){
            case 1:
                HotelRoomReservation.getTotalRate();
                break;
            case 2:
                HotelRoomReservation.minCostBestRated(hotelRoomReservation.WeekDayLakeWoodCost, hotelRoomReservation.WeekDayBridgeWoodCost, hotelRoomReservation.WeekDayRidgeWoodCost);
                break;
            case 3:
                HotelRoomReservation.minCostBestRated(hotelRoomReservation.WeekendLakeWoodCost, hotelRoomReservation.WeekendBridgeWoodCost, hotelRoomReservation.WeekendRidgeWoodCost);
                break;
            default:
                System.out.println("Enter valid option");
        }



    }
}
//
//