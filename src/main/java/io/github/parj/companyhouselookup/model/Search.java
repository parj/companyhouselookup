package io.github.parj.companyhouselookup.model;

import io.github.parj.companyhouselookup.model.search.SearchSnippet;

import java.util.ArrayList;

/**
 * Auto-generated java class from https://codebeautify.org/json-to-java-converter. Derived from JSON.
 * This is the main entry point
 */
public class Search {
    private float start_index;
    private float total_results;
    private String kind;
    private float page_number;
    ArrayList <SearchSnippet> items = new ArrayList< SearchSnippet>();
    private float items_per_page;


    // Getter Methods

    public ArrayList<SearchSnippet> getItems() { return items; }

    public void setItems(ArrayList<SearchSnippet> items) { this.items = items; }

    public float getStart_index() {
        return start_index;
    }

    public float getTotal_results() {
        return total_results;
    }

    public String getKind() {
        return kind;
    }

    public float getPage_number() {
        return page_number;
    }

    public float getItems_per_page() {
        return items_per_page;
    }

    // Setter Methods

    public void setStart_index(float start_index) {
        this.start_index = start_index;
    }

    public void setTotal_results(float total_results) {
        this.total_results = total_results;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setPage_number(float page_number) {
        this.page_number = page_number;
    }

    public void setItems_per_page(float items_per_page) {
        this.items_per_page = items_per_page;
    }
}
