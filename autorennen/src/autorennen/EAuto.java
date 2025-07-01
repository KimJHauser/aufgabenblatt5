package autorennen;

public class EAuto extends BasisAuto {



    public EAuto(String name, int geschwindikeitslevel, Hersteller hersteller, Modell modell){
        super(name, geschwindikeitslevel, hersteller, modell);
    }


    @Override
    public void fahren() {
        zurueckgelegteKilometer = zurueckgelegteKilometer + (int) (((Math.random() * 10)*geschwindikeitslevel)+1);
    }
}
