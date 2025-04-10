import autorennen.Auto;
import autorennen.Rennen;
import autorennen.Typ;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Hans",9, Typ.VW_GOLF);

        Auto auto2 = new Auto("Erik",9,Typ.OPEL_ASTRA);
        Auto auto3 = new Auto("kim",9,Typ.VW_GOLF);
        Rennen rennen1 = new Rennen(100, auto1,auto2,auto3);
        rennen1.starten();
        rennen1.printRennen();
    }
}