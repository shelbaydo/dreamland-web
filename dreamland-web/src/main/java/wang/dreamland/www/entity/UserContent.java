package wang.dreamland.www.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class UserContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userid;

    private String title;

    private String catagory;

    private String isprivate;

    private Date uploadtime;

    private String profileurl;

    private String nickname;

    private Integer thumbup;

    private Integer thumbdown;

    private Integer comnum;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory == null ? null : catagory.trim();
    }

    public String getIsprivate() {
        return isprivate;
    }

    public void setIsprivate(String isprivate) {
        this.isprivate = isprivate == null ? null : isprivate.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl == null ? null : profileurl.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getThumbup() {
        return thumbup;
    }

    public void setThumbup(Integer thumbup) {
        this.thumbup = thumbup;
    }

    public Integer getThumbdown() {
        return thumbdown;
    }

    public void setThumbdown(Integer thumbdown) {
        this.thumbdown = thumbdown;
    }

    public Integer getComnum() {
        return comnum;
    }

    public void setComnum(Integer comnum) {
        this.comnum = comnum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}