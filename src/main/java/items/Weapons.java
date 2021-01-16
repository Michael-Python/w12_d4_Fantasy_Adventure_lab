package items;

public class Weapons extends ItemType {

    private int damage;

    public Weapons(String name, int damage){
        super(name);
        this.damage = damage;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    public int getDamage() {
        return damage;
    }


}
