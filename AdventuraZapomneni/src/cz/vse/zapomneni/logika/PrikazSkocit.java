package cz.vse.zapomneni.logika;

public class PrikazSkocit implements IPrikaz{

    private static final String NAZEV = "skočit";

    private HerniPlan herniPlan;
    private Hra hra;

    public PrikazSkocit(HerniPlan herniPlan, Hra hra) {
        this.herniPlan = herniPlan;
        this.hra = hra;
    }


    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "karlův_most")) {
            hra.setKonecHry(true);
            return "Postava skočila z mostu.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev() == "karlův_most")) {
            return "Není třeba specifikovat jak skočit, skok je skok. Použijte příkaz bez parametrů, děkuji.";
        }
        return "Nemám kde skočit odsud.";
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
