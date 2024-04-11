package br.com.audio.application;

import br.com.audio.entities.Album;
import br.com.audio.entities.Artist;
import br.com.audio.entities.Audio;
import br.com.audio.entities.Music;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {


    //SIMPLE SYSTEM TO REGISTER ARTIST, ALBUM AND MUSICS TO ALBUM, TO FINALLY SAVE IN FILE.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***************WELCOME TO ÁUDIO MATCH***************");
        System.out.println();
        System.out.print("Insert name of artist: ");
        String nameArtist = sc.nextLine();
        System.out.print("Set id for artist: ");
        Integer idArtist = sc.nextInt();

        Artist artist = new Artist(idArtist,nameArtist);
        System.out.println(artist);

        System.out.println();
        System.out.print("Insert name of the album to " + artist.getName() + ": ");
        sc.nextLine();
        String nameAlbum = sc.nextLine();
        System.out.print("Insert id of the album: ");
        Integer idAlbum = sc.nextInt();
        System.out.print("NUmber of musics of album: ");
        Integer numberMusics = sc.nextInt();
        System.out.print("Insert release date: ");
        Integer yearRelease = sc.nextInt();

        Album album = new Album(idAlbum,nameAlbum,yearRelease, numberMusics, artist);

        System.out.println(album);
        artist.addAlbum(album);
        System.out.println("******************************************************");

        System.out.println();

        System.out.println("Now register the " + numberMusics + " musics to album " + nameAlbum);

        sc.nextLine();
        for(int i=0; i<numberMusics; i++){

            System.out.print("Inserting music #" + (i+1) + ": ");
            System.out.print("Name music: ");
            String nameMusic = sc.nextLine();
            System.out.print("Duration: ");
            String durationMusic = sc.nextLine();
            album.addMusic(new Music(nameMusic,durationMusic,album));

        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/ewertonlinux/final.csv"))) {

            bw.write(artist.toString());
            bw.newLine();
            bw.write("**********************************************");
            bw.newLine();
            bw.write(album.toString());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("********************* Artist ************************");
        System.out.println(artist);
        System.out.println();
        System.out.println("********************* Album ************************");
        System.out.println(album);
        System.out.println();
    }


    }
