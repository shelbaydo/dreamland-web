package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceid;

    private String resourcename;

    private String resourceurl;

    private String isavailable;

    private String note;

    public Long getResourceid() {
        return resourceid;
    }

    public void setResourceid(Long resourceid) {
        this.resourceid = resourceid;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename == null ? null : resourcename.trim();
    }

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl == null ? null : resourceurl.trim();
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