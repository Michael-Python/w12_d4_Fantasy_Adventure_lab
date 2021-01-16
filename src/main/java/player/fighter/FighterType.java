package player.fighter;

import enemies.Enemy;
import items.Weapons;

public abstract class FighterType extends player.Player {

    private Weapons equippedWeapon;

    public FighterType(String name, int healthPoints) {
        super(name, healthPoints);
        this.equippedWeapon = null;
    }

    public Weapons getEquippedWeapon(){ return equippedWeapon ; }

    public void attack(Weapons weapons, Enemy enemy) {
        enemy.takeDamage(weapons.getDamage());

    }

    public void changeWeapons( Weapons newWeapons) {
        if (equippedWeapon != null){
            addToInventory(equippedWeapon);
        }
        if (getInventory().contains(newWeapons)){
            removeFromInventory(newWeapons);
            equippedWeapon = newWeapons;
        }
    }


}
