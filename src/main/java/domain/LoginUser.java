package domain;

import java.io.Serializable;

public class LoginUser implements Serializable {
    private int customer_id;
    private String username;
    private String password;
    private int user_stats;
    private String code;
    private String customer_email;
    private String modified_time;

    public LoginUser(int customer_id, String username, String password, int user_stats, String modified_time) {
        this.customer_id = customer_id;
        this.username = username;
        this.password = password;
        this.user_stats = user_stats;
        this.modified_time = modified_time;
    }

    public LoginUser(String username, String password, int user_stats, String customer_email, String modified_time) {
        this.username = username;
        this.password = password;
        this.user_stats = user_stats;
        this.customer_email = customer_email;
        this.modified_time = modified_time;
    }

    public LoginUser() {
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getUser_stats() {
        return user_stats;
    }

    public void setUser_stats(int user_stats) {
        this.user_stats = user_stats;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "customer_id=" + customer_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_stats=" + user_stats +
                ", code='" + code + '\'' +
                ", customer_email='" + customer_email + '\'' +
                ", modified_time='" + modified_time + '\'' +
                '}';
    }
}
