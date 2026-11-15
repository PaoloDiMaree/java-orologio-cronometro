import java.util.Scanner;

public class ProgOrologio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Orologio orologio = new Orologio(12, 0, 0);
        Cronometro cronometro = new Cronometro();
        int scelta;

        do {
            System.out.println("\n--- GESTIONE OROLOGIO E CRONOMETRO ---");
            System.out.println("1 - Impostare l'orario corrente dell'orologio");
            System.out.println("2 - Visualizzare l'orario corrente");
            System.out.println("3 - Azzerare il tempo del cronometro");
            System.out.println("4 - Visualizzare il tempo cronometrato");
            System.out.println("5 - Impostare il tempo cronometrato (ore, minuti, secondi, centesimi)");
            System.out.println("6 - Fai avanzare l'orologio di 1 secondo");
            System.out.println("0 - Esci");
            System.out.print("Inserisci la tua scelta: ");
            scelta = tastiera.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Ore (0-23): ");
                    int h = tastiera.nextInt();
                    System.out.print("Minuti (0-59): ");
                    int m = tastiera.nextInt();
                    System.out.print("Secondi (0-59): ");
                    int s = tastiera.nextInt();

                    orologio.setOre(h);
                    orologio.setMinuti(m);
                    orologio.setSecondi(s);
                    System.out.println("Orario aggiornato correttamente.");
                    break;

                case 2:
                    System.out.println("Orario corrente: " + orologio.getTempo());
                    break;

                case 3:
                    cronometro.azzera_Tempo();
                    System.out.println("Cronometro azzerato.");
                    break;

                case 4:
                    System.out.println("Tempo cronometrato: " + cronometro.getTempo());
                    break;

                case 5:
                    System.out.print("Ore (0-23): ");
                    cronometro.setOre(tastiera.nextInt());
                    System.out.print("Minuti (0-59): ");
                    cronometro.setMinuti(tastiera.nextInt());
                    System.out.print("Secondi (0-59): ");
                    cronometro.setSecondi(tastiera.nextInt());
                    System.out.print("Centesimi (0-99): ");
                    cronometro.setCentesimi(tastiera.nextInt());
                    System.out.println("Tempo cronometrato impostato.");
                    break;

                case 6:
                    orologio.aggiungiSecondo();
                    System.out.println("Nuovo orario: " + orologio.getTempo());
                    break;

                case 0:
                    System.out.println("Chiusura del programma.");
                    break;

                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        } while (scelta != 0);

        tastiera.close();
    }
}
