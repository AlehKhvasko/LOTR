package models.dto_the_one_api.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfBooksDto {
    private List<DescriptionOfBookDto> docs;
}
