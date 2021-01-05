package com.dv.po;


public class User {
    private String username;
    private String password;
    private String salt;
    private String key;
    private int num;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", key='" + key + '\'' +
                ", num=" + num +
                '}';
    }

    public User(String username, String password, String salt, String key, int num) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.key = key;
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
