package br.com.audio.entities;

import java.util.ArrayList;
import java.util.List;

public class Artist {

    private Integer id;
    private String name;

    private List<Album> albums = new ArrayList<>();

    public Artist(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album){
        albums.add(album);
    }

    public void removeAlbum(Album album){
        albums.remove(album);
    }


    @Override
    public String toString() {
        return  "id=" + id + "\n" +
                "name= " + name + "\n" +
                "albums= " + albums ;
    }
}
