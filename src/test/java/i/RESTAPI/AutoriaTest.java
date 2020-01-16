package i.RESTAPI;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.get;

import com.jayway.restassured.specification.RequestSpecification;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import org.junit.Assert;

public class AutoriaTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/autoria_API_links.csv")
    public void checkPageStatus(String url) {

        RequestSpecification httpRequest;
        httpRequest = RestAssured.given();
        httpRequest.header("User-Agent", "Jmeter");

        Response response = get(url);
        Assert.assertEquals(200, response.getStatusCode());

        String contentType = response.header("Content-Type");
        String сontentEncoding = response.header("Content-Encoding");
        Assert.assertEquals("text/html; charset=utf-8", contentType);
        Assert.assertEquals("gzip", сontentEncoding);
    }
}