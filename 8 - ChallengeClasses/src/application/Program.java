package application;

import entities.Calculator;
import entities.Music;
import entities.Person;
import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        List<Music> musics = new ArrayList<>();
        Person person = new Person();
        person.welcome();

        Calculator calculator = new Calculator();
        System.out.println(calculator.doubleToValue(20));

        Music musicOne = new Music(1988,"Guns n roses","November rain");
        Music musictwo = new Music(1994,"Metallica","The unforgiven");
        Music musicthree = new Music(1978,"Neil young","Old Man");

        musicOne.postRating(9.5);
        musicOne.postRating(6.4);
        musicOne.postRating(8.3);

        musics.add(musicOne);
        musics.add(musictwo);
        musics.add(musicthree);

        for(Music music : musics){
            System.out.println();
            System.out.println("****************************");
            System.out.println();
            System.out.println(music);
        }

    }

}
