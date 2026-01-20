package polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter movie type (A for Adventure, C for Comedy, S for Science Fiction, Q to quit): ");
            String type = input.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter movie title: ");
            String title = input.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
