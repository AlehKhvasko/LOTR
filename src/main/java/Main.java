import client.LOTRClient;
import models.UserEntity;
import models.books.ListOfBooks;
import models.characters.ListOfCharacters;
import models.movies.ListOfMovies;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.SessionFactoryImpl;

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

        Session session  = new SessionFactoryImpl().getSession().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        UserEntity user = new UserEntity();
        user.builder()
                .firstName("Al")
                .lastName("K")
                .companyName("home")
                .build();

        session.persist(user);
        transaction.commit();
    }
}
