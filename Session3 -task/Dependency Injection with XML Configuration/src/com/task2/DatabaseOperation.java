package com.task2;

public class DatabaseOperation {
    String url;
    String username;
    String password;

    public void saveToDatabase(String brandName){
        System.out.println("Connecting to database");
        System.out.println("url " + url);
        System.out.println("username " + username);
        System.out.println("password " + password);
        System.out.println("Saving " + brandName + " to database");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
