package Assign3.Four;

public class Movie {
        private String movieName;
        private String producedBy;
        private String directedBy;
        private int duration;
        private int year;
        private String category;

        // Mandatory fields constructor
        public Movie(String movieName, String producedBy) {
            if (movieName == null || movieName.isEmpty() || producedBy == null || producedBy.isEmpty()) {
                throw new IllegalArgumentException("movieName and producedBy are mandatory");
            }
            this.movieName = movieName;
            this.producedBy = producedBy;
        }

        // Full constructor
        public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
            this(movieName, producedBy);
            this.directedBy = directedBy;
            this.duration = duration;
            this.year = year;
            this.category = category;
        }

        // Getters and setters omitted for brevity

        public void displayInfo() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Produced By: " + producedBy);
            System.out.println("Directed By: " + (directedBy != null ? directedBy : "N/A"));
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Year: " + year);
            System.out.println("Category: " + (category != null ? category : "N/A"));
        }
    }


