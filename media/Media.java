// abstract gør at man ikke kan oprette 
// objekter af denne klase
package media;

public abstract class Media {
  protected String title;
  protected double playTime;

  public Media(String title, double playTime) {
    this.title = title;
    this.playTime = playTime;
  }

  public void play() {
    System.out.print(title + ": " + playTime);
  }

  public void setTitle(String title) {
    this.title = title;
  }
}