package playersTest.fightersTest;

import player.fighter.Knights;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knights sirGalahad;

    @Before
    public void before() {sirGalahad = new Knights("Sir Galahad", 150,0); }

    @Test
    public void hasName(){
        assertEquals("Sir Galahad", sirGalahad.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(150, sirGalahad.getHealthPoints());
    }
}

