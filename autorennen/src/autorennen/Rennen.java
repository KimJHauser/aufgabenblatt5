package autorennen;

import java.util.Arrays;
import java.util.Comparator;
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
        System.out.println(("Rangliste:"));
        Auto[] platzierung = Arrays.copyOf(autos, autos.length);
        Arrays.sort(platzierung, Comparator.comparingInt(Auto::getZurueckgelegteKilometer).reversed()); //Auto::getPosition = Sortiert nach zurückgelegte Kilometer
        //.reversed sagt es soll von Groß nach klein sortiert werden


        for (int i = 1; i < platzierung.length; i++){
            System.out.println(i + ". Platz: " + platzierung[i].getName() + " " + platzierung[i].getZurueckgelegteKilometer());
        }



    }

}