package client.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.FileNotFoundException;
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
        }catch (Exception e){
            System.out.println(e.getMessage() + response);
        }
    }

    public String getResponse() throws IOException {
        if (!response.isSuccessful()){
            System.out.println("Error in response " + response);
        }
        return Optional.of(response.body().string()).orElseThrow(()->new IllegalStateException("Data is empty"));
    }
}
