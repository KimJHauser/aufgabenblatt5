import autorennen.Auto;
import autorennen.Rennen;
import autorennen.Typ;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Hans",9, Typ.VW_GOLF);
        Auto auto2 = new Auto("Erik",6,Typ.OPEL_ASTRA);
        Auto auto3 = new Auto("Kim",10,Typ.VW_GOLF);
        Auto auto4 = new Auto("Walter",9,Typ.RENAULT_MEGANE);
        Auto auto5 = new Auto("Marvin",10,Typ.BMW_X6);
        Auto auto6 = new Auto("Anna",7,Typ.FORD_FOCUS);
        Auto auto7 = new Auto("Amelie",8,Typ.OPEL_CORSA);
        Auto auto8 = new Auto("Marie",10,Typ.SKODA_KAROQ);

        Rennen rennen1 = new Rennen(100, auto1,auto2,auto3,auto4, auto5, auto6, auto7, auto8);
        rennen1.starten();
        rennen1.printRennen();
    }
}