package inheritance;

public class Restaurant {

    private String name;
    private int stars;
    private String price;
    private Review review;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
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
        this.review = new Review(this.name,body, author, score);
        this.stars = (this.stars+score)/2;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
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
