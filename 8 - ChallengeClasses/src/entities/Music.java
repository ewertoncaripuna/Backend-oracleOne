package entities;

public class Music {

    private String title;
    private String artist;
    private Integer year;
    private Double rating;
    private Integer countRatings;

    public Music(Integer year, String artist, String title) {
        this.year = year;
        this.artist = artist;
        this.title = title;
        this.rating = 0.0;
        this.countRatings= 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getCountRatings() {
        return countRatings;
    }

    @Override
    public String toString() {
        return  "Title: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Year: " + year + "\n" +
                "Rating: " + String.format("%.1f",averageRating()) + "\n" +
                "CountRatings: " + countRatings;
    }

    public void postRating(Double rating){
        this.rating += rating;
        countRatings++;
    }

    public double averageRating(){
        if(countRatings > 0) {
            return rating / countRatings;
        }else{
            return rating;
        }

    }

}
