package cz.vse.zapomneni.logika;

public class PrikazKoupit implements IPrikaz{

    private static final String NAZEV = "koupit";
    private HerniPlan herniPlan;
    private Inventar inventar;
    private Hra hra;

    public PrikazKoupit(HerniPlan herniPlan, Inventar inventar, Hra hra) {
        this.herniPlan = herniPlan;
        this.inventar = inventar;
        this.hra = hra;
    }


    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "drogový_dealer") && (inventar.obsahujeVInventari("peníze"))) {
            hra.setKonecHry(true);
            return "Koupil sis drogy ze svých posledních úspor.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev() == "drogový_dealer") && inventar.obsahujeVInventari("peníze")) {
            return "Prosím použijte příkaz bez parametrů, děkuji.";
        }
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "drogový_dealer") && !(inventar.obsahujeVInventari("peníze"))) {
            return "Postava nemá peníze, aby si mohla koupit drogy.";
        }
        return "Nejsi u drogového dealera.";
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
