package cn.byr.bbs.sdkdemo.bean;

import java.util.List;

/**
 * Created by Thomas on 15/6/2.
 */
public class Board {
    private String name;
    private String manager;
    private String description;
    private String classify;
    private String section;
    private int post_today_count;
    private int post_threads_count;
    private int post_all_count;
    private boolean is_read_only;
    private boolean is_no_reply;
    private boolean allow_attachment;
    private boolean allow_anonymous;
    private boolean allow_outgo;
    private boolean allow_post;
    private int user_online_count;
    private int user_online_max_count;
    private int user_online_max_time;
    private Pagination pagination;
    private List<Article> article;
    private String board_name_short;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getPost_today_count() {
        return post_today_count;
    }

    public void setPost_today_count(int post_today_count) {
        this.post_today_count = post_today_count;
    }

    public int getPost_threads_count() {
        return post_threads_count;
    }

    public void setPost_threads_count(int post_threads_count) {
        this.post_threads_count = post_threads_count;
    }

    public int getPost_all_count() {
        return post_all_count;
    }

    public void setPost_all_count(int post_all_count) {
        this.post_all_count = post_all_count;
    }

    public boolean isIs_read_only() {
        return is_read_only;
    }

    public void setIs_read_only(boolean is_read_only) {
        this.is_read_only = is_read_only;
    }

    public boolean isIs_no_reply() {
        return is_no_reply;
    }

    public void setIs_no_reply(boolean is_no_reply) {
        this.is_no_reply = is_no_reply;
    }

    public boolean isAllow_attachment() {
        return allow_attachment;
    }

    public void setAllow_attachment(boolean allow_attachment) {
        this.allow_attachment = allow_attachment;
    }

    public boolean isAllow_anonymous() {
        return allow_anonymous;
    }

    public void setAllow_anonymous(boolean allow_anonymous) {
        this.allow_anonymous = allow_anonymous;
    }

    public boolean isAllow_outgo() {
        return allow_outgo;
    }

    public void setAllow_outgo(boolean allow_outgo) {
        this.allow_outgo = allow_outgo;
    }

    public boolean isAllow_post() {
        return allow_post;
    }

    public void setAllow_post(boolean allow_post) {
        this.allow_post = allow_post;
    }

    public int getUser_online_count() {
        return user_online_count;
    }

    public void setUser_online_count(int user_online_count) {
        this.user_online_count = user_online_count;
    }

    public int getUser_online_max_count() {
        return user_online_max_count;
    }

    public void setUser_online_max_count(int user_online_max_count) {
        this.user_online_max_count = user_online_max_count;
    }

    public int getUser_online_max_time() {
        return user_online_max_time;
    }

    public void setUser_online_max_time(int user_online_max_time) {
        this.user_online_max_time = user_online_max_time;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }

    public String getBoard_name_short() {
        return board_name_short;
    }

    public void setBoard_name_short(String board_name_short) {
        this.board_name_short = board_name_short;
    }
}
