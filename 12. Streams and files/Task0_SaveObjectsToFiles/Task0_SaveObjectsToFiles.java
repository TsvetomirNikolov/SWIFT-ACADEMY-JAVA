package Task0_SaveObjectsToFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Task0_SaveObjectsToFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie("Rambo", "Ted Kotcheff", new String[]{"Silvester Stallowen", "Richard Crenna"},
                LocalDate.of(1981, 12, 1));
        String path = "RamboMovie";
        try (FileOutputStream fileStream = new FileOutputStream(path)) {
            try (ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)) {
                objectStream.writeObject(movie);
            }
        }
        Movie parsed;
        try (FileOutputStream fileStream = new FileOutputStream(path)) {
            try (ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)) {
                parsed = (Movie) is.readObject();
            }
        }
        if (movie.director.equals(parsed.director)
                && movie.releaseDate.equals(parsed.releaseDate)
                && movie.actors.equals(parsed.actors)
                && Arrays.deepEquals(movie.actors, parsed.actors)) {
            System.out.println("same object");
        }
    }
}
