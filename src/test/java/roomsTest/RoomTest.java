package roomsTest;


import enemies.Enemy;
import items.Treasures;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room one;
    Room two;
    Room three;
    Room four;
    
    @Before 
    public void before(){
        one = new Room(1);
        two = new Room(2);
        three = new Room(3);
        four = new Room(4);
    }
    
    @Test

    public void getRoomNumber(){
        assertEquals(1, one.getRoomNumber());
    }
}
