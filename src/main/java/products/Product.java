package products;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String title;
    private int coast;

    public Product(int id, String title, int coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return String.format("Продукт №%s: %s, цена: %s", id, title, coast);
    }
}
