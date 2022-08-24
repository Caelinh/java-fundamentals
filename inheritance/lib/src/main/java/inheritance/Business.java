package inheritance;

import java.util.ArrayList;

abstract class Business {

    private String name;

    private int stars;
    private ArrayList<Review> review = new ArrayList<>();

    public Business(String name, int stars, ArrayList<Review> review) {
        this.name = name;
        this.stars = stars;
        this.review = review;
    }

    public void addReview(String body, String author, int score) {
        this.review.add(new Review(getName(),body, author, score));
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

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }
}
