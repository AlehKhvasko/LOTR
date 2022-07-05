package models.dto_the_one_api.characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfCharacters {
        private Integer id;
        public List<CharacterDescription> docs;
        public int total;
}
