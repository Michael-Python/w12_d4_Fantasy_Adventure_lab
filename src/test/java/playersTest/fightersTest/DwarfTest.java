package playersTest.fightersTest;


import player.fighter.Dwarves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DwarfTest {

    Dwarves thorin;

    @Before
    public void before(){ thorin = new Dwarves("Thorin", 200, 0);
    }

    @Test
    public void hasName(){
        assertEquals("Thorin", thorin.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, thorin.getHealthPoints());
    }


}
