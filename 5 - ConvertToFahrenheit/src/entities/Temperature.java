package entities;

public class Temperature {
    private Double temp;

    public Temperature(Double temp) {
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double convertToCelsius(){
       return this.temp = (this.temp * 1.8) + 32;
    }


}
