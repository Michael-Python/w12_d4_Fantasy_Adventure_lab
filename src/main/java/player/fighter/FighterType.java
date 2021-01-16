package player.fighter;

import enemies.Enemy;
import items.Weapons;

public abstract class FighterType extends player.Player {

    private Weapons equippedWeapon;

    public FighterType(String name, int healthPoints, int defence) {
        super(name, healthPoints, defence);
        this.equippedWeapon = null;
    }

    public Weapons getEquippedWeapon(){
        if(equippedWeapon == null) {
            return null;
        }
        return equippedWeapon ;
    }

    public void attack(Weapons weapons, Enemy enemy) {
        if(equippedWeapon == null) {
            return;
        }
        if(equippedWeapon != null) {
            enemy.takeDamage(weapons.getDamage());
        }

    }

    public void changeWeapons( Weapons newWeapons) {
        if (equippedWeapon != null){
            unEquipWeapon();
        }
        if (getInventory().contains(newWeapons)){
            equippedWeapon = newWeapons;
            removeFromInventory(newWeapons);
        }
    }

    private void unEquipWeapon() {
        addToInventory(equippedWeapon);
        equippedWeapon = null;
    }


}
