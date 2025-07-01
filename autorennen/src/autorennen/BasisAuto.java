package autorennen;

public abstract class BasisAuto implements Fahrzeug {
    protected String name;
    protected int zurueckgelegteKilometer;
    protected int geschwindikeitslevel;
    protected Hersteller hersteller;
    protected Modell modell;

    public BasisAuto(String name, int geschwindikeitslevel, Hersteller hersteller, Modell modell){
        this.name = name;
        this.geschwindikeitslevel = geschwindikeitslevel;
        this.hersteller = hersteller;
        this.modell = modell;
    }

    @Override
    public abstract void fahren();

    @Override
    public int getPosition(){
        return zurueckgelegteKilometer;
    }

    @Override
    public String getName(){
        return name;
    }

    public void printAuto(){
        System.out.println("Name: " + name);
        System.out.println("zurückgelegte Kilometer: " + zurueckgelegteKilometer);
        System.out.println("Fahrzeugtyp: " + getClass().getSimpleName());
        System.out.println("Geschwindigkeitslevel: " + geschwindikeitslevel);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Modell: " + modell);
        System.out.println("---------------------------------------------------------");
    }
}
