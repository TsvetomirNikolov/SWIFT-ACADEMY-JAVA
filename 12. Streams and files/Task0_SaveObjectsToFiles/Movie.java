package Task0_SaveObjectsToFiles;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    String title;
    String director;
    String[] actors;
    LocalDate releaseDate;

    public Movie(String title, String director, String[] actors, LocalDate releaseDate) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseDate = releaseDate;
    }
}
