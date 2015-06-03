package cn.byr.bbs.sdkdemo.bean;

/**
 * Created by Thomas on 15/6/3.
 * 搜索结果
 */
public class SearchRes {
    private Threads[] threads;
    private Pagination pagination;

    public Threads[] getThreads() {
        return threads;
    }

    public void setThreads(Threads[] threads) {
        this.threads = threads;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
