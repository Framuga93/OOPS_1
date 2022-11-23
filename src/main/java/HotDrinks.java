public class HotDrinks extends Product{

    private Double volume;
    private int temperature;

    public HotDrinks(String name, Double coast, Double volume, int temperature) {
        super(name, coast);
        this.volume = volume;
        this.temperature = temperature;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
