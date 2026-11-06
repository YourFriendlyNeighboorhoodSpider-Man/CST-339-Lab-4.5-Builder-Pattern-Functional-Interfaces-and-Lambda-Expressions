package com.gcu.lab45;

public class ReportOptions {
    private String title;
    private int pageSize;
    private boolean includeDetails;

    public ReportOptions(String title, int pageSize, boolean includeDetails) {
        this.title = title;
        this.pageSize = pageSize;
        this.includeDetails = includeDetails;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPageSize() {
        return pageSize;
    }

    public boolean isIncludeDetails() {
        return includeDetails;
    }

    @Override 
    public String toString() {
        return "ReportOptions{" +
                "title='" + title + '\'' +
                ", pageSize=" + pageSize +
                ", includeDetails=" + includeDetails +
                '}';
    }
}
