package autorennen;

import java.util.Random;

public class Rennen {
    Auto[]autos;
    int streckenLaenge;

    public int getStreckenLaenge() {
        return streckenLaenge;
    }

    public void setStreckenLaenge(int streckenLaenge) {
        this.streckenLaenge = streckenLaenge;
    }

    public Rennen(int streckenLaenge, Auto... autos){
        this.autos = autos;
        this.streckenLaenge = streckenLaenge;
    }

    private Auto gebeErstenPlatzZurueck(){
        Auto erstesAuto =null;
        for (int i =0; i < autos.length; i++){
            erstesAuto
        }
        return erstesAuto;
    }
    public void starten(){
        int ersterPlatz = 0;
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Los");
        while(ersterPlatz<streckenLaenge) {

           for (int i = 0; i < autos.length; i++) {
               autos[i].fahren();
           }

       }
    }

}