package models;

/**
 * Created by User on 14/07/61.
 */
public class Human {
    private  String id,name;
    private int tall;

    public Human() {
    }

    public Human(String id, String name, int tall) {
        this.id = id;
        this.name = name;
        this.tall = tall;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }
}
