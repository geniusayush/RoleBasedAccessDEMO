package locus;

import java.util.LinkedList;

public class User {
    private final LinkedList<Role> roles = new LinkedList<Role>();
    private String name;
    private String ID;

    public User(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LinkedList<Role> getRoles() {
        return roles;
    }

    public void addRoles(Role r) {
        roles.add(r);

    }

}
