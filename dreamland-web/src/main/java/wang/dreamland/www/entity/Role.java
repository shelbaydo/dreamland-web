package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleid;

    private String rolename;

    private String rolevalue;

    private String roleurl;

    private String isavailable;

    private String note;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolevalue() {
        return rolevalue;
    }

    public void setRolevalue(String rolevalue) {
        this.rolevalue = rolevalue == null ? null : rolevalue.trim();
    }

    public String getRoleurl() {
        return roleurl;
    }

    public void setRoleurl(String roleurl) {
        this.roleurl = roleurl == null ? null : roleurl.trim();
    }

    public String getIsavailable() {
        return isavailable;
    }

    public void setIsavailable(String isavailable) {
        this.isavailable = isavailable == null ? null : isavailable.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}