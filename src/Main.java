import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello world!");

        //String url="https://www.alphavantage.co/query?function="+"TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey=demo";
        String url="https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=94e76631141d4a42b863b7c62fcc24b1&include=minutely";
        // building the request object
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        // setting the client
        HttpClient httpClient =HttpClient.newBuilder().build();
        //sending request and getting response
        HttpResponse<String> response= httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
        //System.out.println(response.toString());
    }
}