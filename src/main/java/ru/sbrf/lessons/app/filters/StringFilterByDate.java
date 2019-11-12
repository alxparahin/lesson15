package ru.sbrf.lessons.app.filters;

public class StringFilterByDate implements StringFilter {
    public boolean test(String string) {
        System.out.println("test:FALSE");
        return false;
    }
}
