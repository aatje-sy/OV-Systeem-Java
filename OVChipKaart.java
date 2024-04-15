//the imports i use for this OV
import java.util.Random;
import java.time.LocalDate;
public class OVChipKaart {

    //the field
    private double saldo;
    private LocalDate geldigheid;
    private int kaartnummer;
    private String beginBestemming;
    private String eindBestemming;
    private boolean ingecheckt;
    private boolean uitgecheckt;

    //Een methode om een random informatie te genereren voor het OV
    public OVChipKaart() {
        Random rand = new Random();
        this.saldo = rand.nextDouble() * 100;
        this.geldigheid = randomDatum();
        this.kaartnummer = rand.nextInt(10000) + 99999;
    }

    private LocalDate randomDatum(){
        Random rand = new Random();
        int jaar = rand.nextInt(11) + 2023;
        int maand = rand.nextInt(12) + 1;
        int dag = rand.nextInt(30) + 1;
        return LocalDate.of(jaar , maand , dag);
    }


    //The Constructor
    public OVChipKaart (double saldo , LocalDate geldigheid, int kaartnummer) {
        setProperties(saldo , geldigheid , kaartnummer , beginBestemming , eindBestemming);
    }

    public void setIngecheckt(boolean ingecheckt){
        this.ingecheckt = ingecheckt;
    }
    public void setUitgecheckt(boolean uitgecheckt){
        this.uitgecheckt = uitgecheckt;
    }

    //The Set method of the field
    public void setProperties (double saldo , LocalDate geldigheid, int kaartnummer, String beginBestemming , String eindBestemming) {
        this.saldo = saldo;
        this.geldigheid = geldigheid;
        this.kaartnummer = kaartnummer;
        this.beginBestemming = beginBestemming;
        this.eindBestemming = eindBestemming;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;

    }

    //the get methods that call the fields back
    public double getSaldo() {
        return saldo;
    }
    public LocalDate getGeldigheid() {
        return geldigheid;
    }
    public int getKaartnummer() {
        return kaartnummer;
    }
    public String getBeginBestemming(){return beginBestemming;}
    public String getEindBestemming(){return eindBestemming;}
    public boolean getIngecheckt(){return ingecheckt;}
    public boolean getUitgecheckt(){return uitgecheckt;}
}
