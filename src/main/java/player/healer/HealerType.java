package player.healer;

import items.HealingTools;
import player.fighter.FighterType;

public abstract class HealerType extends player.Player {

    private HealingTools equippedHealingTools;

    public HealerType(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedHealingTools = null;
    }


    public HealingTools getEquippedHealingTools(){
        return equippedHealingTools;
    }

    public void heal(HealingTools healingTools, FighterType fighterType){
        fighterType.heal(healingTools.getHealthPoints());
    }

    public void changeHealing(HealingTools newHealingTools) {
        if (equippedHealingTools != null) {
            addToInventory(equippedHealingTools);

            if (getInventory().contains(newHealingTools)) {
                removeFromInventory(newHealingTools);
                equippedHealingTools = newHealingTools;
            }
        }
    }
}