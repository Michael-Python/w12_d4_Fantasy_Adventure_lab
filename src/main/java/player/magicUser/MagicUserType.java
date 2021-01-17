package player.magicUser;

import enemies.Enemy;
import items.Creatures;
import items.Spells;

public abstract class MagicUserType extends player.Player {

    private int defence;
    private Spells equippedSpell;
    private Creatures equippedCreature;

    public MagicUserType(String name, int healthPoints, int defence) {
        super(name, healthPoints, defence);
        this.equippedSpell = null;
        this.equippedCreature = null;
        this.defence = defence;
    }

    public Spells getEquippedSpell() {
        return equippedSpell;
    }

    public Creatures getEquippedCreature() {
        if(equippedCreature == null){
            return null;
        }
        return equippedCreature;
    }

    public void castSpell(Spells spells, Enemy enemy) {
        enemy.takeDamage(spells.getDamage());
    }

    public void useCreatureDefense(Creatures newCreature, MagicUserType magicUserType){
        if(equippedCreature == null) {
            return;
        }
        if(equippedCreature != null) {
            magicUserType.addDefence(newCreature.getDefence());
        }

    }

    public void changeSpells(Spells newSpell) {
        if (equippedSpell != null) {
            addToInventory(equippedSpell);
        }
        if (getInventory().contains(newSpell)) {
            removeFromInventory(newSpell);
            equippedSpell = newSpell;
        }
    }

    public void changeCreature(Creatures newCreature) {
        if (equippedCreature != null) {
            addToInventory(equippedCreature);
        }
        if (getInventory().contains(newCreature)) {
            removeFromInventory(newCreature);
            equippedCreature = newCreature;
        }
    }



}
