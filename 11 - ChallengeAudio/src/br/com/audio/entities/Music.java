package br.com.audio.entities;

public class Music extends Audio{

    Album album;

    public Music(String title, String duration, Album album) {
        super(title, duration);
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Music: " + getTitle() + " - Duration: " + getDuration().toString();
    }
}
