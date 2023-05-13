package nested;
import static java.lang.Math.atan;
import static java.lang.Math.cos;
public class Dreieck{
  private boolean rechtwinklig;
  private double ankathete;
  private double gegenkathete;
  private double hypothenuse;

  public Dreieck(boolean rechtwinklig, double ankathete, double gegenkathete){
    this.rechtwinklig = rechtwinklig;
    this.ankathete = ankathete;
    this.gegenkathete = gegenkathete;
  }

  public double winkelAusrechnen(){
    return atan(gegenkathete/ankathete); 
  }

  public double hypothenuseAusrechnen(double winkel){
    return ankathete / cos(winkel);
  }
}
