package Assign3;

public class MovieInfo {
    private String movieName;
    private int moviesCount;
    private final String movieId;

    public MovieInfo(String movieName, int moviesCount) {
        this.movieName = movieName;
        this.moviesCount = moviesCount;
        this.movieId = movieName + "_" + moviesCount;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    public static void main(String[] args) {
        MovieInfo movie = new MovieInfo("Hello", 31);
        System.out.println("Movie ID: " + movie.getMovieId());

    }
}
