import java.util.Scanner;

public class eccezione {
    public static void main(String[] args) {
        // Classe scanner per input
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt(); // Eccezione da gestire se l'input non è un numero
            System.out.println("Hai inserito: " + numero);
        } 
        catch (Exception e) {
            // Gestisce l'errore con catch
            System.out.println("Errore: inserisci un numero valido");
        }
        finally {
            // Istruzione da effettuare a fine esecuzione, lanciata indipendemente dal catch, non dipende dall'errore
            scanner.close(); // Chiude lo scanner
            System.out.println("Programma terminato");
        }

    }
}
