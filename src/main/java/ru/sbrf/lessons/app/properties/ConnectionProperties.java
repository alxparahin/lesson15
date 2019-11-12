package ru.sbrf.lessons.app.properties;

public class ConnectionProperties {
    private String login;
    private String password;
    private String url;

    public ConnectionProperties(String login, String password, String url) {
        this.login = login;
        this.password = password;
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
