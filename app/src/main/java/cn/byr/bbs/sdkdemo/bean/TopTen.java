package cn.byr.bbs.sdkdemo.bean;

/**
 * Created by Thomas on 15/5/8.
 */
public class TopTen {
    /*
    * {"name":"topten",
    * "title":"十大热门话题",
    * "time":1431046742,
    * "article":[{"id":2770528,"group_id":2770528,"reply_id":2770528,"flag":"","position":0,"is_top":false,"is_subject":true,"has_attachment":true,"is_admin":false,"title":"【蒸祝福】每个女孩都值得拥有一个难忘的生日(39)","user":{"id":"miomi","user_name":"miomi","face_url":"http://static.byr.cn/uploadFace/M/miomi.4170.jpg","face_width":120,"face_height":120,"gender":"f","astro":"双子座","life":135,"qq":"","msn":"","home_page":"","level":"用户","is_online":false,"post_count":10,"last_login_time":1431042756,"last_login_ip":"223.104.3.*","is_hide":false,"is_register":true,"score":53},"post_time":1431012789,"board_name":"Feeling","content":"每个女孩的心中~\n都会有一个公主梦~\n里面会有英俊的王子~\n和公主踏著南瓜车过著幸福的","attachment":{"file":[{"name":"IMG_7121(0).JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532","size":"164.7KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532/middle"},{"name":"IMG_7123(0).JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191","size":"123.6KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191/middle"},{"name":"IMG_7116.JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808","size":"1.4MB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808/middle"},{"name":"IMG_7119.JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315","size":"1.1MB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315/middle"},{"name":"image_1431016349.542604.jpg","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441","size":"57KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441/middle"},{"name":"image_1431016231.463116.jpg","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890","size":"87.4KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890/middle"}],"remain_space":"2.1MB","remain_count":14},"reply_count":61,"last_reply_user_id":"wendao","last_reply_time":1431048136,"id_count":"39"},{"id":1713885,"group_id":1713885,"reply_id":1713885,"flag":"","position":0,"is_top":false,"is_subject":true,"has_attachment":false,"is_admin":false,"title":"[建议]不要总是选择困难模式(30)","user":{"id":"bswgd","user_name":"不是我干的 http://yanyiwu.com","face_url":"http://static.byr.cn/uploadFace/B/bswgd.7005.jpg","face_width":120,"face_height":115,"gender":"m","astro":"水瓶座","life":365,"qq":"64162451","msn":"","home_page":"http://yanyiwu.com","level":"用户","is_online":true,"post_count":1765,"last_login_time":1431046449,"last_login_ip":"221.222.200.*","is_hide":false,"is_register":true,"score":16643},"post_time":1431017824,"board_name":"Job","content":"大约去年十月份的时候，收到过一封印象深刻的邮件。 内容是关于编程的咨询，一个正读","attachment":{"file":[],"remain_space":"5MB","remain_count":20},"reply_count":37,"last_reply_user_id":"tongzhuoyuan","last_reply_time":1431048175,"id_count":"30"},{"id":1652971,"group_id":1652971,"reply_id":1652971,"flag":"","position":0,"is_top":false,"is_subject":true,"has_attachment":true,"is_admin":false,"title":"替亲爱的萌萌哒妹子定向征男票(26)","user":{"id":"Gabrielle09","user_name":"Gabrielle","face_url":"http://static.byr.cn/img/face_default_m.jpg","face_width":0,"face_height":0,"gender":"m","astro":"水瓶座","life":135,"qq":"","msn":"","home_page":"","
    * */
    private String name;
    private String title;
    private long time;
    private Article[] article;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Article[] getArticle() {
        return article;
    }

    public void setArticle(Article[] article) {
        this.article = article;
    }
}
