package playersTest.magicUsersTest;

import enemies.Enemy;
import items.Spells;
import org.junit.Before;
import org.junit.Test;
import player.magicUser.Warlocks;

import static org.junit.Assert.assertEquals;


public class WarlocksTest {

    Warlocks voldy;
    Enemy orc;
    Spells leviosa;

    @Before
    public void before() {
        voldy = new Warlocks("Voldemort", 3000);
        orc = new Enemy("Orky", 50, 100);
        leviosa = new Spells("Leviosa", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Voldemort", voldy.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(3000, voldy.getHealthPoints());
    }

    @Test
    public void canCastSpell() {
        // add a spell to the inventory
        voldy.addToInventory(this.leviosa);
        // equip that weapon
        voldy.changeSpells(leviosa);
        voldy.castSpell(voldy.getEquippedSpell(), orc);
        assertEquals(90, orc.getHealthPoints());
    }
}
