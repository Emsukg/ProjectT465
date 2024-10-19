package WerWirdM; // Spiel initialisierung and Spieler eingaben

import java.util.Scanner; // Scanner class aus der java.util Package

public class Main {
   // Spiel wird hier initialisiert, Objekte sind hier gebildet
public static void experte (Scanner sc, Spieler spieler) { // Die Methode , um die Experte des Spielers zu speichern
    System.out.println(spieler.getName() +" " + "Nennen Sie 3 experte, die sich beim Telefonhinsweis anrufen werden"); // Aufforderung die Experten zu bennenen
    int i=0;
    String expert;
    do {
        expert = sc.nextLine();
        spieler.addExperten(expert);
        i++;
    } while (i<3);


}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Es wird die Scannerobject deklariert
       // Das Array der Spieler objectes für Spieler
        Spieler [] spieler = new Spieler[2];
        System.out.println("Wilkommen in das Spiel Werd Wird ein Millinonär,sitzen sie bitte und stellen sie sich vor ");
String []experte = new String[3];
        for (int i = 0; i < spieler.length; i++) {
            System.out.println("Geben Sie ihren Namen ein");
            String name = sc.nextLine(); // Eingabe werden im Format der Stringen gespeichert
             spieler [i]= new Spieler(name);// Hier wird ein neues Objekt der Klasse Spieler erstellt
            experte(sc,spieler[i]);
        }

        WerWirdM spiel = new WerWirdM(spieler); // das gesamte Spiel "Wer wird Millionär".erstellte Array mit den Spielern (spieler) als Argument übergeben
        // Sollen wir noch ein anderes komplettes spiel erstellen sollen wir dann neue Object erstellen
        spiel.spielstart(); // die Methode spielstart() des Spielobjekts aufgerufen


    }


}

