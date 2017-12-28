package locus;

import java.util.HashMap;

public class ResourceService {
    private HashMap<String, Resource> resourceMap = new HashMap<String, Resource>();

    public Resource getResource(String id) {
        return resourceMap.get(id);
    }

    private Resource addResource(String id, String path) {
        //getDeails
        Resource r = new Resource(id, path);
        resourceMap.put(id, r);
        return r;
    }

    public void grantAccess(String resourceId, Role role, Action[] actionType) {
        Resource res = resourceMap.get(resourceId);
        res.grantAccess(role, actionType);
    }

    public void canAccess(String resourceId, int actiom, User user) {
        resourceMap.get(resourceId).canAccess(user, Action.valueOf(actiom + ""));
    }
}
