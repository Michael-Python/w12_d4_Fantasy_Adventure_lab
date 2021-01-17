package player.healer;

import items.HealingTools;
import player.fighter.FighterType;
import player.magicUser.MagicUserType;

public abstract class HealerType extends player.Player {

    private HealingTools equippedHealingTools;

    public HealerType(String name, int healthPoints, int defencePoints) {
        super(name, healthPoints, defencePoints);
        this.equippedHealingTools = null;
    }


    public HealingTools getEquippedHealingTools(){
        return equippedHealingTools;
    }

    public void heal(HealingTools healingTools, HealerType healerType){
        if(healingTools != null) {
            healerType.addHealth(healingTools.getHealingPoints());
        }
    }


    public void changeHealing(HealingTools newHealingTools) {
        if (equippedHealingTools != null) {
            addToInventory(equippedHealingTools);
        }

        if (getInventory().contains(newHealingTools)) {
            removeFromInventory(newHealingTools);
            equippedHealingTools = newHealingTools;
        }
    }
}
