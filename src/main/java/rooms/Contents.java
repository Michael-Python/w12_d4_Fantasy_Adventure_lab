package rooms;

public abstract class Contents {

    private String name;

    public Contents(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }
}
