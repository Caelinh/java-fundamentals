package inheritance;

import java.util.ArrayList;

public class Shop extends Business {
    private String name;
    private String description;
    private String cost;


    public Shop(String name, String description, String cost, int stars, ArrayList review) {
        super(name,stars,review);
        this.description = description;
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
    public void addReview(String body, String author, int score) {
        this.getReview().add(new Review(getName(),body, author, score));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
