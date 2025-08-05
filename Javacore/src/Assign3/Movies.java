package Assign3;

public class Movies {
    private String title;
    private String production;
    private String movieId;

    private static int counter = 0;

    public Movies(String title, String production) {
        this.title = title;
        this.production = production;
        counter++;
        this.movieId = title + "_" + counter;
    }

    public String getMovieId() {
        return movieId;
    }

    public String showDetails() {
        return "Title: " + title + ", Production: " + production + ", Movie ID: " + movieId;
    }

    public static void main(String[] args) {
        Movies m1 = new Movies("Amaran", "senthil Productions");
        System.out.println(m1.getMovieId());
        System.out.println(m1.showDetails());
    }
}
