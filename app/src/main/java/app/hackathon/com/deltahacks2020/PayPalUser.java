package app.hackathon.com.deltahacks2020;

import java.util.ArrayList;
import java.util.List;

public class PayPalUser {

    String user_id;
    String name;
    String payer_id;
    List<ExistingPayment> payments;

    public PayPalUser(String user_id, String name, String payer_id,
                      List<ExistingPayment> payments) {
        this.user_id = user_id;
        this.name = name;
        this.payer_id = payer_id;
        this.payments = payments;
    }
    //get payments after user signs in with paypal

    public void addPayment(ExistingPayment new_payment) {
        this.payments.add(new_payment);
    }

    public List<ExistingPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<ExistingPayment> new_payments) {
        this.payments.addAll(new_payments);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(String payer_id) {
        this.payer_id = payer_id;
    }


}
