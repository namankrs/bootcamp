package parking_lot;

public class Car {
    private Integer id;
    private static Integer latestCarId = 1;

    Car() {
        this.id = latestCarId;
        latestCarId++;
    }
}
