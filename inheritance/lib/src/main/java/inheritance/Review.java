package inheritance;

public class Review {

    public String body;
    public String author;
    public int score;
    public String restaurantName;

    public Review(String restaurantName, String body, String author, int score) {
        this.restaurantName = restaurantName;
        this.body = body;
        this.author = author;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", score=" + score +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
