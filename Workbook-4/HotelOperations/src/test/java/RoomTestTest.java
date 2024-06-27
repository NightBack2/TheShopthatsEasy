import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class RoomTest {

    @Test
    public void testCheckIn() {
        Room room = new Room();
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void testCheckOut() {
        Room room = new Room();
        room.checkIn();
        room.checkOut();
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    public void testCleanRoom() {
        Room room = new Room();
        room.checkIn();
        room.cleanRoom();
        assertFalse(room.isDirty());
    }
}
