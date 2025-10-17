package com.task2.InitDestroyMethods;

public class DatabaseOperation {
    String url;
    String username;
    String password;

    public void saveToDatabase(String brandName){
        System.out.println("url " + url);
        System.out.println("username " + username);
        System.out.println("password " + password);
        System.out.println("Saving " + brandName + " to database");
    }

    public void connectToDatabase(){
        System.out.println("connection to database established ……");
    }

    public void disconnectFromDatabase(){
        System.out.println("connection to database closed……");
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
