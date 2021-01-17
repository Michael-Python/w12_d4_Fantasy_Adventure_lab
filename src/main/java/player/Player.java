package player;

import items.ItemType;

import java.util.ArrayList;

public abstract class Player {

    private final String name;
    private final int maxHealthPoints;

    private int healthPoints;
    private ArrayList<ItemType> inventory;
    private int defence;

    public Player(String name, int healthPoints, int defence) {
        this.name = name;
        this.maxHealthPoints = healthPoints;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<ItemType>();
        this.defence = defence;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDefence(){
        return defence;
    }

    public ArrayList<ItemType> getInventory() {
        return inventory;
    }

    // The method formerly known as collect
    public void addToInventory(ItemType item) {
        inventory.add(item);
    }

    public void removeFromInventory(ItemType item) {
        inventory.remove(item);
    }

    public void takeDamage(int damageAmount) {
        if (getDefence() > damageAmount) {
            this.defence -= damageAmount;
        }
        else if (getDefence() == 0){
            if (getHealthPoints() > damageAmount) {
                this.healthPoints -= damageAmount;
            } else {
                this.healthPoints = 0;
            }
        } else {
            damageAmount -= getDefence();
            if (getHealthPoints() > damageAmount) {
                this.healthPoints -= damageAmount;
            } else {
                this.healthPoints = 0;
            }
        }

    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void addHealth(int pointsToHeal) {

        if ((healthPoints + pointsToHeal) > getMaxHealthPoints()) {
            healthPoints = getMaxHealthPoints();
        }
        else {
            healthPoints += pointsToHeal;
        }
    }
}
