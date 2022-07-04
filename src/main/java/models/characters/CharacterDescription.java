package models.characters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterDescription {
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
