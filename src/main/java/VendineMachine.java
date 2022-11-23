
import java.util.ArrayList;
import java.util.List;

public class VendineMachine {
    private final List<Product> productList;

    public VendineMachine(List<Product> productList){
        this.productList = productList;
    }

    public Product getProductByName (String name){
        for (Product item : productList){
            if (name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }

}
