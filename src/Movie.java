import java.util.Comparator;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List <Cast> list;

    public Movie(String name, int year, String description, Director director, List<Cast> list) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.list = list;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getList() {
        return list;
    }

    public void setList(List<Cast> list) {
        this.list = list;
    }
    public static Comparator<Movie>sortByName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie>sortByYearAscending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    };
    public static Comparator<Movie>sortByYearDescending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }
    };
    public static Comparator<Movie>sortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {

            return o1.description.compareTo(o2.description);
        }
    };

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", list=" + list +
                '}';
    }
}
