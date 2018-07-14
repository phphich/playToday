package models;

/**
 * Created by User on 14/07/61.
 */
public class Room {
    private String id, name;

    public Room() {
    }

    public Room(String id, String name) {
        this.id = id;
        this.name = name;
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
}
