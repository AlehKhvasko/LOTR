package models.dto_the_one_api.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DescriptionOfBookDto {
    @JsonProperty("_id")
    public String id;
    public String name;
}
