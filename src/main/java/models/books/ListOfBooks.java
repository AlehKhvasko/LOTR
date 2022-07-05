package models.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "listOfBooks")
public class ListOfBooks {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @JsonProperty("docs")
        public List<DescriptionOfBooks> docs;
}
