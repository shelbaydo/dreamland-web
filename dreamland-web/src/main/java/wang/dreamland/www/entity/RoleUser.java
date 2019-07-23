package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleUserId;

    private Long userid;

    private Long roleid;

    public Long getRoleUserId() {
        return roleUserId;
    }

    public void setRoleUserId(Long roleUserId) {
        this.roleUserId = roleUserId;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}