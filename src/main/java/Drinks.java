public class Drinks extends Product{
    private Double volume;
    public Drinks(String name, Double cost, Double volume){
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
