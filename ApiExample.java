//TO CALL AN API IN JAVA 
import java.net.URI; //importing useful tools (classes) from Java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiExample {
    public static void main(String[] args) {
        // Step 1: Create an HttpClient
        HttpClient client = HttpClient.newHttpClient(); //creating a client that can talk to the internet and send requests.

        // Step 2: Build the HttpRequest (GET request)
        HttpRequest request = HttpRequest.newBuilder()  //building a GET request to the URL
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
               
                .GET()
                //Final step to build the request
                .build();

        try {
            // Step 3: Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Step 4: Print the response
            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body:\n" + response.body());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}

// try-catch:- This is used to catch errors (like no internet) and avoid crashing the program.

