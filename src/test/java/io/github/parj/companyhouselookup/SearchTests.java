package io.github.parj.companyhouselookup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.parj.companyhouselookup.company.CompanyException;
import io.github.parj.companyhouselookup.company.Search;
import kong.unirest.JsonNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTests {
    private static Search search;

    @BeforeAll
    static void startUp() {
        if (Constants.COMPANYHOUSE_API == null || Constants.COMPANYHOUSE_API.isEmpty()) {
            System.out.println("Missing environment variable API_COMPANYHOUSE_KEY");
            System.exit(1);
        }
        search = new Search();
    }

    @Test
    void basicSearch() throws CompanyException {
        JsonNode response = search.search("TESLA");
        assertNotNull(response);
    }

    @Test
    void basicSearchCheckContent() throws CompanyException {
        JsonNode response = search.search("TESLA");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        io.github.parj.companyhouselookup.model.Search searchJSON =  gson.fromJson(response.toString(), io.github.parj.companyhouselookup.model.Search.class);
        assertNotEquals(0.0, searchJSON.getTotal_results());
        assertTrue(searchJSON.getItems().get(0).getTitle().contains("TESLA") );
    }
}
