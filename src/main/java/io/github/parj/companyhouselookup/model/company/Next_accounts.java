package io.github.parj.companyhouselookup.model.company;

public class Next_accounts {
    private String period_start_on;
    private boolean overdue;
    private String period_end_on;
    private String due_on;


    // Getter Methods

    public String getPeriod_start_on() {
        return period_start_on;
    }

    public boolean getOverdue() {
        return overdue;
    }

    public String getPeriod_end_on() {
        return period_end_on;
    }

    public String getDue_on() {
        return due_on;
    }

    // Setter Methods

    public void setPeriod_start_on(String period_start_on) {
        this.period_start_on = period_start_on;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }

    public void setPeriod_end_on(String period_end_on) {
        this.period_end_on = period_end_on;
    }

    public void setDue_on(String due_on) {
        this.due_on = due_on;
    }
}