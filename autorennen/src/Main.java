import autorennen.Auto;
import autorennen.Rennen;
import autorennen.Hersteller;
import autorennen.Modell;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Hans",9, Hersteller.VW, Modell.KLEINWAGEN);
        Auto auto2 = new Auto("Erik",6,Hersteller.OPEL, Modell.MITTELKLASSE);
        Auto auto3 = new Auto("Kim",10,Hersteller.VW, Modell.CABRIO);
        Auto auto4 = new Auto("Walter",9,Hersteller.RENAULT, Modell.MITTELKLASSE);
        Auto auto5 = new Auto("Marvin",10,Hersteller.BMW, Modell.SPORT);
        Auto auto6 = new Auto("Anna",7,Hersteller.FORD, Modell.PICK_UP);
        Auto auto7 = new Auto("Amelie",8,Hersteller.OPEL, Modell.MITTELKLASSE);
        Auto auto8 = new Auto("Marie",10,Hersteller.SKODA, Modell.SUV);

        Rennen rennen1 = new Rennen(100, auto1,auto2,auto3,auto4, auto5, auto6, auto7, auto8);
        rennen1.starten();
        rennen1.printRennen();
        Auto auto9 = new Auto("Karina", 9,Hersteller.RENAULT, Modell.KOMBI);
        Rennen rennen2 = new Rennen(100, auto1,auto2,auto3,auto4, auto5, auto6, auto7, auto8);
        rennen2.autoHinzufuegen(auto9);
        rennen2.autoEntfernen(auto4);
        rennen2.starten();
        rennen2.printRennen();

    }
}