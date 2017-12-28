package locus;

import java.util.HashMap;

public class UserService {
    private HashMap<String, User> userMap = new HashMap<String, User>();

    public User addUsers(String name, String id) {
        User u = new User(name, id);
        userMap.put(id, u);
        return u;
    }

    public User getUser(String id) {
        return userMap.get(id);
    }

    public User addRole(String userID, Role role) {
        userMap.get(userID).addRoles(role);
        return userMap.get(userID);
    }
}
