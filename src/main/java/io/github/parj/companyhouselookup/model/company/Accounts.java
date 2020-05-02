package io.github.parj.companyhouselookup.model.company;

public class Accounts {
    Last_accounts Last_accountsObject;
    private String next_made_up_to;
    private boolean overdue;
    Accounting_reference_date Accounting_reference_dateObject;
    Next_accounts Next_accountsObject;
    private String next_due;


    // Getter Methods

    public Last_accounts getLast_accounts() {
        return Last_accountsObject;
    }

    public String getNext_made_up_to() {
        return next_made_up_to;
    }

    public boolean getOverdue() {
        return overdue;
    }

    public Accounting_reference_date getAccounting_reference_date() {
        return Accounting_reference_dateObject;
    }

    public Next_accounts getNext_accounts() {
        return Next_accountsObject;
    }

    public String getNext_due() {
        return next_due;
    }

    // Setter Methods

    public void setLast_accounts(Last_accounts last_accountsObject) {
        this.Last_accountsObject = last_accountsObject;
    }

    public void setNext_made_up_to(String next_made_up_to) {
        this.next_made_up_to = next_made_up_to;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }

    public void setAccounting_reference_date(Accounting_reference_date accounting_reference_dateObject) {
        this.Accounting_reference_dateObject = accounting_reference_dateObject;
    }

    public void setNext_accounts(Next_accounts next_accountsObject) {
        this.Next_accountsObject = next_accountsObject;
    }

    public void setNext_due(String next_due) {
        this.next_due = next_due;
    }
}