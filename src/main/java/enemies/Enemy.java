package enemies;

import player.Player;

public class Enemy {

    private String name;
    private int damage;
    private int healthPoints;

    public Enemy(String name, int damage, int healthPoints){
        this.name = name;
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damageAmount) {
        if (getHealthPoints() > damageAmount) {
            this.healthPoints -= damageAmount;
        } else {
            this.healthPoints = 0;
        }
    }

    public void attack(Player player) {
        player.takeDamage(damage);
    }
}
