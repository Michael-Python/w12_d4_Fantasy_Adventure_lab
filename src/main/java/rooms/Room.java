package rooms;

import enemies.Enemy;
import items.Treasures;

import java.util.ArrayList;

public class Room {

    private Treasures foundTreasure;
    private Enemy hiddenEnemy;
    private ArrayList<Contents> roomContents;
    private int roomNumber;

    public Room(int roomNumber) {

        this.roomNumber = roomNumber;
        this.foundTreasure = null;
        this.hiddenEnemy = null;
        this.roomContents = new ArrayList<Contents>();
    }

    public ArrayList<Contents> getInventory() {
        return roomContents;
    }


    public void addToInventory(Contents inTheRoom) {
        roomContents.add(inTheRoom);
    }

    public Treasures getFoundTreasure() {
        if(foundTreasure == null){
            return null;
        }
        return foundTreasure;
    }

    public Enemy getHiddenEnemy() {
        if(hiddenEnemy == null){
            return null;
        }
        return hiddenEnemy;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}


