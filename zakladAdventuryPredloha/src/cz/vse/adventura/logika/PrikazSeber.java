package cz.vse.adventura.logika;

public class PrikazSeber implements IPrikaz{

    private static final String NAZEV = "seber"; // PŘÍKAZ JE CASE SENSITIVE S VĚCMA

    private HerniPlan herniPlan;

    public PrikazSeber(HerniPlan herniPlan) {
        this.herniPlan = herniPlan;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0) {
            return "Nenapsal jsi co mám sebrat.";
        } else if (parametry.length > 2) {
            return "Mohu sebrat pouze jednu věc.";
        }

        String nazevVeci = parametry[0];

        Vec vec = herniPlan.getAktualniProstor().vratVec(nazevVeci);

        if (vec == null) {
            return "Vec s nazvem " + nazevVeci + " se v prostoru nenachází.";
        } else if (!vec.isPrenositelna()) {
            return "Tuhle věc nevezmeš.";
        }

        herniPlan.getAktualniProstor().odebratVec(nazevVeci);
        //TODO vložit věc do inventáře

        return "Sebral jsi věc " + nazevVeci + " .";
    }



    @Override
    public String getNazev() {
        return NAZEV;
    }
}
