package io.github.parj.companyhouselookup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.parj.companyhouselookup.company.CompanyException;
import io.github.parj.companyhouselookup.company.GetCompany;
import io.github.parj.companyhouselookup.model.Company;
import kong.unirest.JsonNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetCompanyTests {
    private static GetCompany company;

    @BeforeAll
    static void startUp() {
        if (Constants.COMPANYHOUSE_API == null || Constants.COMPANYHOUSE_API.isEmpty() ) {
            System.out.println("Missing environment variable API_COMPANYHOUSE_KEY");
            System.exit(1);
        }
        company = new GetCompany();
    }

    @Test
    void testGetCompanyUsingCompanyNumber() throws CompanyException {
        JsonNode response = company.get("04384008");
        assertNotNull(response);
    }

    @Test
    void testIfCompanyReponseMarshalls() throws CompanyException {
        JsonNode response = company.get("04384008");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Company companyJSON =  gson.fromJson(response.toString(), Company.class);
        assertEquals("04384008", companyJSON.getCompany_number());
        assertEquals("TESLA MOTORS LIMITED", companyJSON.getCompany_name());
    }
}
