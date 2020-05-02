package io.github.parj.companyhouselookup.company;

import io.github.parj.companyhouselookup.Constants;
import io.github.parj.companyhouselookup.model.Company;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Retrieves details of a company from company house
 */
public class GetCompany {
    public static Logger logger = LoggerFactory.getLogger(GetCompany.class);

    /**
     * Retrieve company using company number
     * @param companyNumber Company number. This can be onbtained via company house
     * @return Returns json response from company house. The model of this is <code>io.github.parj.companyhouselookup.model.Company</code>.
     * @see Company
     * @throws CompanyException In the event, the query is not successful, exception is raised
     */
    public JsonNode get(String companyNumber) throws CompanyException {
        String url = Constants.COMPANYHOUSE_URL + "/company/" + companyNumber;
        logger.info("Executing " + url);

        HttpResponse<JsonNode> response = Unirest.get(url)
                .basicAuth(Constants.COMPANYHOUSE_API, ":")
                .asJson();

        if (response.getStatus() != HttpStatus.SC_OK) {
            logger.error("Unable to get company" + ". Response is " + response.getStatus() + " " + response.getStatusText());
            throw new CompanyException("Unable to get company " + companyNumber + ". Response is " + response.getStatus() + " " + response.getStatusText());
        }

        return response.getBody();
    }

}
