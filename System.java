package locus;

public class System {
   private ResourceService res = new ResourceService();
    private RoleService ros = new RoleService();
    private UserService us = new UserService();


    public static void main(String[] args) {

    }

    private void canAccess(String resourceId, String useriD, int actiom) {

        res.canAccess(resourceId, actiom, us.getUser(useriD));
    }

    private void grantAccess(String resourceId, String roleId, Action[] actionType) {

        res.grantAccess(resourceId, ros.getRole(roleId), actionType);

    }

}

