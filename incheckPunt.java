import java.time.LocalDate;
public class incheckPunt {

    public boolean ovSaldoControleren(OVChipKaart x) {
        double Saldo = x.getSaldo();
        if (Saldo >= 0) {
            setinchecken(x);
            return true;
        } else if (Saldo < 0) {
            System.out.println("Je kan niet inchecken, Je huidige saldo is: " + Saldo);
            return false;
        } else {
            System.out.println("Fout");
            return false;
        }

    }
    public boolean geldigheidControleren(OVChipKaart x){
        LocalDate datum = LocalDate.now();

        if (datum.isBefore(x.getGeldigheid())){
            setinchecken(x);
            return true;
        }else if(datum.isAfter(x.getGeldigheid())) {
            System.out.println("Je kaart is ongeldig!");
            return false;
        }else {
            return false;
        }
    }

    public void setinchecken(OVChipKaart x){

            if (x.getIngecheckt()){
                System.out.println("Je bent al ingecheckt");

            }else {
                System.out.println("Je bent ingecheckt");
                x.setIngecheckt(true);
            }
        }


    }








