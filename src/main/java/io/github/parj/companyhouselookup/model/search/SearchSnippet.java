package io.github.parj.companyhouselookup.model.search;

import java.util.ArrayList;

public class SearchSnippet {
    private String kind;
    Links LinksObject;
    private String date_of_creation;
    ArrayList< String > description_identifier = new ArrayList < String > ();
    private String company_type;
    private String company_status;
    private String address_snippet;
    private String snippet;
    private String company_number;
    Address AddressObject;
    private String title;
    private String description;
    Matches MatchesObject;


    // Getter Methods

    public ArrayList<String> getDescription_identifier() { return description_identifier; }

    public void setDescription_identifier(ArrayList<String> description_identifier) { this.description_identifier = description_identifier; }

    public String getKind() {
        return kind;
    }

    public Links getLinks() {
        return LinksObject;
    }

    public String getDate_of_creation() {
        return date_of_creation;
    }

    public String getCompany_type() {
        return company_type;
    }

    public String getCompany_status() {
        return company_status;
    }

    public String getAddress_snippet() {
        return address_snippet;
    }

    public String getSnippet() {
        return snippet;
    }

    public String getCompany_number() {
        return company_number;
    }

    public Address getAddress() {
        return AddressObject;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Matches getMatches() {
        return MatchesObject;
    }

    // Setter Methods

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setLinks(Links linksObject) {
        this.LinksObject = linksObject;
    }

    public void setDate_of_creation(String date_of_creation) {
        this.date_of_creation = date_of_creation;
    }

    public void setCompany_type(String company_type) {
        this.company_type = company_type;
    }

    public void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    public void setAddress_snippet(String address_snippet) {
        this.address_snippet = address_snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public void setCompany_number(String company_number) {
        this.company_number = company_number;
    }

    public void setAddress(Address addressObject) {
        this.AddressObject = addressObject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMatches(Matches matchesObject) {
        this.MatchesObject = matchesObject;
    }
}


