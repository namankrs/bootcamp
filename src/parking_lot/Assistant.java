package parking_lot;

public class Assistant {
    private Display display;

    public Assistant(Display display) {
        this.display = display;
    }

    void updateDisplay(Integer parkingLotId, Integer carsCount) {
        display.update(parkingLotId, carsCount);
    }
}
