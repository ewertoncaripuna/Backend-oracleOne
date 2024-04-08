package entities;

public class Movie {

    private String name;
    private Integer releaseDate;
    private Integer duration;
    private boolean inPlan;
    private Double sumOfRatings;
    private Integer totalRatings;

    public Movie(String name, Integer releaseDate, Integer duration, boolean inPlan) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.inPlan = inPlan;
        this.sumOfRatings = 0.0;
        this.totalRatings = 0;

    }

    public Integer getTotalRatings() {
        return totalRatings;
    }

    public Double getSumOfRatings() {
        return sumOfRatings;
    }

    public boolean isInPlan() {
        return inPlan;
    }

    public void setInPlan(boolean inPlan) {
        this.inPlan = inPlan;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rate(Double rating){
        sumOfRatings += rating;
        totalRatings++;
    }

    public double averageRate(){
        return sumOfRatings / totalRatings;
    }

    public void showDataMovie() {
        System.out.println("Movie name: " + name);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Duration: " + duration);
        System.out.println("Included plan: " + inPlan);
        System.out.println(averageRate() + " of " + getTotalRatings() + " ratings");

    }


}
