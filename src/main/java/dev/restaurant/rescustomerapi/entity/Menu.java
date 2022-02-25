package dev.restaurant.rescustomerapi.entity;

public class Menu {
    private String id;
    private String title;
    private String image;
    private float price;
    private String category;

    public Menu(String id, String title, String image, float price, String category) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
