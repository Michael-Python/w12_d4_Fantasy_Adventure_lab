package playersTest.fightersTest;

import enemies.Enemy;
import items.Weapons;
import player.fighter.Barbarians;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarians conan;
    Weapons weapons;
    Enemy orc;

    @Before
    public void before(){
        conan = new Barbarians("Conan", 100, 80);
        orc = new Enemy("Orky", 50, 100);
        weapons = new Weapons("Sword", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", conan.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, conan.getHealthPoints());
    }

    @Test
    public void canGetMaxHealth() {
        assertEquals(100, conan.getMaxHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        conan.takeDamage(100);
        assertEquals(80, conan.getHealthPoints());
    }

    @Test
    public void canGetDefencePoints(){
        assertEquals(80, conan.getDefence());
    }

    @Test
    public void noNegativeHealth() {
        conan.takeDamage(200);
        assertEquals(0, conan.getHealthPoints());
    }

    @Test
    public void canHeal() {
        conan.takeDamage(90);
        conan.addHealth(5);
        assertEquals(95, conan.getHealthPoints());
    }

    @Test
    public void noOverHealing() {
        conan.takeDamage(10);
        conan.addHealth(15);
        assertEquals(100, conan.getHealthPoints());
    }

    @Test
    public void canUseWeapon(){
        // add a weapon to the invetory
        conan.addToInventory(this.weapons);
        // equip that weapon
        conan.changeWeapons(weapons);
        conan.attack(conan.getEquippedWeapon(), orc);
        assertEquals(90, orc.getHealthPoints());
    }

}
