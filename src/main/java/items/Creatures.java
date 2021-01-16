package items;

public class Creatures extends ItemType{

    public int defence;

    public Creatures(String name, int defence){
        super(name);
        this.defence = defence;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getDefence() {
        return defence;
    }
}
