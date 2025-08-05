package Assign3.Four;

    public class SpecialMovie extends Movie {
        private String soundEffectsTechnology;
        private String visualEffectsTechnology;

        // Constructor with mandatory fields only
        public SpecialMovie(String movieName, String producedBy) {
            super(movieName, producedBy);
        }

        // Full constructor
        public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                            String soundEffectsTechnology, String visualEffectsTechnology) {
            super(movieName, producedBy, directedBy, duration, year, category);
            this.soundEffectsTechnology = soundEffectsTechnology;
            this.visualEffectsTechnology = visualEffectsTechnology;
        }

        // Setters and getters
        public String getSoundEffectsTechnology() {
            return soundEffectsTechnology;
        }

        public void setSoundEffectsTechnology(String soundEffectsTechnology) {
            this.soundEffectsTechnology = soundEffectsTechnology;
        }

        public String getVisualEffectsTechnology() {
            return visualEffectsTechnology;
        }

        public void setVisualEffectsTechnology(String visualEffectsTechnology) {
            this.visualEffectsTechnology = visualEffectsTechnology;
        }

        // Override displayInfo to include new fields
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Sound Effects Technology: " + (soundEffectsTechnology != null ? soundEffectsTechnology : "N/A"));
            System.out.println("Visual Effects Technology: " + (visualEffectsTechnology != null ? visualEffectsTechnology : "N/A"));
        }
    }


