package models;

/**
 * Created by COM-1 on 14/7/2561.
 */
public class Electric {
    private String id, name;

    public Electric() {
    }

    public Electric(String id, String name) {
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
