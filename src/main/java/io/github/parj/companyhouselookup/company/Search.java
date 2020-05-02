package io.github.parj.companyhouselookup.company;

import io.github.parj.companyhouselookup.Constants;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Searches for a company. Right now this does not support pagination
 */
public class Search {
    public static Logger logger = LoggerFactory.getLogger(Search.class);

    /**
     * Search for a company
     * @param query The query item to search with
     * @return Search results in JSON format. The model of this is <code>io.github.parj.companyhouselookup.model.Search</code>
     * @see io.github.parj.companyhouselookup.model.Search
     * @throws CompanyException Raises an exception
     */
    public JsonNode search(String query) throws CompanyException {
        String url = Constants.COMPANYHOUSE_URL + "/search";
        logger.info("Executing " + url);

        HttpResponse<JsonNode> response = Unirest.get(url)
                .basicAuth(Constants.COMPANYHOUSE_API, ":")
                .queryString("q", query)
                .asJson();

        if (response.getStatus() != HttpStatus.SC_OK) {
            logger.error("Unable to search for " + query + ". Response is " + response.getStatus() + " " + response.getStatusText());
            throw new CompanyException("Unable to search for " + query + ". Response is " + response.getStatus() + " " + response.getStatusText());
        }

        logger.info("Found results");
        return response.getBody();
    }
}
