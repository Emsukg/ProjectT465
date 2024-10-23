package WerWirdM;

public class Spieler {
    private final String name; // предотвращает прямое изменение данных извне класса
    // и позволяет контролировать процесс изменения значений через методы.
    private int jokers;
    int gewinn;
 
private int [] festgewinn;
    private boolean joker5050;
    private boolean jokertelefon;
    private boolean jokerpublikum;
    private boolean jokerzusatz;
    private boolean erstevariante; // erste Spielvariante
    private boolean zweitevariante; // zweite Spielvariante
    private List<String> experten = new ArrayList<>(); // Spielers individuelle Experte
    private boolean positiveende; // Ende indikator , dies ist eine positive Ende
    private boolean negativeende;
    private boolean activspiel;


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

    

    public boolean isJokerAudienceHelpAvailable() {
        return jokerpublikum;
    }

    public void useJokerAudienceHelp() {
        jokerpublikum = false;
    }

    public boolean isJokerExtraHelpAvailable() {
        return jokerzusatz;
    
     public void addExperten (String experte) {
        experten.add(experte);
    }

    public List<String> getExperten() {
        return experten;
    }

    public void setExperten(List<String> experten) {
        this.experten = experten;
    }

     public void setEnde(boolean ende) {
        this.ende = ende;
    }

    public boolean getEnde() {
        return ende;
    }


        public boolean isActivspiel() {
        return activspiel;
    }

    public void setActivspiel(boolean activspiel) {
        this.activspiel = activspiel;
    }

      public boolean istNegativeende() {
        return negativeende;
    }

    public void setNegativeende(boolean negativeende) {
        this.negativeende = negativeende;
    }

    public boolean istErstevariante() {
        return erstevariante;
    }

    public void setErstevariante(boolean erstevariante) {
        this.erstevariante = erstevariante;
    }

    public boolean istZweitevariante() {
        return zweitevariante;
    }

    public void setZweitevariante(boolean zweitevariante) {
        this.zweitevariante = zweitevariante;
    }
    // Add methods for Spieler1 if needed
}

