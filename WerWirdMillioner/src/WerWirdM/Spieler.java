package WerWirdM;

public class Spieler {
    private final String name; // предотвращает прямое изменение данных извне класса
    // и позволяет контролировать процесс изменения значений через методы.
    private int jokers;
    int gewinn;
    int currentquest;
private int [] festgewinn;
    private boolean joker5050;
    private boolean jokertelefon;
    private boolean jokerpublikum;
    private boolean jokerzusatz;

    public Spieler(String name) {
        this.name = name;
        this.joker5050 = false; // Am Anfang ist nicht verfügbar
        this.jokertelefon = false; // Am Anfang ist nicht verfügba
        this.jokerpublikum = false;// Bevor der Spieler die variante wählt, alle Jokern sind nicht verfügbar
        this.jokerzusatz = false;
    }

    public String getName() {
        return name;
    }
    public int getJokers() {
        return jokers;
    }

    public void setJokers(int jokers) {
        this.jokers = jokers;
    }

    public int [] getFestgewinn() {
        return festgewinn;
    }

    public void setFestgewinn(int[] festgewinn) {
        this.festgewinn = festgewinn;
    }

    public int getGewinn() {
        return gewinn;
    }

    public void setGewinn(int gewinn) {
        this.gewinn = gewinn;
    }

    public boolean isJoker5050() {
        return joker5050;
    }

    public void setJoker5050(boolean joker5050) {
        this.joker5050 = joker5050;
    }

    public boolean isJokerCallFriend() {
        return jokertelefon;
    }

    public void setJokertelefon(boolean jokerCallFriend) {
        this.jokertelefon = jokerCallFriend;
    }

    public boolean isJokerpublikum() {
        return jokerpublikum;
    }

    public void setJokerpublikumHelp(boolean jokerAudienceHelp) {
        this.jokerpublikum = jokerAudienceHelp;
    }

    public boolean isJokerzusatz() {
        return jokerzusatz;
    }

    public void setJokerzusatz(boolean jokerzusatz) {
        this.jokerzusatz = jokerzusatz;
    }

    public void enableJoker5050()
    { joker5050 = true;

    }

    public void enableJokerCallFriend() {
        jokertelefon = true;
    }

    public void enableJokerAudienceHelp() {
        jokerpublikum = true;
    }

    public void enablejokerzusatz() {
        jokerzusatz = true;
    }
    public void printverfugbarJokers() {
        System.out.println("Es gibt folgende Joker bei ihnen");
        if (joker5050) {
            System.out.println("1. 50/50 es werden 2 falsche Antworten entfernt");
        }
        if (jokertelefon) {
            System.out.println("2. Telefonjoker");
        }
        if (jokerpublikum) {
            System.out.println("3. Publikumsjoker");
        }
        if (jokerzusatz) {
            System.out.println("4. Zusatzjoker");
        }
        if (!joker5050 && !jokertelefon && !jokerpublikum && !jokerzusatz) {
            System.out.println("Sie haben keine Joker mehr.");
        }
    }

    public boolean isJokertelefonverfugbar() {
        return jokertelefon;
    }

    public void useJokerCallFriend() {
        jokertelefon = false;
    }

    public boolean isJokerAudienceHelpAvailable() {
        return jokerpublikum;
    }

    public void useJokerAudienceHelp() {
        jokerpublikum = false;
    }

    public boolean isJokerExtraHelpAvailable() {
        return jokerzusatz;
    }
    // Add methods for Spieler1 if needed
}

