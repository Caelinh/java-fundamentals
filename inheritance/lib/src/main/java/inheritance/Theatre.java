package inheritance;

import java.util.ArrayList;

public class Theatre extends Business {
    private String name;
    private ArrayList<String> movies = new ArrayList<>();

    private ArrayList<Review> review = new ArrayList<>();


    public Theatre(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
        this.review = review;
    }

    public void addReview(String body, String author, int score) {
        this.review.add(new Review(getName(),body, author, score));
    }

    private void addMovie(String movie){
        movies.add(movie);
    }
    private void removeMovie(String movie){
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }
}
