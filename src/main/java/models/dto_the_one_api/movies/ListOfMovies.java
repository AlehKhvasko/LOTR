package models.dto_the_one_api.movies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfMovies {
    private ArrayList<MovieDescription> docs;
    private int total;
    private Integer id;
}
