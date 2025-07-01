package autorennen;

import java.util.Arrays;
import java.util.Comparator;


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

    public void autoHinzufuegen(Auto auto){
        Auto[] neueTeilnehmerliste = new Auto[autos.length +1];
        for(int i = 0; i < autos.length; i++){
            neueTeilnehmerliste[i]=autos[i];
        }
        neueTeilnehmerliste[autos.length]= auto;
        autos = neueTeilnehmerliste;

    }
    public void autoEntfernen(Auto auto){
        Auto[] neueTeilnehmerliste = new Auto[autos.length -1];
        int index = 0;
        for(int i = 0; i < autos.length;i++){
            if(autos[i] != auto){
                if(index < neueTeilnehmerliste.length) {
                    neueTeilnehmerliste[index] = autos[i];
                    index++;
                }
            }

        }
        autos = neueTeilnehmerliste;
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


        for (int i = 0; i < platzierung.length; i++){
            System.out.println((i +1) + ". Platz: " + platzierung[i].getName() + " " + platzierung[i].getZurueckgelegteKilometer());
        }



    }

}