// extends Media betyder at arve fra Media.
package media;

public class Cd extends Media {
  private String artist;

  public Cd(String title, double playTime, String artist) {
    super(title, playTime); // Kald superklassens konstruktør
    this.artist = artist;
  }

  public void play() {
    super.play();
    System.out.println(" and is written by: " + artist);
  }
}