package models.doc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Doc {
    @JsonProperty("_id")
    public String id;
    @JsonProperty("name")
    public String name;
}
