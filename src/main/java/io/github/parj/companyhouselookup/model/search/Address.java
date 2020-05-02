package io.github.parj.companyhouselookup.model.search;

public class Address {
    private String address_line_2;
    private String postal_code;
    private String locality;
    private String region;
    private String premises;


    // Getter Methods

    public String getAddress_line_2() {
        return address_line_2;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getLocality() {
        return locality;
    }

    public String getRegion() {
        return region;
    }

    public String getPremises() {
        return premises;
    }

    // Setter Methods

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPremises(String premises) {
        this.premises = premises;
    }
}