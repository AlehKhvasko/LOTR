package client.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.dto_the_one_api.books.ListOfBooksDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class TheOneApiClient {
    private static final String URL = "https://the-one-api.dev/v2/";
    private final OkHttpClient client;
    private final ObjectMapper objectMapper;

    public TheOneApiClient(OkHttpClient client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }

    public ListOfBooksDto getBook() throws IOException {
        Request request = new Request.Builder()
                .url(URL + "book")
                //TODO: получаем из properties
                .addHeader("Authorization", "Bearer " + "Okk8iRZULkd60EjA274Q")
                .build();

        Response response = client.newCall(request).execute();
        String answer = response.body().string();
        return objectMapper.readValue(answer, ListOfBooksDto.class);
    }
}
