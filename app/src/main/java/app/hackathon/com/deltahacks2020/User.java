package app.hackathon.com.deltahacks2020;

public class User {

    String name;
    String email;
    PayPalUser userinfo;

    public User(String name, String email, PayPalUser userinfo) {
        this.name = name;
        this.email = email;
        this.userinfo = userinfo;
    }
}
