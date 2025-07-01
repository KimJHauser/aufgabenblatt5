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
}
