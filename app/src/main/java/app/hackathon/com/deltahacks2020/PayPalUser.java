package app.hackathon.com.deltahacks2020;

public class PayPalUser {

    String user_id;
    String name;
    String payer_id;
    String address;
    String email;

    public PayPalUser(String user_id, String name, String payer_id,
                      String address, String email) {
        this.user_id = user_id;
        this.name = name;
        this.payer_id = payer_id;
        this.address = address;
        this.email = email;
    }
}
