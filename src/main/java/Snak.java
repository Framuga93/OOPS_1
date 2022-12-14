public class Snak extends Product{
    private String taste;
    public Snak (String name, Double cost, String taste){
        super(name,cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snak{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                "taste='" + taste + '\'' +
                '}';
    }
}
