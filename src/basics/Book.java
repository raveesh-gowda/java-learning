package basics;

import java.util.ArrayList;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final ArrayList<Review> reviewList = new ArrayList<Review>();

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void addReview(Review review) {
        reviewList.add(review);
    }

    public String toString() {
        return "basics.Book-" + id + ",  " + title + ", " + author + ", " + reviewList;
    }
}