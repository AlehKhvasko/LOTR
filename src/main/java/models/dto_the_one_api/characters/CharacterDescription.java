package models.dto_the_one_api.characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterDescription {
        private String id;
        private String height;
        private String race;
        private String gender;
        private String birth;
        private String spouse;
        private String death;
        private String realm;
        private String hair;
        private String name;
        private String wikiUrl;
}
