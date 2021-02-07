package product;

import java.math.BigDecimal;
import java.util.*;

public class MainProduct {
    public static void main(String[] args) {

        Category bakery = new Category("Кондитерские изделия", 1l);
        Category meat = new Category("мясные продукты", 2l);
        Category cereals = new Category("крупы", 3l);
        Category vegNFru = new Category("овощи и фрукты", 4l);

        Set<Product> productSet = new LinkedHashSet<>() {{                          //изначальная используем LinkedHashSet что бы избавится от дублей
            add(new Product("пирог", new BigDecimal("8.70"), bakery));
            add(new Product("курица", new BigDecimal("7.91"), meat));
            add(new Product("овсянка", new BigDecimal("1.93"), cereals));
            add(new Product("печенье", new BigDecimal("5.59"), bakery));
            add(new Product("персики", new BigDecimal("3.95"), vegNFru));
            add(new Product("говядина", new BigDecimal("9.32"), meat));
            add(new Product("картофель", new BigDecimal("1.73"), vegNFru));
            add(new Product("вишня", new BigDecimal("2.37"), vegNFru));
            add(new Product("рис", new BigDecimal("2.60"), cereals));
            add(new Product("макароны", new BigDecimal("2.31"), cereals));
        }};

        List<Product> product = new ArrayList<>(productSet);                       //переписываем список из LinkedHashSet в ArrayList, что бы было проще работать

        product  = BubbleSort.sort(product);

        for (Product i: product){
            System.out.println(i);
        }


    }
}
