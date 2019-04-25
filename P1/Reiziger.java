package P1;

public class Reiziger {

    private String naam;
    private String gbDatum;

    public Reiziger(String naam, String gbDatum) {
        this.naam = naam;
        this.gbDatum = gbDatum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGbDatum() {

        return gbDatum;
    }

    public void setGbDatum(String gbDatum) {
        this.gbDatum = gbDatum;
    }


    public String toString(){
        return naam;
    }
}
