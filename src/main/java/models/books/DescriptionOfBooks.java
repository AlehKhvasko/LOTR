package models.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class DescriptionOfBooks {
    @Id
    @Column(name = "id")
    @JsonProperty("_id")
    public String id;
    @JsonProperty("name")
    public String name;
}
