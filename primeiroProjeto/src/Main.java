public class Main {

    public static void main(String[] args){

        System.out.println("Bem vindo ao Screen Match.");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseDate = 2022;

        System.out.println("Release Date: " + releaseDate);

        boolean inPlan = true;
        double rating = 8.1;
        double score = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(String.format("%.2f",score));

        String sinopse = "Continuation of movie from 80's, about fights in the air";
        System.out.println(sinopse);

    int classification = (int) (score / 2);

        System.out.println(classification);

    }

}
