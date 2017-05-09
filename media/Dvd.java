package media;
public class Dvd extends Media {
  String mainActor;
  String director;

  public Dvd(String title, double playTime,
    String mainActor, String director) {

     // SKAL være den første linie i konstruktøren.
    super(title, playTime);
    this.mainActor = mainActor;
    this.director = director;
  }
}