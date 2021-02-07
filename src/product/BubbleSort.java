package product;
import java.util.List;

public class BubbleSort {

    public static List<Product> sort(List<Product> productList) {

        CategoryComparator categoryComparator = new CategoryComparator();
        ProductComparator productComparator = new ProductComparator();
        Product temp;

        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = 0; j < (productList.size() - 1 - i); j++) {

                //проверяем категорию
                if ((categoryComparator.compare(productList.get(j).getCategory(), productList.get(j + 1).getCategory())) > 0) {
                    temp = productList.get(j + 1);
                    productList.remove(j + 1);
                    productList.add(j + 1, productList.get(j));
                    productList.remove(j);
                    productList.add(j, temp);
                }

                //проверяем цену при совпадении категорий
                if ((categoryComparator.compare(productList.get(j).getCategory(), productList.get(j + 1).getCategory())) == 0) {
                    if (productComparator.compare(productList.get(j), productList.get(j + 1)) < 0) {
                        temp = productList.get(j + 1);
                        productList.remove(j + 1);
                        productList.add(j + 1, productList.get(j));
                        productList.remove(j);
                        productList.add(j, temp);
                    }
                }
            }
        }

        return productList;
    }
}

