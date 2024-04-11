package br.com.audio.entities;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private Integer id;
    private String albumName;
    private Integer yearRelease;
    private Integer quantityMusic;
    Artist artist;

    private List<Music> musics = new ArrayList<>();

    public Album(Integer id, String albumName, Integer yearRelease, Integer quantityMusic, Artist artist) {
        this.id = id;
        this.albumName = albumName;
        this.yearRelease = yearRelease;
        this.quantityMusic = quantityMusic;
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Integer getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(Integer yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Integer getQuantityMusic() {
        return quantityMusic;
    }

    public void setQuantityMusic(Integer quantityMusic) {
        this.quantityMusic = quantityMusic;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void addMusic(Music music){
        musics.add(music);
    }
    public void removeMusic(Music music){
        musics.remove(music);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album ID: ").append(this.id).append("\n");
        sb.append("Name: ").append(this.albumName).append("\n");
        sb.append("Release Year: ").append(this.yearRelease).append("\n");
        sb.append("Artist: ").append(this.artist.getName()).append("\n");
        sb.append("Musics:\n");
        for (Music music : musics) {
            sb.append(music.toString()).append("\n");
        }
        return sb.toString();
    }
}
