package product;

public class Category {
    private String name;
    private Long categoryId;

    public Category(String name, Long categoryId){
        this.name = name;
        this.categoryId = categoryId;
    }


    public String getName() {
        return name;
    }

    public Long getCategoryId() {
        return categoryId;
    }


    @Override
    public String toString() {
        return " категория: \"" + name + "\" Id= " + categoryId;
    }
}
