package inheritance;

import java.util.ArrayList;

public class Restaurant extends Business{

    private String name;
    private int stars;

    private String price;

    private ArrayList<Review> review = new ArrayList<>();



    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.review = review;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                ", review=" + review +
                '}';
    }

    public void addReview(String body, String author, int score) {
        this.review.add(new Review(getName(),body, author, score));
        setStars((this.stars+score)/2);
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
