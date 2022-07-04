import client.LOTRClient;
import models.books.ListOfBooks;
import models.movies.ListOfMovies;

public class Main {
    public static void main(String[] args) throws Exception {
        LOTRClient client = new LOTRClient();
        ListOfBooks listOfBooks = client.requestAllBooks();
        ListOfMovies listOfMovies = client.requestAllMovies();

        listOfBooks.getDocs().forEach(e-> System.out.println(e.name));
        listOfMovies.getDocs().forEach(e-> System.out.println(e.name));

    }
}
