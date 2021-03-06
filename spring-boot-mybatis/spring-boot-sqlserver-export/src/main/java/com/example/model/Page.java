package com.example.model;

/**
 * describe:
 *
 * @author 陈超
 * @date 2019/08/20
 * @condition 必须获取数据总条数
 */
public class Page {

    private int pageNo = 0;//当前页
    private int pageSize = 10000;//每页大小
    private int total;//总数量大小
    private int totalPage = 0;//总页数
    private int pageIndex = 0;//分页起点

    public Page(int total) {
        this.total = total;
        if (total == 0) {
            return;
        }
        if (total % pageSize == 0) {
            totalPage = total / pageSize;
        } else {
            totalPage = total / pageSize + 1;
        }
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
        this.pageIndex = (pageNo - 1) * pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        if (total % pageSize == 0) {
            totalPage = total / pageSize;
        } else {
            totalPage = total / pageSize + 1;
        }
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public boolean isLastPage() {
        return pageNo == totalPage;
    }
}
