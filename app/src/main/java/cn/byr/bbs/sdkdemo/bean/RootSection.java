package cn.byr.bbs.sdkdemo.bean;

/**
 * Created by Thomas on 15/6/1.
 */
public class RootSection {
    private int section_count;
    private Section[] section;

    public int getSection_count() {
        return section_count;
    }

    public void setSection_count(int section_count) {
        this.section_count = section_count;
    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }
}
