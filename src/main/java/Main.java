import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        List<Product> productList = new ArrayList<Product>(
                Arrays.asList(
                new Snak("Lays",12.0,"Cheese"),
                new Product("Twix",11.0)
                        )
        );
        VendineMachine machine = new VendineMachine(productList);
        String key = "Twix";
        System.out.println(machine.getProductByName(key));

        List<Product> bottleList = new ArrayList<Product>(
                Arrays.asList(
                        new Drinks("Aqua",12.0, 0.5),
                        new Drinks("Evelate",11.0, 1.0)
                )
        );
        VendineMachine bottleMachine = new DrinksMachine(bottleList);
        String keyBottle = "Aqua";
        System.out.println(bottleMachine.getProductByName(keyBottle));

        List<Product> hotDrinksList = new ArrayList<>(
                Arrays.asList(
                        new HotDrinks("Coffe", 8.0,0.3,80),
                        new HotDrinks("Tea",5.5,0.5,90)
                )
        );
        VendineMachine hotDrinksMachine = new HotDrinksMachine(hotDrinksList);
        String keyHotDrink = "Tea";
        System.out.println(hotDrinksMachine.getProductByName(keyHotDrink));
    }
}
