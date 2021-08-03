package inheritance;

public abstract class ParentOfTheater {

    private int stars;
    private String body;
    private String author;

    public abstract String TheaterOnly(int stars, String body, String author);
    public abstract String TheaterWithMovie(int stars, String body, String author , String movie);

}
