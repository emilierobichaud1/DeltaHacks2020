package app.hackathon.com.deltahacks2020;

public class Charity {

    private String charity_name;
    private String payer_id;

    public Charity(String charity_name, String payer_id) {
        this.charity_name = charity_name;
        this.payer_id = payer_id;
    }

    public String getCharity_name() {
        return charity_name;
    }

    public void setCharity_name(String charity_name) {
        this.charity_name = charity_name;
    }

    public String getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(String payer_id) {
        this.payer_id = payer_id;
    }
}
