public class Log {
    private int den;
    private int mesic;
    private int rok;
    private int hodiny;
    private int minuty;
    private String adresa;
    private String operace;

    public Log(int den, int mesic, int rok, int hodiny, int minuty, String adresa, String operace) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
        this.hodiny = hodiny;
        this.minuty = minuty;
        this.adresa = adresa;
        this.operace = operace;
}

    public boolean JeMeziHodinama (int dolniLimit, int horniLimit) {
        return ((dolniLimit * 60) <= (hodiny * 60 + minuty) && (horniLimit * 60) >= (hodiny * 60 + minuty)); // *60 cuz z hodin počítám minuty
    }

    public boolean JeOperace (String nazevOperace) {
        return operace.equals(nazevOperace);
    }

    @Override
    public String toString() {
        return den + " " + mesic + " " + rok + " " + hodiny + " " + minuty + " " + adresa + " " + operace;
    }
}

