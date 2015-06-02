package cn.byr.bbs.sdkdemo.bean;

/**
 * Created by Thomas on 15/6/2.
 */
public class SubSection {
    private String name;
    private String description;
    private boolean is_root;
    private String parent;
    private String[] sub_section;
    private Board[] board;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIs_root() {
        return is_root;
    }

    public void setIs_root(boolean is_root) {
        this.is_root = is_root;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String[] getSub_section() {
        return sub_section;
    }

    public void setSub_section(String[] sub_section) {
        this.sub_section = sub_section;
    }

    public Board[] getBoard() {
        return board;
    }

    public void setBoard(Board[] board) {
        this.board = board;
    }
}
