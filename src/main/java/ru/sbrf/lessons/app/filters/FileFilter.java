package ru.sbrf.lessons.app.filters;

import java.util.Date;

public class FileFilter {
    private String mask;
    private Date date;

    public FileFilter(String mask, Date date) {
        this.mask = mask;
        this.date = date;
    }

    public String getMask() {
        return mask;
    }
}
