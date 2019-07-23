package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RoleResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleResourceId;

    private Long resourceid;

    private Long roleid;

    public Long getRoleResourceId() {
        return roleResourceId;
    }

    public void setRoleResourceId(Long roleResourceId) {
        this.roleResourceId = roleResourceId;
    }

    public Long getResourceid() {
        return resourceid;
    }

    public void setResourceid(Long resourceid) {
        this.resourceid = resourceid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}