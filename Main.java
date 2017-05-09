// Compile with javac -d . *.java

import media.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] azat) {
    Cd cd1 = new Cd("Et eller andet", 150.0, "Mathias big band");
    Cd cd2 = new Cd("Noget helt tredje", 120.0, "Patricks fløjteorkester");
    
    Dvd dvd1 = new Dvd("What women want", 114.5, "Helen Hunt", "Mel Gibson");
    Dvd dvd2 = new Dvd("What women want 2", 124.5, "Helen Hunt", "Mel Gibson");

    cd1.setTitle("Noget andet");

    ArrayList<Media> medias = new ArrayList<Media>();
    medias.add(cd1);
    medias.add(cd2);
    medias.add(dvd1);
    medias.add(dvd2);
    
    for(Media m : medias) {
      m.play();
    }

    // Media m1 = new Media("Should not exist", 12);
    // m1.play();

  }
}