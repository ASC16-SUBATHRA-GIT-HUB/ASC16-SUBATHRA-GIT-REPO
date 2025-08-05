package Assign3;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "subathra");
        Movie m2 = new Movie("The Matrix", "John", "Amaran", 136, 1999, "Action");

        m1.acceptInfo("vig", 148, 2010, "Sci-Fi");

        m1.displayInfo();
        m2.displayInfo();

        System.out.println("Total Movies Created: " + Movie.getMoviesCount());
    }
}