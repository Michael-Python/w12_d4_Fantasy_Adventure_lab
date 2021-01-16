package playersTest.healersTest;

import items.HealingTools;
import player.Player;
import player.fighter.Barbarians;
import player.healer.Clerics;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericsTest {

        Clerics healer;
        HealingTools heal20;
        Barbarians conan;

        @Before
        public void before() {
                healer = new Clerics("Priest", 80);
                heal20 = new HealingTools("Heal20", 20);
                conan = new Barbarians("Conan", 70);


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
        public void canUseHealingTool(){
                healer.changeHealing(heal20);
                healer.heal(healer.getEquippedHealingTools(), conan);
                assertEquals(90, conan.getHealthPoints());

        }
}

