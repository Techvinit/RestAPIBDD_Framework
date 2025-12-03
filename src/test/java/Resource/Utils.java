package Resource;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Utils {

    RequestSpecification baseReq;
    public RequestSpecification requestSpecification() throws FileNotFoundException {

        PrintStream log= new PrintStream("loging.txt");
        baseReq = new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com").setContentType("application/json")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log)).build();

        return baseReq;
    }
}
