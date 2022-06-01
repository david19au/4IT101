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
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "drogovy_dealer") && (inventar.obsahujeVInventari("penize"))) {
            hra.setKonecHry(true);
            return "Postava si koupila drogy ze svých posledních úspor.\nDealer dal postavě opiody, které byly přimíchané fentanylem, o kterých nikdo nevěděl.\nPostava si vzala drogy a zanedlouho se jí udělalo špatně a chtělo se jí spát.\nNečekala ale, že tohle bude již věčný spánek, protože se jí zpomaloval tep a i dýchání.\nEfekty předávkování fentanylem jsou velmi rychlé a nikdo nestihl postavě pomoct.\nBrzy leží postava bezvládně na zemi, mrtvá, předávkovaná fentanylem.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev() == "drogovy_dealer") && inventar.obsahujeVInventari("penize")) {
            return "Prosím použijte příkaz bez parametrů, děkuji.";
        }
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "drogovy_dealer") && !(inventar.obsahujeVInventari("penize"))) {
            return "Postava nemá peníze, aby si mohla koupit drogy.";
        }
        return "Postava není u drogového dealera.";
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
