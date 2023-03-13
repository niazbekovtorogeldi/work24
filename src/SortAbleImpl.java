import java.awt.*;
import java.util.Collections;

public class SortAbleImpl implements Sortable{
    @Override
    public void sortByMovieName(java.util.List<Movie> movies) {
        Collections.sort(movies,Movie.sortByName);
        System.out.println("Sorted by name: "+movies);

    }

    @Override
    public void sortByYear(java.util.List<Movie> movies) {
        Collections.sort(movies,Movie.sortByYearAscending);
        System.out.println("Sorted by year ascending"+movies);
        Collections.sort(movies,Movie.sortByYearDescending);
        System.out.println("Sorted by year descending"+movies);

    }

    @Override
    public void sortByDirector(java.util.List<Movie> movies) {
        Collections.sort(movies,Movie.sortByDirector);
        System.out.println("Sorted by director"+movies);

    }
}

