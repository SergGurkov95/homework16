package product;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Category> {

    @Override
    public int compare(Category leftCategory, Category rightCategory) {
        return Long.compare(leftCategory.getCategoryId(), rightCategory.getCategoryId());
    }
}
