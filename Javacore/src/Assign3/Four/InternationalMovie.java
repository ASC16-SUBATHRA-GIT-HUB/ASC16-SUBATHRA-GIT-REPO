package Assign3.Four;

    public class InternationalMovie extends Movie {
        private String country;
        private String language;

        // Constructor with mandatory fields only
        public InternationalMovie(String movieName, String producedBy) {
            super(movieName, producedBy);
        }

        // Full constructor
        public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                                  String country, String language) {
            super(movieName, producedBy, directedBy, duration, year, category);
            this.country = country;
            this.language = language;
        }

        // Setters and getters
        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        // Override displayInfo to include new fields
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Country: " + (country != null ? country : "N/A"));
            System.out.println("Language: " + (language != null ? language : "N/A"));
        }
    }


