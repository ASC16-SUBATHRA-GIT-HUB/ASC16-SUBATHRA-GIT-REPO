//package Assign4;
//
//public class Mangoose {
//
//        String title;
//        String director;
//
//        Mangoose(String title, String director) {
//            this.title = title;
//            this.director = director;
//        }
//
//        void showDetails() {
//            System.out.println("Title: " + title);
//            System.out.println("Director: " + director);
//        }
//    }
//
//    class SpecialMovie extends Mangoose {
//        String specialFeature;
//
//        SpecialMovie(String title, String director, String specialFeature) {
//            super(title, director);
//            this.specialFeature = specialFeature;
//        }
//
//        @Override
//        void showDetails() {
//            super.showDetails();
//            System.out.println("Special Feature: " + specialFeature);
//        }
//    }
//
//    class InternationalMovie extends Mangoose {
//        String country;
//        String language;
//
//        InternationalMovie(String title, String director, String country, String language) {
//            super(title, director);
//            this.country = country;
//            this.language = language;
//        }
//
//        @Override
//        void showDetails() {
//            super.showDetails();
//            System.out.println("Country: " + country);
//            System.out.println("Language: " + language);
//        }
//    }
//
//    public class Mangoose {
//        public static void main(String[] args) {
//            SpecialMovie sm = new SpecialMovie("Inception", "Christopher Nolan", "IMAX Experience");
//            InternationalMovie im = new InternationalMovie("Parasite", "Bong Joon-ho", "South Korea", "Korean");
//
//            sm.showDetails();
//            System.out.println();
//            im.showDetails();
//        }
//    }
