package WerWirdM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class WerWirdM {
    String[][][] Fragen; // String für Fragen , Antwortmöglichkeiten und richtige Antwort
    int[] summe = {50, 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 500000, 1000000}; // Gewinnsumme
    int fragenummer = 0; // Frage indicator
    Spieler[] spieler; // Spieler objecte

    public WerWirdM(Spieler[] spieler) { // Constructor bekommt Spieler array with objecten spieler
        this.spieler = spieler; // feld der klasse Spieler bekommt
        Fragen = new String[15][2][3]; // A
        einfehrung(); // Die Methoden werden hier aufgerufen , weil nach der Einstellung des Konstruktors das Spiel kann abgelaufen werden
        Fragenstellen();
    }

    public void einfehrung() { // In diesem Methode wählt Spieler zwei mögliche Vartiante des Spieles
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < spieler.length; i++) {

            System.out.println("Willkommen zur Sendung Wer wird Milliarden sehr geehrte" + " " + spieler[i].getName());
            System.out.println("Welche Moglichkeiten wahlen Sie: ");
            System.out.println("1. 2 feste Gewinnstufen(500 oder 16000 Euro) fuer 3 Joker");
            System.out.println("2. 1 feste Gewinnstufe(500 Euro) fuer 4 Jokers");
            String ans;
            do { //  do-while-Schleife stellt sicher, dass nur gültige Eingaben akzeptiert werden.
                System.out.println("Wählen sie die nummer ");
                ans = sc.nextLine();

            } while (!ans.equalsIgnoreCase("1") && !ans.equalsIgnoreCase("2")); // Eingabe soll entweder 1 oder 2 sein,solange die answer is weder 1 und  noch 2 , dann wird es weitergehen
            if (ans.equalsIgnoreCase("1")) {
                spieler[i].setJokers(3);
                spieler[i].setFestgewinn(new int[]{500, 16000});
                spieler[i].enableJoker5050();
                spieler[i].enableJokerCallFriend();
                spieler[i].enableJokerAudienceHelp();

            } else {
                spieler[i].setJokers(4);
                spieler[i].setFestgewinn(new int[]{500});
                spieler[i].enableJoker5050();
                spieler[i].enableJokerCallFriend();
                spieler[i].enableJokerAudienceHelp();
                spieler[i].enablejokerzusatz();
            }

        }
    }

    public void Fragenstellen() {
        Fragen[0][0][0] = "Frage 1:Was dient nicht zur Verhütung?"; // Frage 1 Spieler 1
        Fragen[0][0][1] = "A: Pille,B: Kondom,C: Coitus interruptus,D: Glücksspirale ";
        Fragen[0][0][2] = "D";

        Fragen[0][1][0] = "Frage 1: Was macht der Platzwart von Berufs wegen?"; // Frage 1 Spieler 2
        Fragen[0][1][1] = "A: an der Tube schnüffeln,B: ein paar Linien ziehen,C: sich einen zwitschern,D: 'ne Tüte drehen";
        Fragen[0][1][2] = "B";

        Fragen[1][0][0] = "Frage 2: Große Heulerei gibt's manchmal auf der Kirmes, wenn Kinder ...?";
        Fragen[1][0][1] = "A: desorientiert sind,B: aus der Spur kommen,C: die Ballons verlieren,D: ins Schwanken geraten";
        Fragen[1][0][2] = "C";

        Fragen[1][1][0] = "Frage 2: Wer kann vielleicht schwimmen, aber nicht fliegen?";
        Fragen[1][1][1] = "A: Stockenten,B: Pfeifenten,C: Krickenten,D: Studenten";
        Fragen[1][1][2] = "D";

        Fragen[2][0][0] = "Frage 3: Welcher natürliche Reichtum ist selbst bei ansonsten mittellosen Männern in aller Regel unverkäuflich?";
        Fragen[2][0][1] = "A: Tafelsilber,B: Goldreserve,C: Kronjuwelen,D: Fabergé-Eier";
        Fragen[2][0][2] = "C";

        Fragen[2][1][0] = "Frage 3: Wie bezeichnet man Wandmalerei auf feuchtem Kalkputz?";
        Fragen[2][1][1] = "A: Fiasko,B: Fresko,C: Fiesta,D: Frisco";
        Fragen[2][1][2] = "B";

        Fragen[3][0][0] = "Frage 4: Wer weiß wohl am ehesten, was mit \"Jumpsuit\" gemeint ist?";
        Fragen[3][0][1] = "A:Modekenner,B: Börsen-Spekulanten,C: Stabhochspringer,D: Autoverkäufer";
        Fragen[3][0][2] = "A";

        Fragen[3][1][0] = "Frage 4: Von welchem nur 321 Meter hohen Berg wird behauptet, der meistbestiegene Europas zu sein?";
        Fragen[3][1][1] = "A:Brocken,B: Drachenfels,C: Feldberg,D: Zugspitze";
        Fragen[3][1][2] = "B";

        Fragen[4][0][0] = "Frage 5: Welche dieser legendären Brücken kann man nicht mit dem Auto passieren?";
        Fragen[4][0][1] = "A:Rialtobrücke,B: Pont Neuf,C: Golden Gate Bridge,D: Öresundbrücke";
        Fragen[4][0][2] = "A";

        Fragen[4][1][0] = "Frage 5: Was bedeutet der Name der italienischen Nachspeise \"Tiramisu\" wörtlich?";
        Fragen[4][1][1] = "A: süß und köstlich, B: zieh mich hoch, C: das macht dick, D: Leckermäulchen";
        Fragen[4][1][2] = "B";

        Fragen[5][0][0] = "Frage 6: Wie viel Meter legt man zurück, während man im Auto bei 120 km/h für drei Sekunden auf sein Handy schaut?";
        Fragen[5][0][1] = "A: ungefähr 15 Meter, B: knapp 30 Meter, C: etwa 50 Meter, D: rund 100 Meter";
        Fragen[5][0][2] = "D";

        Fragen[5][1][0] = "Frage 6: Welches dieser Bundesländer war noch nie mit einem Verein in der Ersten Fußball-Bundesliga der Herren vertreten?";
        Fragen[5][1][1] = "A: Saarland, B: Rheinland-Pfalz, C: Schleswig-Holstein, D: Hessen";
        Fragen[5][1][2] = "C";

        Fragen[6][0][0] = "Frage 7: Wer ist laut Grundgesetz der Vertreter des Bundespräsidenten?";
        Fragen[6][0][1] = "A: Vizebundespräsident, B: Bundesratspräsident, C: Bundestagspräsident, D: Bundeskanzler";
        Fragen[6][0][2] = "B";

        Fragen[6][1][0] = "Frage 7: Welcher Kinderbuchheld entpuppt sich als Nachfahre von einem der Heiligen Drei Könige?";
        Fragen[6][1][1] = "A: Harry Potter, B: Peter Pan, C: Jim Knopf, D: Pippi Langstrumpf";
        Fragen[6][1][2] = "C";

        Fragen[7][0][0] = "Frage 8: Mit der Drake-Gleichung berechnet man die Wahrscheinlichkeit von ...?";
        Fragen[7][0][1] = "A: Vierlingsgeburten, B: Erdbeben, C: Lottogewinnen, D: außerirdischer Intelligenz";
        Fragen[7][0][2] = "D";

    }

    public void fragenzeigen(int f, int pl) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So the frage ist für " + spieler[pl].getName());
        System.out.println(Fragen[f][pl][0]);
        System.out.println(Fragen[f][pl][1]);
        jokernutz(f, pl);
        System.out.println("Bitte geben Sie Ihre Antwort ein:");
        String as = answer();
        if (as.equalsIgnoreCase(Fragen[f][pl][2])) {
            System.out.println("Correct ");
            spieler[pl].setGewinn(summe[fragenummer]);
            fragenummer++;
            System.out.println("Ihre Aktuelles Gewinn " + spieler[pl].getGewinn());

        } else {
            System.out.println("Wrong");

        }
    }

   public void jokernutz(int f, int pl) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Wollen Sie einen Joker nutzen.Antworten Sie bitte 'ja' , wenn ja oder 'nein' wenn nein");
        String a = sc.nextLine(); // Eingabe
        while (!a.equalsIgnoreCase("ja") && !a.equalsIgnoreCase("nein")) {
            System.out.println("Entscheiden sie nur mit 'ja' oder 'nein' wenn nein");
            a = sc.nextLine();
        }  // Solange Antwort nicht gültig ist, wird es gebeten, eine vernünftige antowrt zu geben.

       if (a.equalsIgnoreCase("ja")) { // zwei Strings miteinander zu vergleichen, ohne dabei auf die Groß- und Kleinschreibung zu achten
            if (spieler[pl].getJokers() != 0) { // Es wird zusätzlich überpruft , ober Spieler Joker uberhaupt hat
                System.out.println("Sie haben eine Möglichkeit den Joker zu verwenden.Joker ist ein einmaliges Hilfsmittel");
                spieler[pl].printverfugbarJokers(); // Verfügbare Joker für individuellen Spieler
                System.out.println("Geben sie eine Nummer der Joker an");
               int b=0;
               int c=0;
               int number;
                boolean Jokerverwendet = false;
                 do {
                    boolean isValid = false;
                    while (!isValid) {

                        if (sc.hasNextInt()) {
                            b = sc.nextInt();
                            isValid = true;
                        } else {
                            System.out.println("Fehler ist aufgetreten, geben sie gültige nummer an");
                            sc.next(); // очищаем некорректный ввод
                        }
                    }
                        switch (b) {
                            case 1:
                                if (spieler[pl].isJoker5050()) {
                                    System.out.println("1. 50/50 es werden 2 falsche Antworten entfernt");
                                    String alleantworte = Fragen[f][pl][1]; // Antwortmöglichkeiten
                                    String richtigeAntwort = Fragen[f][pl][2]; // richtigeantwort
                                    char ans = richtigeAntwort.charAt(0);
                                    String[] antworten = alleantworte.split(","); // Es lässt die String in der String array definieren, einzelne Elemente werden mit " , " limitiert
                                    ArrayList<String> answers = new ArrayList<>(Arrays.asList(antworten));
                                    ArrayList<String> incorrect = new ArrayList<>();
                                    for (String s : answers) {
                                        if (s.charAt(0) != ans) {
                                            incorrect.add(s);
                                        }
                                    }
                                    answers.removeAll(incorrect);
                                    int i = 0;
                                    while (i < 2) {
                                        incorrect.remove((int) (Math.random() * incorrect.size()));
                                        i++;
                                    }
                                    answers.addAll(incorrect);
                                    // Collections.shuffle(answers); Falsch
                                    System.out.println(answers);
                                    spieler[pl].setJoker5050(false);
                                   Jokerverwendet= true;


                                } else {
                                    System.out.println("Sie haben schon diesen Joker benutzt");
                                    continue;
                                }
                                break;
                            case 2:
                               if (spieler[pl].isJokertelefonverfugbar()) {
                                    List<String> expterte= spieler[pl].getExperten();
                                    String alleantworte = Fragen[f][pl][1]; // Antwortmöglichkeiten
                                    String richtigeAntwort = Fragen[f][pl][2]; // richtigeantwort
                                    char ans = richtigeAntwort.charAt(0);
                                    String[] antworten = alleantworte.split(","); // Es lässt die String in der String array definieren, einzelne Elemente werden mit " , " limitiert
                                    ArrayList<String> answers = new ArrayList<>(Arrays.asList(antworten));
                                    ArrayList<String> incorrect = new ArrayList<>(); // Einzelne Arraylist für falsche variante für weitere Operationen
                                    for (String s : answers) {
                                        if (s.charAt(0) != ans) { // Es wird streng geprüft, ob einzelne Variante nicht richtige ist, wenn es nicht richtig, wird es in List incorrect zugefugt
                                            incorrect.add(s);
                                        }
                                    }
                                    answers.removeAll(incorrect);
                                    System.out.println("Sie haben die Möglichkeiten drei Personen anzurufen,um einen Hinweis von der Person zu bekommen");
                                    sc.nextLine();
                                    System.out.println("Wählen sie einen Expert , den sich anrufen möchten");
                                    int i=1;
                                    for (String s: spieler[pl].getExperten()) {
                                        System.out.println(i + "." + s);
                                        i++;
                                    }
                                    System.out.println("Schreiben sie den Nummer der Person aus der Liste, die Sie anrufen möchten");

                                    while (true) { if (sc.hasNextInt()) {
                                        c = sc.nextInt();
                                        if (c >= 1 && c <= expterte.size()) {
                                            break;
                                        } else {
                                            System.out.println("Ungültige Nummer. Bitte wählen Sie eine Zahl zwischen 1 und " + expterte.size());
                                            sc.next(); // очищаем некорректный ввод
                                        }

                                    } else {
                                        System.out.println("Fehler: Bitte geben Sie eine ganze Zahl ein.");
                                        sc.next(); // Очищаем буфер ввода
                                    }
                                    }


                                    System.out.println("Sie rufen..." + expterte.get(c-1));
                                    System.out.println("Clicken sie Enter zum Weitergehen");
                                    sc.nextLine();
                                    System.out.println("Hallo" + expterte.get(c-1) + " Wie geht es dir?");
                                    sc.nextLine();
                                    System.out.println("Guten tag" + spieler[pl].getName() + " Gut, was ist bei dir?");
                                    sc.nextLine();
                                    System.out.println("Ich bin gerade auf der WerWirdMillionar Sendung und es gibt eine Frage, vielleicht kannst du mir dabei hilfen");
                                    sc.nextLine();
                                    System.out.println("Okay, worum geht es ?");
                                    sc.nextLine();
                                    System.out.println("So die Frage lautet ");
                                    sc.nextLine();
                                    System.out.println(Fragen[f][pl][0]);
                                    sc.nextLine();
                                    System.out.println("Und es gibt folgende Variante zum antworten");
                                    sc.nextLine();
                                    System.out.println(Fragen[f][pl][1]);
                                    sc.nextLine();
                                    System.out.println("Was denkst du daruber?");
                                    sc.nextLine();
                                    System.out.println("So ich weiß nicht 100 prozent was richtige ist, aber eine Variante kann ich schon ausschließen");
                                    System.out.println("Ich denke es bestimmt nicht " + incorrect.get((int)(Math.random()*incorrect.size()))  ); // Eine falsche Variante wird gezeigt
                                   double chance = Math.random()*1;
                                   if (chance > 0.7) {
                                       System.out.println("Ich vermute ,dass eine richtige antwort kann sein" + answers.get(0));
                                   } else if (chance == 0.5) {
                                       System.out.println("Ich bin nicht damit sicher, aber es kein sein" );
                                       answers.addAll(incorrect);
                                       System.out.println(answers.get((int)(Math.random()*answers.size())));
                                   }
                                   else {
                                       System.out.println("Also ich weiß nicht so gut, aber ich habe ein Gefühl");
                                       System.out.println(answers.get((int)(Math.random()*answers.size())));
                                   }


                                    // Add phone joker logic here
                                    spieler[pl].setJokertelefon(false); // Mark joker as used

                                    Jokerverwendet= true;
                                } else {
                                    System.out.println("Sie haben schon diesen Joker benutzt");
                                    continue;
                                }
                                break;


                            default:
                                System.out.println("Ungültige Jokerwahl.");
                                System.out.println("Geben sie die Nummer des Jokers ein, das sie benutzen möchten .BSP 1 oder 2 ");
                        }

           } while (!Jokerverwendet);

            } else {
                System.out.println("Keine Joker mehr verfügbar.");
            }
        }

    }
    public String answer() {
        Scanner sc = new Scanner(System.in);
        String as = sc.nextLine();
        return as;
    }

    public void spielstart() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 2; j++) {
                fragenzeigen(i, j);
            }
        }
    }


}


