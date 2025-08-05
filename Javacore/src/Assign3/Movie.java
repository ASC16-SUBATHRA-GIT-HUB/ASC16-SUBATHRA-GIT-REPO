package Assign3;

public class Movie {
    private String movieName, producedBy, directedBy, category;
    private int duration, year;
    private static int moviesCount = 0; // Static variable

    // Mandatory constructor
    public Movie(String movieName, String producedBy) {
        this.movieName = movieName;
        this.producedBy = producedBy;
        moviesCount++; // Increment on object creation
    }
    // Full constructor using this()
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Method to accept info
    public void acceptInfo(String directedBy, int duration, int year, String category) {
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Movie: " + movieName + "\nProduced By: " + producedBy + "\nDirected By: " + directedBy + "\nDuration: " + duration + "\nYear: " + year + "\nCategory: " + category);
    }

    // Static method to get movies count
    public static int getMoviesCount() {
        return moviesCount;
    }
}
