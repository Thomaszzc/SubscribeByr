package cn.byr.bbs.sdkdemo.bean;

/**
 * Created by Thomas on 15/5/6.
 */
public class User {
    /*"id":"thomaszzc",
    "user_name":"thomas的小火车",
    "face_url":"http://static.byr.cn/uploadFace/T/thomaszzc.3009.jpg",
    "face_width":99,
    "face_height":120,
    "gender":"m",
    "astro":"射手座",
    "life":135,
    "qq":"",
    "msn":"",
    "home_page":"",
    "level":"用户",
    "is_online":true,
    "post_count":799,
    "last_login_time":1430924061,
    "last_login_ip":"10.210.94.5",
    "is_hide":false,
    "is_register":true,
    "score":6405,
    "is_admin":false,
    "first_login_time":1378564879,
    "login_count":2971,
    "stay_count":4906428,
    "role":"在校生用户"
    */
    private String id;
    private String user_name;
    private String face_url;
    private int face_width;
    private int face_height;
    private String gender;
    private String astro;
    private int life;
    private String qq;
    private String msn;
    private String home_page;
    private String level;
    private boolean is_online;
    private int post_count;
    private long last_login_time;
    private String last_login_ip;
    private boolean is_hide;
    private boolean is_register;
    private int score;
    private boolean is_admin;
    private long first_login_time;
    private int login_count;
    private long stay_count;
    private String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getFace_url() {
        return face_url;
    }

    public void setFace_url(String face_url) {
        this.face_url = face_url;
    }

    public int getFace_width() {
        return face_width;
    }

    public void setFace_width(int face_width) {
        this.face_width = face_width;
    }

    public int getFace_height() {
        return face_height;
    }

    public void setFace_height(int face_height) {
        this.face_height = face_height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAstro() {
        return astro;
    }

    public void setAstro(String astro) {
        this.astro = astro;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getHome_page() {
        return home_page;
    }

    public void setHome_page(String home_page) {
        this.home_page = home_page;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isIs_online() {
        return is_online;
    }

    public void setIs_online(boolean is_online) {
        this.is_online = is_online;
    }

    public int getPost_count() {
        return post_count;
    }

    public void setPost_count(int post_count) {
        this.post_count = post_count;
    }

    public long getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(long last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public boolean isIs_hide() {
        return is_hide;
    }

    public void setIs_hide(boolean is_hide) {
        this.is_hide = is_hide;
    }

    public boolean isIs_register() {
        return is_register;
    }

    public void setIs_register(boolean is_register) {
        this.is_register = is_register;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public long getFirst_login_time() {
        return first_login_time;
    }

    public void setFirst_login_time(long first_login_time) {
        this.first_login_time = first_login_time;
    }

    public int getLogin_count() {
        return login_count;
    }

    public void setLogin_count(int login_count) {
        this.login_count = login_count;
    }

    public long getStay_count() {
        return stay_count;
    }

    public void setStay_count(long stay_count) {
        this.stay_count = stay_count;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
