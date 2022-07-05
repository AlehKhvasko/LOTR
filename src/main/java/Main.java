import client.LOTRClient;
import models.books.ListOfBooks;
import models.characters.ListOfCharacters;
import models.movies.ListOfMovies;

public class Main {
    public static void main(String[] args) throws Exception {
        LOTRClient client1 = new LOTRClient();
        //LOTRClient client2 = new LOTRClient();
        //LOTRClient client3 = new LOTRClient();
        ListOfBooks listOfBooks = client1.requestAllBooks();
        //ListOfMovies listOfMovies = client2.requestAllMovies();
        //ListOfCharacters listOfCharacters = client3.requestAllCharacters();

        listOfBooks.getDocs().forEach(e-> System.out.println(e.name));
        //listOfMovies.getDocs().forEach(e-> System.out.println(e.name));
        //listOfCharacters.getDocs().forEach(e-> System.out.println(e.name));

    }
}
