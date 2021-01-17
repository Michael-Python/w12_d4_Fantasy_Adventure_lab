package roomsTest;


import enemies.Enemy;
import items.Treasures;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    @Before

    public void before(){
        Treasures myPrecious = new Treasures("My Precious", 1000);
        Enemy orc = new Enemy("Orky", 50, 100);
        Enemy ogre = new Enemy("Zsolt", 70, 120);
        Enemy troll = new Enemy("Tony", 40, 80);
    }

//        one = new Room(1);
//        two = new Room(2);
//        three = new Room(3);
//        four = new Room(4);

    
//    @Test

//    public void getRoomNumber(){
//        assertEquals(1, one.getRoomNumber());
//    }
}
