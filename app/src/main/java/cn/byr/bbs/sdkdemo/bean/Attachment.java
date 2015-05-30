package cn.byr.bbs.sdkdemo.bean;

/**附件类
 * Created by Thomas on 15/5/8.
 */
public class Attachment {
    /*
    * "attachment":{"file":[{"name":"IMG_7121(0).JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532","size":"164.7KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/3532/middle"},
    {"name":"IMG_7123(0).JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191","size":"123.6KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/172191/middle"},
    {"name":"IMG_7116.JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808","size":"1.4MB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/298808/middle"},
    {"name":"IMG_7119.JPG","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315","size":"1.1MB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/1724315/middle"},
    {"name":"image_1431016349.542604.jpg","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441","size":"57KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2875441/middle"},
    {"name":"image_1431016231.463116.jpg","url":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890","size":"87.4KB","thumbnail_small":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890/small","thumbnail_middle":"http://bbs.byr.cn/api/attachment/Feeling/2770528/2933890/middle"}],
    "remain_space":"2.1MB","remain_count":14},
    * */
    private File[] file;
    private String remain_space;
    private int remain_count;

    public File[] getFile() {
        return file;
    }

    public void setFile(File[] file) {
        this.file = file;
    }

    public String getRemain_space() {
        return remain_space;
    }

    public void setRemain_space(String remain_space) {
        this.remain_space = remain_space;
    }

    public int getRemain_count() {
        return remain_count;
    }

    public void setRemain_count(int remain_count) {
        this.remain_count = remain_count;
    }
}
