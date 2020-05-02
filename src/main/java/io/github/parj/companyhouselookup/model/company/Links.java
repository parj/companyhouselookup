package io.github.parj.companyhouselookup.model.company;

public class Links {
    private String self;
    private String filing_history;
    private String officers;
    private String charges;
    private String persons_with_significant_control;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public String getFiling_history() {
        return filing_history;
    }

    public String getOfficers() {
        return officers;
    }

    public String getCharges() {
        return charges;
    }

    public String getPersons_with_significant_control() {
        return persons_with_significant_control;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setFiling_history(String filing_history) {
        this.filing_history = filing_history;
    }

    public void setOfficers(String officers) {
        this.officers = officers;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public void setPersons_with_significant_control(String persons_with_significant_control) {
        this.persons_with_significant_control = persons_with_significant_control;
    }
}
