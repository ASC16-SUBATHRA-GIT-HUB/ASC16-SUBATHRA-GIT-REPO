package Assign3.One;

public class Cinema {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;      // in minutes
    private int year;
    private String category;   // e.g., comedy, action

    // Constructor with mandatory fields only
    public Cinema(String movieName, String producedBy) {
        if (movieName == null || movieName.isEmpty() || producedBy == null || producedBy.isEmpty()) {
            throw new IllegalArgumentException("movieName and producedBy are mandatory");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
    }

    // Constructor with all attributes, calls the mandatory constructor
    public Cinema(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);  // call mandatory constructor
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Setters for optional attributes (accept info)
    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Display method to print movie info
    public void displayInfo() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Produced By: " + producedBy);
        System.out.println("Directed By: " + (directedBy != null ? directedBy : "N/A"));
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Year: " + year);
        System.out.println("Category: " + (category != null ? category : "N/A"));
    }

    // You can add getters if needed
    public String getMovieName() {
        return movieName;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    // Test example main method
    public static void main(String[] args) {
        // Must provide mandatory fields
        Cinema movie1 = new Cinema("Aranmanai", "Shankar");

        // Set optional attributes
        movie1.setDirectedBy("Senthil");
        movie1.setDuration(148);
        movie1.setYear(2010);
        movie1.setCategory("horror");

        movie1.displayInfo();

        System.out.println("\n---\n");

        // Using full constructor
        Cinema movie2 = new Cinema("Remo", "Sivakarthikeyan", "SivaSentil", 152, 2016, "Action");
        movie2.displayInfo();
    }
}

