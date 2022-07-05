package models.movies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDescription {
        @Id
        private Integer id;
        public String _id;
        public String name;
        public int runtimeInMinutes;
        public int budgetInMillions;
        public double boxOfficeRevenueInMillions;
        public int academyAwardNominations;
        public int academyAwardWins;
        public double rottenTomatoesScore;
}
