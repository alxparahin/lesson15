package ru.sbrf.lessons.parcer.loaders;

import ru.sbrf.lessons.parcer.filters.FileFilter;

public interface Loader {
    void download(ConnectionProperties connectionProperties, FileFilter fileFilter);
    void upload(ConnectionProperties connectionProperties, String fileName);
}
