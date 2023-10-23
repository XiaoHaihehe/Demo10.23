package com.entity;

import java.util.List;

public class Page {
    private int page=1;
    private int row=5;
    private int maxPage;
    private List<?> PageList;

    public Page() {
        super();
    }
    public Page(int page, int row, int maxPage, List<?> PageList) {
        super();
        this.page = page;
        this.row = row;
        this.maxPage = maxPage;
        this.PageList = PageList;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getMaxPage() {
        return maxPage;
    }
    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }
    public List<?> getPageList() {
        return PageList;
    }
    public void setPageList(List<?> PageList) {
        this.PageList = PageList;
    }

}
