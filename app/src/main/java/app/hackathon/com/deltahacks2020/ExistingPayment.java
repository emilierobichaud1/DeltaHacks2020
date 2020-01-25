package app.hackathon.com.deltahacks2020;

public class ExistingPayment {

    double payment_amount;

    public ExistingPayment(double payment_amount) {
        this.payment_amount = payment_amount;
    }

    public double getPayment_amount() {
        return payment_amount;
    }

    public double getRoundUp() {
        // if given a payment_amouunt, how do we get the round up?
        // ex) 3.99, 3.50
        double rounded_value = Math.ceil(payment_amount);
        return (rounded_value - payment_amount);
    }
}
