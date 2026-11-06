package com.gcu.lab45;

public class ReportOptionsBuilder {
    private String title;
    private int pageSize = 25; // Default page size
    private boolean includeDetails = false; // Default to not include details

    public ReportOptionsBuilder setTitle(String title) {
        this.title = title;
        return this; // Return the builder instance for method chaining
    }

    public ReportOptionsBuilder setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public ReportOptionsBuilder setIncludeDetails(boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }

    public ReportOptions build() {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        return new ReportOptions(title, pageSize, includeDetails);
    }
}
