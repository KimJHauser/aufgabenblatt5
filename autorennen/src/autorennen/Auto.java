package autorennen;

public class Auto extends BasisAuto {


    public Auto(String name, int geschwindikeitslevel, Hersteller hersteller, Modell modell){
        super(name, geschwindikeitslevel, hersteller, modell);
    }

    public int getZurueckgelegteKilometer(){
        return zurueckgelegteKilometer;
    }

    public void fahren(){
        zurueckgelegteKilometer = zurueckgelegteKilometer + (int) (((Math.random() * 10)*geschwindikeitslevel)+1);
    }

    public void printAuto(){
        System.out.println("Name: " + name);
        System.out.println("zurückgelegte Kilometer: " + zurueckgelegteKilometer);
        System.out.println("Geschwindigkeitslevel: " + geschwindikeitslevel);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("---------------------------------------------------------");
    }
}
