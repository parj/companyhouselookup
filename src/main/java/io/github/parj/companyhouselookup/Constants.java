package io.github.parj.companyhouselookup;

/**
 * File to hold constants
 */
public class Constants {
    /**
     * The company house URL this is coded to a default value of https://api.companieshouse.gov.uk, to override set environment variable <code>API_COMPANYHOUSE_URL</code>
     */
    public final static String COMPANYHOUSE_URL;
    static {
        if (System.getenv("API_COMPANYHOUSE_URL") == null || System.getenv("API_COMPANYHOUSE_URL").isEmpty())
            COMPANYHOUSE_URL = "https://api.companieshouse.gov.uk";
        else
            COMPANYHOUSE_URL = System.getenv("API_COMPANYHOUSE_URL");
    }

    /**
     * API key for authenticating with company house, to use, set environment variable <code>API_COMPANYHOUSE_KEY</code>
     */
    public final static String COMPANYHOUSE_API = System.getenv("API_COMPANYHOUSE_KEY");
}
