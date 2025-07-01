package autorennen;

import java.util.Arrays;
import java.util.Comparator;


public class Rennen {
    Fahrzeug[]fahrzeuge;
    int streckenLaenge;

    public int getStreckenLaenge() {
        return streckenLaenge;
    }

    public void setStreckenLaenge(int streckenLaenge) {
        this.streckenLaenge = streckenLaenge;
    }

    public Rennen(int streckenLaenge, Fahrzeug... fahrzeuge){
        this.fahrzeuge = fahrzeuge;
        this.streckenLaenge = streckenLaenge;
    }

    public Fahrzeug gebeErstenPlatzZurueck(){
        Fahrzeug erstesFahrzeug =null;
        for (int i =0; i < fahrzeuge.length; i++){
            if (fahrzeuge[i]!= null) {
                if (erstesFahrzeug ==null){
                    erstesFahrzeug  = fahrzeuge[i];
                }
                if (erstesFahrzeug.getPosition() < fahrzeuge[i].getPosition()){
                    erstesFahrzeug  = fahrzeuge[i];
                }
            }
        }
        return erstesFahrzeug ;
    }

    public void starten(){
        int ersterPlatz = 0;
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Los");
        while(ersterPlatz<streckenLaenge) {

           for (int i = 0; i < fahrzeuge.length; i++) {
               fahrzeuge[i].fahren();
           }
           ersterPlatz = gebeErstenPlatzZurueck().getPosition();


       }
    }

    public void fahrzeugHinzufuegen(Fahrzeug fahrzeug){
        Fahrzeug[] neueTeilnehmerliste = new Fahrzeug[fahrzeuge.length +1];
        for(int i = 0; i < fahrzeuge.length; i++){
            neueTeilnehmerliste[i]=fahrzeuge[i];
        }
        neueTeilnehmerliste[fahrzeuge.length]= fahrzeug;
        fahrzeuge = neueTeilnehmerliste;

    }
    public void fahrzeugEntfernen(Fahrzeug fahrzeug){
        Fahrzeug[] neueTeilnehmerliste = new Fahrzeug[fahrzeuge.length -1];
        int index = 0;
        for(int i = 0; i < fahrzeuge.length;i++){
            if(fahrzeuge[i] != fahrzeug){
                if(index < neueTeilnehmerliste.length) {
                    neueTeilnehmerliste[index] = fahrzeuge[i];
                    index++;
                }
            }

        }
        fahrzeuge = neueTeilnehmerliste;
    }

    public void printRennen(){

        System.out.println("Rennen:");
        System.out.println("Streckenlänge: "  + streckenLaenge);
        System.out.println("Rennenteilnehmer: " +fahrzeuge.length);
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < fahrzeuge.length; i++) {
             BasisAuto auto = (BasisAuto) fahrzeuge[i];
            auto.printAuto();
        }
        System.out.println(("Rangliste:"));
        Fahrzeug[] platzierung = Arrays.copyOf(fahrzeuge, fahrzeuge.length);
        Arrays.sort(platzierung, Comparator.comparingInt(Fahrzeug::getPosition).reversed()); //Auto::getPosition = Sortiert nach zurückgelegte Kilometer
        //.reversed sagt es soll von Groß nach klein sortiert werden


        for (int i = 0; i < platzierung.length; i++){
            System.out.println((i +1) + ". Platz: " + platzierung[i].getName() + " " + platzierung[i].getPosition());
        }



    }

}