package ru.sbrf.lessons.app;

import ru.sbrf.lessons.app.filters.FileFilter;
import ru.sbrf.lessons.app.properties.ConnectionProperties;
import ru.sbrf.lessons.app.loaders.HTTPLoader;
import ru.sbrf.lessons.app.loaders.Loader;
import ru.sbrf.lessons.app.loaders.SSHLoader;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Loader loader = new HTTPLoader();
        download(loader);

        loader = new SSHLoader();
        download(loader);
    }

    public static void download(Loader loader){
        ConnectionProperties connectionProperties = new ConnectionProperties("bob", "123456", "www.ru");
        FileFilter fileFilter = new FileFilter("*", new Date());

        loader.download(connectionProperties, fileFilter);
    }
}
