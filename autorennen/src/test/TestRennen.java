package test;

import autorennen.Auto;
import autorennen.Rennen;
import autorennen.Typ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRennen {
    @Test
    void testGebeErstenPlatzZurück(){
        Auto auto1 = new Auto("Hans",9, Typ.VW_GOLF);
        Rennen rennen1 = new Rennen(100, auto1);

        assertEquals(auto1,rennen1.gebeErstenPlatzZurueck()," Die Methode erwartet als Fahrer:" + auto1.getName() + " hat aber als Ergebnis: " + rennen1.gebeErstenPlatzZurueck().getName());
        Auto auto2 = null;
        Rennen rennen2 = new Rennen(100, auto2);
        assertNull(rennen2.gebeErstenPlatzZurueck());

        Rennen rennen3 = new Rennen(100,auto1,auto2);
        assertEquals(auto1,rennen3.gebeErstenPlatzZurueck()," Die Methode erwartet als Fahrer:" + auto1.getName() + " hat aber als Ergebnis: " + rennen3.gebeErstenPlatzZurueck().getName());

        Rennen rennen4 = new Rennen(100,auto2,auto1);
        assertEquals(auto1,rennen4.gebeErstenPlatzZurueck()," Die Methode erwartet als Fahrer:" + auto1.getName() + " hat aber als Ergebnis: " + rennen4.gebeErstenPlatzZurueck().getName());
    }
    @Test
    void testRennenStarten(){
        Auto auto1 = new Auto("Hans",9, Typ.VW_GOLF);
        Rennen rennen1 = new Rennen(100, auto1);
        assertEquals(auto1,rennen1.gebeErstenPlatzZurueck()," Die Methode erwartet als Fahrer:" + auto1.getName() + " hat aber als Ergebnis: " + rennen1.gebeErstenPlatzZurueck().getName());
    }

}
