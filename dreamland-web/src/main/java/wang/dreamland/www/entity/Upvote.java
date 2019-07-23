package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Upvote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long thumbid;

    private Long id;

    private Long contentid;

    private Long userid;

    private String thumbup;

    private String thumbdown;

    private String userip;

    private Date thumbtime;

    public Long getThumbid() {
        return thumbid;
    }

    public void setThumbid(Long thumbid) {
        this.thumbid = thumbid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentid() {
        return contentid;
    }

    public void setContentid(Long contentid) {
        this.contentid = contentid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getThumbup() {
        return thumbup;
    }

    public void setThumbup(String thumbup) {
        this.thumbup = thumbup == null ? null : thumbup.trim();
    }

    public String getThumbdown() {
        return thumbdown;
    }

    public void setThumbdown(String thumbdown) {
        this.thumbdown = thumbdown == null ? null : thumbdown.trim();
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public Date getThumbtime() {
        return thumbtime;
    }

    public void setThumbtime(Date thumbtime) {
        this.thumbtime = thumbtime;
    }
}