import nested.Dreieck;
public class Main{
  public static void main(String[] args){
    Dreieck dreieck = new Dreieck(true, 2.5, 5);
    double winkel = dreieck.winkelAusrechnen();
    System.out.println("Der Winkel zwischen der Ankathete und Gegenkathete beträgt " +winkel + " Grad");
    System.out.println(("Die Hypothenuse ist " +dreieck.hypothenuseAusrechnen(winkel) +" Maßeinheiten lang"));
  }
}
