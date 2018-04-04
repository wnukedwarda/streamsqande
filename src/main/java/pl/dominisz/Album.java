package pl.dominisz;

import java.util.List;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
public class Album {

    private String name;
    private List<Track> tracks;

    public Album(String name, List<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public boolean hasFavorite() {
        return tracks.stream()
                .anyMatch(track -> track.getRating() >= 4);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
