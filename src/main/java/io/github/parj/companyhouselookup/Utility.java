package io.github.parj.companyhouselookup;

import kong.unirest.Config;
import kong.unirest.Unirest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utility {
    public static Logger logger = LoggerFactory.getLogger(Utility.class);

    public static Config defaultConfig() {
       Config config = Unirest.config();
       config.setDefaultBasicAuth(Constants.COMPANYHOUSE_API, " ");
       config.defaultBaseUrl(Constants.COMPANYHOUSE_URL);

        return config;
    }
}
