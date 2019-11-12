package ru.sbrf.lessons.app.loaders;

import ru.sbrf.lessons.app.filters.FileFilter;
import ru.sbrf.lessons.app.properties.ConnectionProperties;

public interface Loader {
    void download(ConnectionProperties connectionProperties, FileFilter fileFilter);
    void upload(ConnectionProperties connectionProperties, String fileName);
}
