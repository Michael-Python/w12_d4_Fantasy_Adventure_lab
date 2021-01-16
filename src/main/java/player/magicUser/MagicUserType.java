package player.magicUser;

import enemies.Enemy;
import items.Creatures;
import items.Spells;

public abstract class MagicUserType extends player.Player {

    private Spells equippedSpell;
    private Creatures equippedCreature;

    public MagicUserType(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedSpell = null;
        this.equippedCreature = null;
    }

    public Spells getEquippedSpell() {
        return equippedSpell;
    }

    public Creatures getEquippedCreature() {
        return equippedCreature;
    }

    public void castSpell(Spells spells, Enemy enemy) {
        enemy.takeDamage(spells.getDamage());
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
