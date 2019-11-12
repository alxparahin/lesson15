package ru.sbrf.lessons.app.parsers;

import ru.sbrf.lessons.app.filters.StringFilter;

public interface Parser {
    void parse(StringFilter stringFilter);
}
