package locus;

import java.util.LinkedList;

public class Resource {
    private String location;
    private String path;
    private final LinkedList<Role>[] acessList = new LinkedList[Action.values().length];

    public Resource(String location, String path) {
        this.location = location;
        this.path = path;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void grantAccess(Role roleId, Action[] actionType) {
        for (Action type : actionType) {
            acessList[type.getNum()].add(roleId);
        }

    }

    public boolean canAccess(User user, Action actiom) {
        LinkedList<Role> roles = user.getRoles();
        for (Role r : acessList[actiom.getNum()]) {
            if (roles.contains(r)) return true;
        }
        return false;

    }
}
