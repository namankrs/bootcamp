package parking_lot;

import java.util.HashSet;
import java.util.Set;

class ParkingLot {
    private static Integer latestId = 1;
    private Set<Car> cars;
    private Attendant attendant;
    private Integer capacity;
    private Integer id;

    ParkingLot(Integer capacity, Attendant attendant) {
        this.capacity = capacity;
        this.cars = new HashSet<>();
        this.id = latestId;
        setAttendant(attendant);
        latestId++;
    }

    private void setAttendant(Attendant attendant) {
        this.attendant = attendant;
        attendant.register(this);
    }


    boolean park(Car car) {
        if (this.cars.size() == capacity) return false;
        if (this.cars.size() == capacity - 1) this.attendant.notifyForFullParking(this.id);
        this.cars.add(car);
        notifyAssistant();

        return true;
    }

    private void notifyAssistant() {
        Assistant assistant = new Assistant(Display.getDisplay());
        assistant.updateDisplay(this.id, this.calculateCarsCount());
    }

    boolean unPark(Car car) {
        if(!this.cars.contains(car)) return false;

        if (this.cars.size() == this.capacity)
            this.attendant.notifyWhenFullParkingGetsFree(this.id);

        this.cars.remove(car);
        notifyAssistant();

        return true;
    }

    Integer getId() {
        return id;
    }


    Integer calculateCarsCount() {
        return this.cars.size();
    }
}
