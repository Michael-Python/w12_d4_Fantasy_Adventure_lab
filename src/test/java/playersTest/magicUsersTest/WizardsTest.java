package playersTest.magicUsersTest;

import org.junit.Before;
import org.junit.Test;
import player.magicUser.Wizards;

import static org.junit.Assert.assertEquals;

public class WizardsTest {

    Wizards merlin;

    @Before
    public void before(){ merlin = new Wizards("Merlin", 85, 0); }

    @Test
    public void canGetName(){
        assertEquals("Merlin", merlin.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(85, merlin.getHealthPoints());
    }
}
