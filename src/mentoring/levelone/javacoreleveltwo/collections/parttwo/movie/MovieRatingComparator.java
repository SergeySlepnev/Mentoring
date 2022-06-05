package mentoring.levelone.javacoreleveltwo.collections.parttwo.movie;
import mentoring.levelone.javacoreleveltwo.collections.parttwo.movie.Movie;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o2.getRating(), o1.getRating());
    }
}
