package pedroleonez.spring_introduce.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieData(
        @JsonAlias("Title") String title,
        @JsonAlias("Year") String year,
        String imdbRating
) {
}
