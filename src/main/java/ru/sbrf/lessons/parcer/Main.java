package ru.sbrf.lessons.parcer;

import ru.sbrf.lessons.parcer.filters.FileFilter;
import ru.sbrf.lessons.parcer.loaders.ConnectionProperties;
import ru.sbrf.lessons.parcer.loaders.HTTPLoader;
import ru.sbrf.lessons.parcer.loaders.Loader;
import ru.sbrf.lessons.parcer.loaders.SSHLoader;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Loader loader = new HTTPLoader();
        ConnectionProperties connectionProperties = new ConnectionProperties("bob", "123456", "www.ru");
        FileFilter fileFilter = new FileFilter("*", new Date());

        loader = new SSHLoader();
        loader.download(connectionProperties, fileFilter);
    }
}