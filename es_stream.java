import java.io.FileInputStream;
import java.io.IOException;

public class es_stream {

    public static void main(String[] args) {
        String nomeFile = "prova.txt";

        // Stream per la lettura del file racchiuso nel try
        try (FileInputStream fileInputStream = new FileInputStream(nomeFile)) {
            int carattere;

            System.out.println("Contenuto del file:");
            while ((carattere = fileInputStream.read()) != -1) { // Legge un carattere per volta usando lo stream
                System.out.print((char) carattere); // Stampa i caratteri, leggendo il contenuto del file
            }
        } 

        // In caso di errore nella lettura messaggio di avviso con possibili soluzioni
        catch (IOException e) {
            System.out.println("Errore: non è stato possibile leggere il file 'prova.txt', controlla eventuali errori nel nome e verifica il percorso");
        }

        // Messaggio di conferma di fine ciclo, come nell'esmepio delle eccezioni, la sua esecuzione non è preclusa dalla buona uscita o da un errore
        finally {
            System.out.println("\nEsecuzione terminata");
        }
    }
}