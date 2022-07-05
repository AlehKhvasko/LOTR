package mapper;

import lombok.Getter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Getter
public class ApplicationPropertyMapper {
    public static void getProperty(String name) throws IOException {
        FileInputStream fis=new FileInputStream("src/main/resources/application.properties");
        Properties p=new Properties ();
        p.load (fis);
        System.out.println(p.getProperty(name));
    }
}
