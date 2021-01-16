package itemsTest;

import items.Creatures;
import items.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {

    Weapons weapons;

    @Before
    public void before(){
        weapons = new Weapons("Sword", 10);
    }

    @Test
    public void canGetWeaponName(){
        assertEquals("Sword", weapons.getName());
    }

    @Test
    public void canGetWeaponDamage(){
        assertEquals(10, weapons.getDamage());
    }

}
