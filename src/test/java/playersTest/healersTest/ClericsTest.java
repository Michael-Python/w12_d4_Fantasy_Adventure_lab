package playersTest.healersTest;

import items.HealingTools;
import player.fighter.Barbarians;
import player.healer.Clerics;
import org.junit.Before;
import org.junit.Test;
import player.magicUser.Warlocks;

import static org.junit.Assert.assertEquals;

public class ClericsTest {

        Clerics healer;
        HealingTools heal20;
        Barbarians conan;
        Warlocks voldy;

        @Before
        public void before() {
                healer = new Clerics("Priest", 80);
                heal20 = new HealingTools("Heal20", 20);
                conan = new Barbarians("Conan", 70);
                voldy = new Warlocks("Voldemort", 3000);


        }

        @Test
        public void canGetName(){
                assertEquals("Priest", healer.getName());
        }

        @Test
        public void canGetHealthPoints(){
                assertEquals(80, healer.getHealthPoints());
        }

        @Test
        public void canTakeDamage() {
                healer.takeDamage(20);
                assertEquals(60, healer.getHealthPoints());
        }

        @Test
        public void canUseHealingTool(){
                // add a healing tool to the inventory
                healer.addToInventory(this.heal20);
                healer.takeDamage(20);
                // equip that weapon
                healer.changeHealing(heal20);
                healer.heal(healer.getEquippedHealingTools(), healer);
                assertEquals(80, healer.getHealthPoints());

        }
}

