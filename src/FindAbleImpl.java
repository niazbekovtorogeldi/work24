import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAbleImpl implements Findable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Please write name of movie");
        String movieName = new Scanner(System.in).nextLine();
        List<Movie> result = new ArrayList<>();
        try {
            for (Movie a : movies) {
                if (a.getName().equals(movieName)) {
                    result.add(a);
                }
            }
            if (result.isEmpty()){
                throw new Exception("THere is no such a movie.");
            }else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Please write name of actor: ");
        String actorName = new Scanner(System.in).nextLine();
        List<Movie> result = new ArrayList<>();
        try {
            for (Movie a : movies) {
                for (Cast b : a.getList()) {
                    if (b.getActorFullName().equals(actorName)) {
                        result.add(a);
                    }
                }
            }
            if (result.isEmpty()){
                throw new RuntimeException("Error");
            }else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Please write year of movie: ");
        int yearMovie = new Scanner(System.in).nextInt();
        int counter = 0;
        try {
            List<Movie> movie = new ArrayList<>();
            for (Movie a : movies) {
                if (a.getYear() == yearMovie) {
                    counter++;
                    movie.add(a);
                }
            }

            if (counter > 0) {
                System.out.println("counter is: " + counter);
                System.out.println(movie);
            } else {
                throw new RuntimeException("Not found");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Please write director of movie: ");
        String directorName = new Scanner(System.in).nextLine();
        List<Movie> result = new ArrayList<>();
        try {
            for (Movie a : movies) {
                if (a.getDirector().getFirstNsme().equals(directorName)) {
                    result.add(a);
                }
            }
            if (result.isEmpty()){
                throw new RuntimeException("There is not such a director");
            }else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        try {
            System.out.println("Please write description of movie:  ");
            String description = new Scanner(System.in).nextLine();
            List<Movie> result = new ArrayList<>();
            for (Movie a : movies) {
                if (a.getDescription().equals(description)) {
                    result.add(a);
                }
            }
            if (result.isEmpty()) {
                throw new RuntimeException("Not found such a description");
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void findMovieByRoll(List<Movie> movies) {
        String roll = new Scanner(System.in).nextLine();
        List<Movie> result = new ArrayList<>();
        try {
            for (Movie m : movies) {
                for (Cast c : m.getList()) {
                    if (c.getRole().equals(roll)) {
                        result.add(m);
                    }
                }
            }
            if (result.isEmpty()){
                throw new RuntimeException("Invalid input");
            }else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}