package models.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DescriptionOfBooks {
    @JsonProperty("_id")
    public String id;
    @JsonProperty("name")
    public String name;

    @Override
    public String toString() {
        return "DescriptionOfBooks{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
