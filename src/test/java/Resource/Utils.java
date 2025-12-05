package Resource;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {

    RequestSpecification baseReq;
    public RequestSpecification requestSpecification() throws IOException {

        PrintStream log= new PrintStream("loging.txt");
        baseReq = new RequestSpecBuilder()
                .setBaseUri(getGlobalData("baseURL")).setContentType("application/json")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log)).build();

        return baseReq;
    }

    public static String getGlobalData(String key) throws IOException {

        Properties prop= new Properties();
        FileInputStream fis= new FileInputStream(new File("C://Users//vinit//IdeaProjects//RestAPIBDD//src//test//java//Resource//config.properties"));
        prop.load(fis);
        return prop.getProperty(key);
    }

}
