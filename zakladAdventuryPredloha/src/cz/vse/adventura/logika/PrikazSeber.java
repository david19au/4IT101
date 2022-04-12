package cz.vse.adventura.logika;

public class PrikazSeber implements IPrikaz{

    private static final String NAZEV = "seber";

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0) {
            return "Nenapsal jsi co mám sebrat.";
        } else if (parametry.length > 2) {
            return "Mohu sebrat pouze jednu věc.";
        }

        return null;
    }



    @Override
    public String getNazev() {
        return NAZEV;
    }
}
