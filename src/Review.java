public class Review {
    private final int id;
    private final String description;
    private final byte rating;

    public Review(int id, String description, byte rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return "(Review-" + id + ", " + description + ", " + rating + ")";
    }
}