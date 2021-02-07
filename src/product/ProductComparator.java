package product;
import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product leftProduct, Product rightProduct) {
        return leftProduct.getPrice().compareTo(rightProduct.getPrice());
    }
}
