package autorennen;

public class Auto {
    private String name;
    private int zurueckgelegteKilometer;
    private int geschwindikeitslevel;
    private Typ hersteller;

    public Auto(String name, int geschwindikeitslevel, Typ hersteller){
        this.name = name;
        this.geschwindikeitslevel = geschwindikeitslevel;
        this.hersteller = hersteller;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getZurueckgelegteKilometer(){
        return zurueckgelegteKilometer;
    }

    public void setZurueckgelegteKilometer(int zurueckgelegteKilometer){
        this.zurueckgelegteKilometer = zurueckgelegteKilometer;
    }

    public int getGeschwindikeitslevel(){
        return geschwindikeitslevel;
    }

    public void setGeschwindikeitslevel(int geschwindikeitslevel){
        this.geschwindikeitslevel = geschwindikeitslevel;
    }

    public Typ getHersteller(){
        return hersteller;
    }

    public void setHersteller(Typ hersteller) {
        this.hersteller = hersteller;
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
