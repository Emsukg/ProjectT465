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

	        Fragen[5][0][0] = "Frage 6: Etwas Geheimes erfahren, etwas herausfinden – oder auch: etwas ...?";
	        Fragen[5][0][1] = "A: spitzkriegen B: pudelbekommen C: mopsgewinnen D: dackelerhalten ";
	        Fragen[5][0][2] = "A";

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
	        
	        Fragen[7][1][0] = "Frage 8: An wessen Ende steht buchstäblich ein Ostdeutscher aus dem zehntgrößten Bundesland?";
	        Fragen[7][1][1] = "A: Transitstrecke B: Reiseroute C: Verkehrsachse D: Fernstraße";
	        Fragen[7][1][2] = "C";
	        
	        Fragen[8][0][0] = "Frage 9: Wir brauchen jetzt eine Antwort auf die Frage – auch wenn es widersprüchlich klingt, sollten Sie sich ...?";
	        Fragen[8][0][1] = "A: schleppend ranhalten B: gemütlich sputen C: langsam beeilen D: bedächtig abhetzen";
	        Fragen[8][0][2] = "C";
	        
	        Fragen[8][1][0] = "Frage 9: Weil sie britische Banknoten zieren, sind Persönlichkeiten wie Winston Churchill oder Alan Turing sozusagen echte ...?";
	        Fragen[8][1][1] = "A: Kumpel B: Pfundskerle C: Haudegen D: Tausendsassas";
	        Fragen[8][1][2] = "B";
	        
	        Fragen[9][0][0] = "Frage 10: Womit sind viele Babys direkt nach der Geburt überzogen?";
	        Fragen[9][0][1] = "A: Buttersoße B: Wurstpelle C: Sahnecreme D: Käseschmiere";
	        Fragen[9][0][2] = "D";
	        
	        Fragen[9][1][0] = "Frage 10: Was dient zur Fortbewegung eines Kanus?";
	        Fragen[9][1][1] = "A: Spießpaddel B: Stechpaddel C: Pikspaddel D: Zwickpaddel";
	        Fragen[9][1][2] = "B";
	        
	        Fragen[10][0][0] = "Frage 11: Wer wird bei der US-Wahl im November 2024 an der Seite von Kamala Harris für das Amt des Vizepräsidenten kandidieren?";
	        Fragen[10][0][1] = "A: Steve Tang B: Tim Walz C: Bill RumbD: Pete Ch-ch-ch";
	        Fragen[10][0][2] = "B";
	        
	        Fragen[10][1][0] = "Frage 11: Durch das sogenannte Abseihen gelangt häufig ...?";
	        Fragen[10][1][1] = "A: ein Cocktail ins Glas B: Saharastaub nach Europa C: Fett auf die Grillkohle D: Schmelzwasser ins Tal";
	        Fragen[10][1][2] = "A";
	        
	        Fragen[11][0][0] = "Frage 12: Der Gakpo ...?";
	        Fragen[11][0][1] = "A: legt Eier B: wird auf dem Kopf getragen C: ist EM-Torschützenkönig D: liegt in den Pyrenäen";
	        Fragen[11][0][2] = "C";
	        
	        Fragen[11][1][0] = "Frage 12: Was hat hierzulande eine Gesamtzahl von rund 440, wovon etwa 90 % ein und demselben Unternehmen gehören?";
	        Fragen[11][1][1] = "A: Freizeitparks B: Autobahnraststätten C: Wolkenkratzer D: Volkshochschulen";
	        Fragen[11][1][2] = "B";
	        
	        Fragen[12][0][0] = "Frage 13: Wie heißt Billie Eilishs Werk, mit dem sie im Mai 2024 von 0 auf 1 in die deutschen Album-Charts einstieg?";
	        Fragen[12][0][1] = "A: Love Me Now Or Never B: Hit Me Hard And Soft C: Find Me Alive And Kicking D: Follow Me On TikTok Or X";
	        Fragen[12][0][2] = "B";
	        
	        Fragen[12][1][0] = "Frage 13: Welches Tier gehört zur Ordnung der Paarhufer?";
	        Fragen[12][1][1] = "A: Hausesel B: Steppenzebra C: Bergtapir D: Flusspferd";
	        Fragen[12][1][2] = "D";
	        
	        Fragen[13][0][0] = "Frage 14: Wer war von 2014 bis 2018 die bisher einzige Frau auf dem Posten des deutschen Botschafters beim Heiligen Stuhl?";
	        Fragen[13][0][1] = "A: Annette Schavan B: Rita Süssmuth C: Margot Käßmann D: Gloria von Thurn und Taxis";
	        Fragen[13][0][2] = "A";	        	        
	        
	        Fragen[14][1][0] = "Frage 14: „Rider-Waite“, „Crowley“ und „Marseille“ sind die bekanntesten Varianten von ...?";
	        Fragen[14][1][1] = "A: Diamantschliffen  B: Sektgläsern C: Tarotkarten D: Schuhschnürungen";
	        Fragen[14][1][2] = "C";

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
                            sc.next(); //Ungültige Eingabe löschen
                        }
                    }
                    sc.nextLine();
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
                                    System.out.println("Telefonjoker wird verwendet.");
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

                                  case 3:
	                            	if(spieler[pl].isJokerAudienceHelpAvailable()){
	                            		System.out.println("Publikumjoker wird verwendet.");
	                            		spieler[pl].setJokerpublikumHelp(false);
	                            		Jokerverwendet=true;
	                            	}else {
	                            		 System.out.println("Sie haben schon diesen Joker benutzt");
		                                    continue;
		                                }
		                                break;
		                            
	                            case 4:
	                            	if(spieler[pl].isJokerExtraHelpAvailable()) {
	                            		System.out.println("Zusatzjoker wird verwendet.");
	                            		spieler[pl].setJokerzusatz(false);
	                            		Jokerverwendet=true;
	                            	}else {
	                            		 System.out.println("Sie haben schon diesen Joker benutzt");
		                                    continue;
		                                }
		                                break;
	                            	
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


