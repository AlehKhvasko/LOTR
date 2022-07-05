package models.dto_the_one_api.movies;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDescription {
    private String id;
    private String name;
    private int runtimeInMinutes;
    private int budgetInMillions;
    private double boxOfficeRevenueInMillions;
    private int academyAwardNominations;
    private int academyAwardWins;
    private double rottenTomatoesScore;
}
