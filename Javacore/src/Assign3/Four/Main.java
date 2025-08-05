package Assign3.Four;


    public class Main {
        public static void main(String[] args) {
            SpecialMovie specialMovie = new SpecialMovie("Avatar", "20th Century Fox", "James Cameron", 162, 2009, "Sci-Fi",
                    "Dolby Atmos", "CGI");
            specialMovie.displayInfo();

            System.out.println("\n---\n");

            InternationalMovie intlMovie = new InternationalMovie("Parasite", "CJ Entertainment", "Bong Joon-ho", 132, 2019, "Thriller",
                    "South Korea", "Korean");
            intlMovie.displayInfo();
        }
    }


