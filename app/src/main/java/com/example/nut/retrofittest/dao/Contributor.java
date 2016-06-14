package com.example.nut.retrofittest.dao;

/**
 * Created by nut on 14/6/2559.
 */
public class Contributor {
    private String login;
    private String html_url;
    private int contributions;

    @Override
    public String toString() {
        return String.format("%s (%d)", login, contributions);
    }

    public String getLogin() {
        return login;
    }

    public String getHtml_url() {
        return html_url;
    }

    public int getContributions() {
        return contributions;
    }
}
