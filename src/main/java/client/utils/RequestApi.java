package client.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Optional;

public class RequestApi {
    Response response = null;
    private final OkHttpClient client = new OkHttpClient();
    private final String url = "https://the-one-api.dev/v2/book";

    public void runClient(String token) throws Exception  {
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer " + token)
                .build();
        try {
            response = client.newCall(request).execute();
            System.out.println("Server: " + response.header("anykey"));
        }catch (Exception e){
            System.out.println(e.getMessage() + response);
        }
    }

    public String getResponse() throws IOException {
        return response.body().string();
    }
}
