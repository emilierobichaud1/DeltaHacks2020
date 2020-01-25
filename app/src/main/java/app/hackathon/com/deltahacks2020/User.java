package app.hackathon.com.deltahacks2020;

import java.util.List;

public class User {

    String name;
    String email;
    PayPalUser userinfo;
    Charity charity;

    public User(String name, String email, PayPalUser userinfo) {
        this.name = name;
        this.email = email;
        this.userinfo = userinfo;
        this.charity = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setUserinfo(PayPalUser userinfo) {
        this.userinfo = userinfo;
    }

    public PayPalUser getUserinfo() {
        return userinfo;
    }


}
