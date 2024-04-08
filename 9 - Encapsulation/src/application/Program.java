package application;

import entities.Movie;

public class Program {

    public static void main(String[] args) {
        Movie movieOne = new Movie("300",2007,60,true);
        Movie movieSecond = new Movie("Forest Gump",1994,142,true);

        movieOne.rate(6.0);
        movieOne.rate(7.0);
        movieOne.rate(8.0);
        movieOne.rate(9.0);
        movieOne.rate(3.0);

        movieOne.showDataMovie();

    }
}
