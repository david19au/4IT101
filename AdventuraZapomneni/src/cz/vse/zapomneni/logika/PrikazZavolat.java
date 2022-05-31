package cz.vse.zapomneni.logika;

public class PrikazZavolat implements IPrikaz {

    private static final String NAZEV = "zavolat";
    private HerniPlan herniPlan;

    public PrikazZavolat(HerniPlan herniPlan) {
        this.herniPlan = herniPlan;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "domov")) {
            return "Zavolal jsem rodičům.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev() == "domov")) {
            return "Prosím použijte příkaz bez parametrů, děkuji.";
        }
        return "Nemohu zde volat.";
    }
//TODO přidat správný text
    @Override
    public String getNazev() {
        return NAZEV;
    }
}
