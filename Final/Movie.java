
public class Movie {
    public static enum Genre {
     ACTION, ADVENTURE, DRAMA, MYSTERY, ROMANCE, SCIFI, THRILLER
    }
    private String name;
    private int year;
    private int rating;
    private Genre category;
    public Movie(String name, int year, int rating, Genre genre) {
     this.name=name; this.year=year; this.rating=rating; category=genre;
    }
    public String getName() { return name; }
    public int getYear() { return year; }
    public int getRating() { return rating; }
    public Genre getCategory() { return category; }
    }