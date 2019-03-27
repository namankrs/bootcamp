package parking_lot;

import java.util.ArrayList;
import java.util.List;

class Attendant {
    private List<ParkingLot> parkingLots;
    private Assistant assistant;

    Attendant(Assistant assistant) {
        this.parkingLots = new ArrayList<>();
        this.assistant = assistant;
    }

    void notifyForFullParking(Integer parkingLotId) {
        System.out.printf("Parking lot no. %d is full %n", parkingLotId);
    }

    void notifyWhenFullParkingGetsFree(Integer parkingLotId) {
        System.out.printf("Parking lot no. %d got space %n", parkingLotId);
    }

    boolean register(ParkingLot parkingLot) {
        Integer id = parkingLot.getId();
        Integer carCount = parkingLot.calculateCarsCount();
        this.assistant.updateDisplay(id, carCount);
        return this.parkingLots.add(parkingLot);
    }

//    Assistant getAssistant(){
//        return this.assistant;
//    }

//    class Assistant{
//
//        void updateDisplay(Integer parkingLotId,Integer carsCount){
//            display.update(parkingLotId,carsCount);
//        }
//    }


}
