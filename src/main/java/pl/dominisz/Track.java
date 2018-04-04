package pl.dominisz;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
public class Track {

    private int rating;

    public Track(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "rating=" + rating +
                '}';
    }
}
