package items;

public abstract class ItemType {

    private String name;

    public ItemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
