import autorennen.*;

public class Main {
    public static void main(String[] args) {
        Fahrzeug auto1 = new EAuto("Hans",9, Hersteller.VW, Modell.KLEINWAGEN);
        Fahrzeug auto2 = new Auto("Erik",6,Hersteller.OPEL, Modell.MITTELKLASSE);
        Fahrzeug auto3 = new EAuto("Kim",10,Hersteller.VW, Modell.CABRIO);
        Fahrzeug auto4 = new Auto("Walter",9,Hersteller.RENAULT, Modell.MITTELKLASSE);
        Fahrzeug auto5 = new EAuto("Marvin",10,Hersteller.BMW, Modell.SPORT);
        Fahrzeug auto6 = new Auto("Anna",7,Hersteller.FORD, Modell.PICK_UP);
        Fahrzeug auto7 = new EAuto("Amelie",8,Hersteller.OPEL, Modell.MITTELKLASSE);
        Fahrzeug auto8 = new Auto("Marie",10,Hersteller.SKODA, Modell.SUV);

        Rennen rennen1 = new Rennen(100, auto1,auto2,auto3,auto4, auto5, auto6, auto7, auto8);
        rennen1.starten();
        rennen1.printRennen();
        Fahrzeug auto9 = new Auto("Karina", 9,Hersteller.RENAULT, Modell.KOMBI);
        Rennen rennen2 = new Rennen(100, auto1,auto2,auto3,auto4, auto5, auto6, auto7, auto8);
        rennen2.fahrzeugHinzufuegen(auto9);
        rennen2.fahrzeugEntfernen(auto4);
        rennen2.starten();
        rennen2.printRennen();
    }
}