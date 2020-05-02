package io.github.parj.companyhouselookup.model.company;

public class Registered_office_address {
    private String region;
    private String locality;
    private String postal_code;
    private String address_line_1;


    // Getter Methods

    public String getRegion() {
        return region;
    }

    public String getLocality() {
        return locality;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    // Setter Methods

    public void setRegion(String region) {
        this.region = region;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }
}