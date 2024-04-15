import java.util.Random;
public class uitcheckPunt {

    private String lokatie;
    Random rand= new Random();

    public void uitChecken(OVChipKaart x){
        double reisKosten = x.getSaldo() - berekening(x);

        System.out.println(reisKosten);
        x.setSaldo(reisKosten);
    }


    public double berekening(OVChipKaart x){
        String LokatieA = x.getBeginBestemming();
        String LokatieB = x.getEindBestemming();

        if (LokatieA == LokatieB){
            x.getUitgecheckt();
        }

        return rand.nextDouble(); //Dit Fix ik later
    }

    public uitcheckPunt(String lokatie){
        this.lokatie = lokatie;
    }
    public String getLokaties(){
        return this.lokatie;
    }

    public void setUitchecken (OVChipKaart x){
        if (x.getIngecheckt()) {
            System.out.println("Je moet eerst Inchecken");
        }else {
            System.out.println("Uitchecken gelukt!");
            x.setUitgecheckt(true);
        }
    }
}
