package io.github.parj.companyhouselookup.model.company;

public class Confirmation_statement {
    private String next_due;
    private boolean overdue;
    private String last_made_up_to;
    private String next_made_up_to;


    // Getter Methods

    public String getNext_due() {
        return next_due;
    }

    public boolean getOverdue() {
        return overdue;
    }

    public String getLast_made_up_to() {
        return last_made_up_to;
    }

    public String getNext_made_up_to() {
        return next_made_up_to;
    }

    // Setter Methods

    public void setNext_due(String next_due) {
        this.next_due = next_due;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }

    public void setLast_made_up_to(String last_made_up_to) {
        this.last_made_up_to = last_made_up_to;
    }

    public void setNext_made_up_to(String next_made_up_to) {
        this.next_made_up_to = next_made_up_to;
    }
}