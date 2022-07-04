package client;

import client.utils.RequestApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.books.ListOfBooks;
import models.characters.ListOfCharacters;
import models.movies.ListOfMovies;

public class LOTRClient {
    ObjectMapper objectMapper = new ObjectMapper();

    public ListOfBooks requestAllBooks() throws Exception {
        RequestApi requestBooks= new RequestApi("book");
        requestBooks.runClient("Okk8iRZULkd60EjA274Q");
            String response = requestBooks.getResponse();

        return objectMapper.readValue(response, ListOfBooks.class);
    }

    public ListOfMovies requestAllMovies() throws Exception {
        RequestApi requestMovies = new RequestApi("movie");
        requestMovies.runClient("Okk8iRZULkd60EjA274Q");
        String response = requestMovies.getResponse();

        return objectMapper.readValue(response, ListOfMovies.class);
    }

    public ListOfCharacters requestAllCharacters() throws Exception {
        RequestApi requestCharacters= new RequestApi("character");
        requestCharacters.runClient("Okk8iRZULkd60EjA274Q");
        String response = requestCharacters.getResponse();

        return objectMapper.readValue(response, ListOfCharacters.class);
    }
}
