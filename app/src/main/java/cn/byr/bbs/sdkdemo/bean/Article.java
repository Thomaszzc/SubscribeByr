package cn.byr.bbs.sdkdemo.bean;

import android.os.Parcelable;

import java.io.Serializable;

import javax.security.auth.PrivateCredentialPermission;

/**
 * Created by Thomas on 15/5/8.
 */
public class Article implements Serializable{
    /* "article":[
    {"id":2770528,
    "group_id":2770528,
    "reply_id":2770528,
    "flag":"",
    "position":0,"is_top":false,"is_subject":true,"has_attachment":true,"is_admin":false,
    "title":"【蒸祝福】每个女孩都值得拥有一个难忘的生日(39)",
    "user":{"id":"miomi","user_name":"miomi","face_url":"http://static.byr.cn/uploadFace/M/miomi.4170.jpg","face_width":120,"face_height":120,"gender":"f","astro":"双子座","life":135,"qq":"","msn":"","home_page":"","level":"用户","is_online":false,"post_count":10,"last_login_time":1431042756,"last_login_ip":"223.104.3.*","is_hide":false,"is_register":true,"score":53},
    "post_time":1431012789,
    "board_name":"Feeling",
    "content":"每个女孩的心中~\n都会有一个公主梦~\n里面会有英俊的王子~\n和公主踏著南瓜车过著幸福的",
    "attachment":{"file":[{"name":"IMG_7121(0).JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532","size":"164.7KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532/middle"},
    {"name":"IMG_7123(0).JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191","size":"123.6KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191/middle"},
    {"name":"IMG_7116.JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808","size":"1.4MB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808/middle"},
    {"name":"IMG_7119.JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315","size":"1.1MB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315/middle"},
    {"name":"image_1431016349.542604.jpg","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441","size":"57KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441/middle"},
    {"name":"image_1431016231.463116.jpg","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890","size":"87.4KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890/middle"}],
    "remain_space":"2.1MB","remain_count":14},
    "reply_count":61,"last_reply_user_id":"wendao","last_reply_time":1431048136,"id_count":"39"},
    {"id":1713885,"group_id":1713885,"reply_id":1713885,"flag":"","position":0,"is_top":false,"is_subject":true,"has_attachment":false,"is_admin":false,
    "title":"[建议]不要总是选择困难模式(30)",
    "user":{"id":"bswgd","user_name":"不是我干的 http://yanyiwu.com","face_url":"http://static.byr.cn/uploadFace/B/bswgd.7005.jpg","face_width":120,"face_height":115,"gender":"m","astro":"水瓶座","life":365,"qq":"64162451","msn":"","home_page":"http://yanyiwu.com","level":"用户","is_online":true,"post_count":1765,"last_login_time":1431046449,"last_login_ip":"221.222.200.*","is_hide":false,"is_register":true,"score":16643},
    "post_time":1431017824,"board_name":"Job","content":"大约去年十月份的时候，收到过一封印象深刻的邮件。 内容是关于编程的咨询，一个正读",
    "attachment":{"file":[],"remain_space":"5MB","remain_count":20},
    "reply_count":37,"last_reply_user_id":"tongzhuoyuan","last_reply_time":1431048175,"id_count":"30"},{"id":1652971,"group_id":1652971,"reply_id":1652971,"flag":"","position":0,"is_top":false,"is_subject":true,"has_attachment":true,"is_admin":false,"title":"替亲爱的萌萌哒妹子定向征男票(26)","user":{"id":"Gabrielle09","user_name":"Gabrielle","face_url":"http://static.byr.cn/img/face_default_m.jpg","face_width":0,"face_height":0,"gender":"m","astro":"水瓶座","life":135,"qq":"","msn":"","home_page":"","
    * */
    private int id;
    private int group_id;
    private int reply_id;
    private String flag;
    private int position;
    private boolean is_top;
    private boolean is_subject;
    private boolean has_attachment;
    private boolean is_admin;
    private String title;
    private User user;
    private int post_time;
    private String board_name;
    private String content;
    private Attachment attachment;
    private int previous_id;
    private int next_id;
    private int thread_previous_id;
    private int thread_next_id;
    private int reply_count;
    private String last_reply_user_id;
    private int last_reply_time;
    private int id_count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isIs_top() {
        return is_top;
    }

    public void setIs_top(boolean is_top) {
        this.is_top = is_top;
    }

    public boolean isIs_subject() {
        return is_subject;
    }

    public void setIs_subject(boolean is_subject) {
        this.is_subject = is_subject;
    }

    public boolean isHas_attachment() {
        return has_attachment;
    }

    public void setHas_attachment(boolean has_attachment) {
        this.has_attachment = has_attachment;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPost_time() {
        return post_time;
    }

    public void setPost_time(int post_time) {
        this.post_time = post_time;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public int getPrevious_id() {
        return previous_id;
    }

    public void setPrevious_id(int previous_id) {
        this.previous_id = previous_id;
    }

    public int getNext_id() {
        return next_id;
    }

    public void setNext_id(int next_id) {
        this.next_id = next_id;
    }

    public int getThread_previous_id() {
        return thread_previous_id;
    }

    public void setThread_previous_id(int thread_previous_id) {
        this.thread_previous_id = thread_previous_id;
    }

    public int getThread_next_id() {
        return thread_next_id;
    }

    public void setThread_next_id(int thread_next_id) {
        this.thread_next_id = thread_next_id;
    }

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }

    public String getLast_reply_user_id() {
        return last_reply_user_id;
    }

    public void setLast_reply_user_id(String last_reply_user_id) {
        this.last_reply_user_id = last_reply_user_id;
    }

    public int getLast_reply_time() {
        return last_reply_time;
    }

    public void setLast_reply_time(int last_reply_time) {
        this.last_reply_time = last_reply_time;
    }

    public int getId_count() {
        return id_count;
    }

    public void setId_count(int id_count) {
        this.id_count = id_count;
    }
}
