package models.characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterDescription {
        @Id
        @Column(name = "id")
        public String _id;
        public String height;
        public String race;
        public String gender;
        public String birth;
        public String spouse;
        public String death;
        public String realm;
        public String hair;
        public String name;
        public String wikiUrl;
}
