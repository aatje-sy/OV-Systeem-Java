import java.util.Scanner;
public class OvDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isInGeChecked = false;
        int keuze = 0;

        OVChipKaart kaart = new OVChipKaart();
        incheckPunt incheckCall = new incheckPunt();
        uitcheckPunt uitcheckCall = new uitcheckPunt("Nijmegen");

        System.out.println("Je kaart nummer is: " + kaart.getKaartnummer());
        System.out.println("Je Saldo is: " + kaart.getSaldo());
        System.out.println("Je kaart is geldig tot: " + kaart.getGeldigheid());

        System.out.println("__________________");


        do {
            System.out.println("Wat wil je doen met je ovChipkaart?");
            System.out.println("1.Inchecken");
            System.out.println("2.Uitchecken");
            System.out.println("3.Laadpaal");
            System.out.println("4.Stoppen");
            System.out.println("Kies 1-4");

            keuze = sc.nextInt();

            switch (keuze) {
                case 1:
                    incheckCall.setinchecken(kaart);
                case 2:
                    uitcheckCall.uitChecken(kaart);
                    break;
                default:
            }
        }while (keuze != 4);
    }
}
