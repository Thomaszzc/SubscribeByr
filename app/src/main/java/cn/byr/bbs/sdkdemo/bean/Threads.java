package cn.byr.bbs.sdkdemo.bean;

import java.util.List;

/**
 * Created by Thomas on 15/5/12.
 */
public class Threads {
    private Pagination pagination;
    private Article[] article;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Article[] getArticle() {
        return article;
    }

    public void setArticle(Article[] article) {
        this.article = article;
    }
}
