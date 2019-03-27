package parking_lot;

import java.util.HashMap;
import java.util.Map;

class Display {
    private static Display display = null;
    private Map<Integer, Integer> details;

    private Display() {
        this.details = new HashMap<>();
    }


    static Display getDisplay() {
        if (display == null) display = new Display();
        return display;
    }


    void update(Integer parkingLotId, Integer carCount) {
        this.details.put(parkingLotId, carCount);
    }
}