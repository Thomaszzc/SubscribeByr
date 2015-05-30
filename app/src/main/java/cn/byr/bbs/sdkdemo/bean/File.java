package cn.byr.bbs.sdkdemo.bean;

/**
 * 附件中的文件
 * Created by Thomas on 15/5/8.
 */
public class File {

    private String name;
    private String url;
    private String size;
    private String thumbnail_small;
    private String thumbnail_middle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getThumbnail_small() {
        return thumbnail_small;
    }

    public void setThumbnail_small(String thumbnail_small) {
        this.thumbnail_small = thumbnail_small;
    }

    public String getThumbnail_middle() {
        return thumbnail_middle;
    }

    public void setThumbnail_middle(String thumbnail_middle) {
        this.thumbnail_middle = thumbnail_middle;
    }
}
