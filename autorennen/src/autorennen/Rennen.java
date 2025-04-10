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

    public Auto gebeErstenPlatzZurueck(){
        Auto erstesAuto =null;
        for (int i =0; i < autos.length; i++){
            if (autos[i]!= null) {
                if (erstesAuto==null){
                    erstesAuto = autos[i];
                }
                if (erstesAuto.getZurueckgelegteKilometer() < autos[i].getZurueckgelegteKilometer()){
                    erstesAuto = autos[i];
                }
            }
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
           ersterPlatz = gebeErstenPlatzZurueck().getZurueckgelegteKilometer();


       }
    }
    public void printRennen(){

        System.out.println("Rennen:");
        System.out.println("Streckenlänge: "  + streckenLaenge);
        System.out.println("Rennenteilnehmer: " +autos.length);
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < autos.length; i++) {
            autos[i].printAuto();
        }

        int anzahlPunkte = streckenLaenge/10;

        for(int f = 0; f < autos.length ; f++){

                    String punkte = ".".repeat(anzahlPunkte);
                    System.out.println(punkte);
        }


    }

}