package parking_lot;

public class Attendant {
    void notifyForFullParking(Integer parkingLotId) {
        System.out.printf("Parking lot no. %d is full %n", parkingLotId);
    }

    void notifyWhenFullParkingGetsFree(Integer parkingLotId) {
        System.out.printf("Parking lot no. %d got space %n", parkingLotId);

    }
}
