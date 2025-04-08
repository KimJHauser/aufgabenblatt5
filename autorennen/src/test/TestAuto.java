package test;


import autorennen.Auto;
import autorennen.Typ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAuto {
    @Test
    void testFahren(){
        Auto auto1 = new Auto("Hans", 8, Typ.VW_GOLF);
        auto1.fahren();
        assertTrue(auto1.getZurueckgelegteKilometer()>= 1 && auto1.getZurueckgelegteKilometer()<= 8,"Der Fahrer sollte sich zwischen " +
                "10 bis 80 Metern bewegen hat sich aber: " + auto1.getZurueckgelegteKilometer()+" bewegt");
    }
}

