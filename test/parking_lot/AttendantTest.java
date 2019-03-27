package parking_lot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AttendantTest {

    @Test
    void shouldRegisterParkingLot() {
        Attendant attendant = new Attendant(new Assistant(Display.getDisplay()));
        ParkingLot parkingLot = new ParkingLot(2, attendant);
        assertTrue(attendant.register(parkingLot));
    }

//    @Test
//    void assistantShouldUpdateDisplay() {
//        Attendant testAttendant = new TestAttendant(Display.getDisplay());
//        ParkingLot parkingLot = new ParkingLot(2, testAttendant);
//        Assistant assistant = testAttendant.getAssistant();
//
//        assistant.updateDisplay(parkingLot.getId(), 0);
//        assertTrue(((TestAttendant) testAttendant.updateDisplayCalled);
//    }
}

//class TestAttendant extends Attendant {
//    protected boolean updateDisplayCalled = false;
//
//    TestAttendant(Display display) {
//        super(display);
//        this.assistant = new TestAssistant();
//    }
//
//
//
//    class TestAssistant {
//        void updateDisplay(Integer parkingLotId, Integer carsCount) {
//            updateDisplayCalled = true;
//        }
//    }
//
//}
