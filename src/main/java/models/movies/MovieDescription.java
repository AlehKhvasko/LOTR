package models.movies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDescription {
        public String _id;
        public String name;
        public int runtimeInMinutes;
        public int budgetInMillions;
        public double boxOfficeRevenueInMillions;
        public int academyAwardNominations;
        public int academyAwardWins;
        public double rottenTomatoesScore;
}
