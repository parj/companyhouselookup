package io.github.parj.companyhouselookup.model.company;

public class Last_accounts {
    private String period_end_on;
    private String period_start_on;
    private String type;
    private String made_up_to;


    // Getter Methods

    public String getPeriod_end_on() {
        return period_end_on;
    }

    public String getPeriod_start_on() {
        return period_start_on;
    }

    public String getType() {
        return type;
    }

    public String getMade_up_to() {
        return made_up_to;
    }

    // Setter Methods

    public void setPeriod_end_on(String period_end_on) {
        this.period_end_on = period_end_on;
    }

    public void setPeriod_start_on(String period_start_on) {
        this.period_start_on = period_start_on;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMade_up_to(String made_up_to) {
        this.made_up_to = made_up_to;
    }
}