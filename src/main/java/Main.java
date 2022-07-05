import client.utils.TheOneApiClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import mapper.ListOfBookMapper;
import models.entity.ListOfBookEntity;
import okhttp3.OkHttpClient;
import repository.BookRepository;
import service.BookService;

public class Main {
    public static void main(String[] args) throws Exception {
        TheOneApiClient theOneApiClient = new TheOneApiClient(new OkHttpClient(), new ObjectMapper());

        var listOfBooksDto = theOneApiClient.getBook();

        System.out.println();

        ListOfBookMapper listOfBookMapper = new ListOfBookMapper();
//        ListOfBookEntity bookEntity = listOfBookMapper.toListOfBookEntity(listOfBooksDto);

//        BookService bookService = new BookService(new BookRepository());
//        bookService.save(bookEntity);

    }
}
