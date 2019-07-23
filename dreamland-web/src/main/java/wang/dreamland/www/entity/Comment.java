package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long contentid;

    private Long readerid;

    private Long userid;

    private Date comtime;

    private String subcomids;

    private Integer comthumbupnum;

    private String comcontent;

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

    public Long getReaderid() {
        return readerid;
    }

    public void setReaderid(Long readerid) {
        this.readerid = readerid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getComtime() {
        return comtime;
    }

    public void setComtime(Date comtime) {
        this.comtime = comtime;
    }

    public String getSubcomids() {
        return subcomids;
    }

    public void setSubcomids(String subcomids) {
        this.subcomids = subcomids == null ? null : subcomids.trim();
    }

    public Integer getComthumbupnum() {
        return comthumbupnum;
    }

    public void setComthumbupnum(Integer comthumbupnum) {
        this.comthumbupnum = comthumbupnum;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent == null ? null : comcontent.trim();
    }
}