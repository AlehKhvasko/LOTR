package models.movies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfMovies {
        public ArrayList<MovieDescription> docs;
        public int total;
}
