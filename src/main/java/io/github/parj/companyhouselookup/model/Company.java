package io.github.parj.companyhouselookup.model;

import io.github.parj.companyhouselookup.model.company.Accounts;
import io.github.parj.companyhouselookup.model.company.Confirmation_statement;
import io.github.parj.companyhouselookup.model.company.Links;
import io.github.parj.companyhouselookup.model.company.Registered_office_address;

import java.util.ArrayList;

/**
 * Auto-generated java class from https://codebeautify.org/json-to-java-converter. Derived from JSON.
 * This is the main entry point
 */
public class Company {
    private String type;
    private String date_of_creation;
    Registered_office_address Registered_office_addressObject;
    private String company_number;
    private boolean undeliverable_registered_office_address;
    Accounts AccountsObject;
    private String jurisdiction;
    ArrayList < String > sic_codes = new ArrayList< String >();
    private String last_full_members_list_date;
    private boolean has_been_liquidated;
    private String company_name;
    private String etag;
    private String company_status;
    private boolean has_insolvency_history;
    private boolean has_charges;
    ArrayList < Object > previous_company_names = new ArrayList < Object > ();
    Confirmation_statement Confirmation_statementObject;
    Links LinksObject;
    private boolean registered_office_is_in_dispute;
    private boolean can_file;


    // Getter Methods

    public String getType() {
        return type;
    }

    public String getDate_of_creation() {
        return date_of_creation;
    }

    public Registered_office_address getRegistered_office_address() {
        return Registered_office_addressObject;
    }

    public String getCompany_number() {
        return company_number;
    }

    public boolean getUndeliverable_registered_office_address() {
        return undeliverable_registered_office_address;
    }

    public Accounts getAccounts() {
        return AccountsObject;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public String getLast_full_members_list_date() {
        return last_full_members_list_date;
    }

    public boolean getHas_been_liquidated() {
        return has_been_liquidated;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getEtag() {
        return etag;
    }

    public String getCompany_status() {
        return company_status;
    }

    public boolean getHas_insolvency_history() {
        return has_insolvency_history;
    }

    public boolean getHas_charges() {
        return has_charges;
    }

    public Confirmation_statement getConfirmation_statement() {
        return Confirmation_statementObject;
    }

    public Links getLinks() {
        return LinksObject;
    }

    public boolean getRegistered_office_is_in_dispute() {
        return registered_office_is_in_dispute;
    }

    public boolean getCan_file() {
        return can_file;
    }

    // Setter Methods

    public void setType(String type) {
        this.type = type;
    }

    public void setDate_of_creation(String date_of_creation) {
        this.date_of_creation = date_of_creation;
    }

    public void setRegistered_office_address(Registered_office_address registered_office_addressObject) {
        this.Registered_office_addressObject = registered_office_addressObject;
    }

    public void setCompany_number(String company_number) {
        this.company_number = company_number;
    }

    public void setUndeliverable_registered_office_address(boolean undeliverable_registered_office_address) {
        this.undeliverable_registered_office_address = undeliverable_registered_office_address;
    }

    public void setAccounts(Accounts accountsObject) {
        this.AccountsObject = accountsObject;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public void setLast_full_members_list_date(String last_full_members_list_date) {
        this.last_full_members_list_date = last_full_members_list_date;
    }

    public void setHas_been_liquidated(boolean has_been_liquidated) {
        this.has_been_liquidated = has_been_liquidated;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setCompany_status(String company_status) {
        this.company_status = company_status;
    }

    public void setHas_insolvency_history(boolean has_insolvency_history) {
        this.has_insolvency_history = has_insolvency_history;
    }

    public void setHas_charges(boolean has_charges) {
        this.has_charges = has_charges;
    }

    public void setConfirmation_statement(Confirmation_statement confirmation_statementObject) {
        this.Confirmation_statementObject = confirmation_statementObject;
    }

    public void setLinks(Links linksObject) {
        this.LinksObject = linksObject;
    }

    public void setRegistered_office_is_in_dispute(boolean registered_office_is_in_dispute) {
        this.registered_office_is_in_dispute = registered_office_is_in_dispute;
    }

    public void setCan_file(boolean can_file) {
        this.can_file = can_file;
    }
}