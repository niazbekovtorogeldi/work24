import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cast cast1 = new Cast("Lee", "Main hero");
        Cast cast2 = new Cast("Chack Noris", "Fighter");
        Cast cast3 = new Cast("MsCall", "Werewolf");
        Cast cast4 = new Cast("Jackson", "Kanami");
        Cast cast5 = new Cast("Lidya", "Hunter");

        Director director4 = new Director("Mac", "Colli");
        Director director2 = new Director("Jeames", "Thon");
        Director director3 = new Director("Jackson", "Bred");
        Director director1 = new Director("Albert", "Mett");
        Director director5 = new Director("Mac", "Colli");

        List<Cast> list = new ArrayList<>(List.of(cast3, cast4, cast5));
        List<Cast> list1 = new ArrayList<>(List.of(cast1, cast2, cast5));

        Movie movie1 = new Movie("werewolf", 2018, "Werewolf", director2, list);
        Movie movie2 = new Movie("Game of death", 2002, "Fighter", director1, list1);
        List<Movie> movieList = new ArrayList<>(Arrays.asList(movie2, movie1));
        FindAbleImpl findAble = new FindAbleImpl();
        SortAbleImpl sortAble = new SortAbleImpl();

        System.out.println("1.See list of momvie.\n2.Find movie by name.\n3.Find movie by actor name.\n" +
                "4.Find movie by year.\n5.Find movie by director\n6.Find movie by description");
        while (true) {
            System.out.println("Choose method:");
            int switchs = new Scanner(System.in).nextInt();
            switch (switchs) {
                case 1:
                    System.out.println(findAble.getAllMovies(movieList));
                    break;
                case 2:
                    findAble.findMovieByName(movieList);
                    break;
                case 3:
                    findAble.findMovieByActorName(movieList);
                    break;
                case 4:
                    findAble.findMovieByYear(movieList);
                    break;
                case 5:
                    findAble.findMovieByDirector(movieList);
                    break;
                case 6:
                    findAble.findMovieByDescription(movieList);
                    break;


                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}