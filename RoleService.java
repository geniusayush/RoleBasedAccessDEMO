package locus;

import java.util.HashMap;

public class RoleService {
    private HashMap<String, Role> roleMap = new HashMap<String, Role>();

    public void createRole() {
        String id = null;
        Role r = new Role(id);
        roleMap.put(id, r);

    }

    public Role getRole(String id) {
        return roleMap.get(id);
    }

    public HashMap<String, Role> getRoleMap() {
        return roleMap;
    }
}
