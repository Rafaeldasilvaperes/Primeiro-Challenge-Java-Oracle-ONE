
package Conversor.ConversorMoedas;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration; 

public class conversorMoedasAPI {
    String API_KEY = System.getenv("API_CURRENCY_KEY");
		
    
    public String conversorMOEDAS() throws IOException, InterruptedException{

      
      
      final String URL = "https://api.invertexto.com/v1/currency/BRL_USD?token="+URLEncoder.encode(API_KEY, StandardCharsets.UTF_8.toString()); 
      HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(URL)).timeout(Duration.ofSeconds(10)).build();

      HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(15)).followRedirects(Redirect.NORMAL).build();
      HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
      

      
      return response.body();
    };
		

}
