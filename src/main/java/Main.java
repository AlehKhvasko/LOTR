

import mapper.ApplicationPropertyMapper;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
/*
        TheOneApiClient theOneApiClient = new TheOneApiClient(new OkHttpClient(), new ObjectMapper());

        var listOfBooksDto = theOneApiClient.getBook();

        System.out.println(listOfBooksDto);

        ListOfBookMapper listOfBookMapper = new ListOfBookMapper();
        ListOfBookEntity bookEntity = listOfBookMapper.toListOfBookEntity(listOfBooksDto);

       BookService bookService = new BookService(new BookRepository());
       bookService.save(bookEntity);
*/
        FileInputStream fis=new FileInputStream("src/main/resources/application.properties");
        Properties p=new Properties ();
        p.load (fis);
        System.out.println(p.getProperty("datasource.password"));
        ApplicationPropertyMapper.getProperty("datasource.password");
        //ApplicationPropertyMapper applicationPropertyMapper = new ApplicationPropertyMapper();
        //System.out.println( applicationPropertyMapper.getProps());
    }
}
