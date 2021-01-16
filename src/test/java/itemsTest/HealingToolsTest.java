package itemsTest;

import items.HealingTools;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolsTest {

    HealingTools healingTools;

    @Before
    public void before(){
        healingTools = new HealingTools("heal20", 30);
    }

    @Test
    public void canHaveName(){assertEquals("heal20",healingTools.getName());}

    @Test
    public void canHaveHealingPoints(){
        assertEquals(30, healingTools.getHealingPoints());
    }
}
