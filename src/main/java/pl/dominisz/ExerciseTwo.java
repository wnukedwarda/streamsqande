package pl.dominisz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 * <p>
 * Convert the following code into a new implementation that uses lambda expressions and aggregate operations
 * instead of nested for loops.
 * Hint: Make a pipeline that invokes the filter, sorted, and collect operations, in that order.
 */
public class ExerciseTwo {

    public static void main(String[] args) {
        List<Album> albums = createAlbums();
        List<Album> favs = albums.stream()
                .filter(album -> album.hasFavorite())
                .sorted((album1, album2)
                        -> album1.getName().compareTo(album2.getName()))
                .collect(Collectors.toList());
        showAlbums(favs);
    }

    private static void showAlbums(List<Album> albums) {
    }

    private static List<Album> createAlbums() {
        return new ArrayList<>();
    }
}
