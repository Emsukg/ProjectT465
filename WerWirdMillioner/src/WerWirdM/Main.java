package WerWirdM; // Spiel initialisierung and Spieler eingaben

import java.util.Scanner; // Scanner class aus der java.util Package

public class Main { // Spiel wird hier initialisiert, Objekte sind hier gebildet

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Es wird die Scannerobject deklariert
        Spieler[] spieler = new Spieler[2]; // Das Array der Spieler objectes für Spieler
        System.out.println("Wilkommen in das Spiel Werd Wird ein Millinonär,sitzen sie bitte und stellen sie sich vor ");

        for (int i = 0; i < spieler.length; i++) {
            String name = sc.nextLine(); // Eingabe werden im Format der Stringen gespeichert
            spieler[i] = new Spieler(name); // Hier wird ein neues Objekt der Klasse Spieler erstellt
        }
        WerWirdM spiel = new WerWirdM(spieler); // das gesamte Spiel "Wer wird Millionär".erstellte Array mit den Spielern (spieler) als Argument übergeben
        // Sollen wir noch ein anderes komplettes spiel erstellen sollen wir dann neue Object erstellen
        spiel.spielstart(); // die Methode spielstart() des Spielobjekts aufgerufen


    }
}
