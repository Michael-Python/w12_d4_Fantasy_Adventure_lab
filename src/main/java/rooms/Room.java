package rooms;

import enemies.Enemy;
import items.Treasures;

public class Room {

    private Treasures treasure;
    private Enemy enemy;

    public Room (Treasures treasure, Enemy enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }

    public Treasures getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

}
