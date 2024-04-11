package br.com.audio.entities;

import java.time.Duration;
import java.util.Date;

public class Audio {

    private String title;
    private Duration duration;
    private Integer counter;
    private Integer likes;
    private Double rating;


    public Audio(String title, String duration) {
        this.duration = encodeDuration(duration);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Integer getCounter() {
        return counter;
    }

    public Integer getLikes() {
        return likes;
    }

    public Double getRating() {
        return rating;
    }

    public Duration encodeDuration(String duration){

        String[] parts = duration.split(":");
        Duration durationMusic;

        if(parts.length > 2) {
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            durationMusic = Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);

        }else{
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);

            durationMusic = Duration.ofMinutes(minutes).plusSeconds(seconds);

        }

        return durationMusic;

    }

    @Override
    public String toString() {
        return "Audio{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", counter=" + counter +
                ", likes=" + likes +
                ", rating=" + rating +
                '}';
    }
}
