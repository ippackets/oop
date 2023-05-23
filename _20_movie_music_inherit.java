class VideoTape {
  private String title;
  private int duration;

  public VideoTape(String title, int duration) {
    this.title = title;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public int getDuration() {
    return duration;
  }

  public void display() {
    System.out.println("Title: " + title);
    System.out.println("Duration: " + duration + " minutes");
  }
}

class Movie extends VideoTape {
  private String director;
  private String genre;

  public Movie(String title, int duration, String director, String genre) {
    super(title, duration);
    this.director = director;
    this.genre = genre;
  }

  public String getDirector() {
    return director;
  }

  public String getGenre() {
    return genre;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Director: " + director);
    System.out.println("Genre: " + genre);
  }
}

class MusicVideo extends VideoTape {
  private String artist;
  private String album;

  public MusicVideo(String title, int duration, String artist, String album) {
    super(title, duration);
    this.artist = artist;
    this.album = album;
  }

  public String getArtist() {
    return artist;
  }

  public String getAlbum() {
    return album;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Artist: " + artist);
    System.out.println("Album: " + album);
  }
}

public class _20_movie_music_inherit {

  public static void main(String[] args) {
    Movie movie = new Movie("Inception", 148, "Christopher Nolan", "Science Fiction");
    movie.display();

    System.out.println();

    MusicVideo musicVideo = new MusicVideo("Shape of You", 233, "Ed Sheeran", "Divide");
    musicVideo.display();
  }
}
