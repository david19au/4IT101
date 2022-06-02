package cz.vse.zapomneni.logika;

public class PrikazZavolat implements IPrikaz {

    private static final String NAZEV = "zavolat";
    private HerniPlan herniPlan;

    public PrikazZavolat(HerniPlan herniPlan) {
        this.herniPlan = herniPlan;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev().equals("domov"))) {
            return "Postava zavolala svým rodičům a nebyla to příjemná povídaná.\nRodiče nezajímaly problémy postavy a vinu shazovaly na postavu, že si neumí správně zařídit čas.\nPostava se nyní cítí ještě více bezcenná, než předtím.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev().equals("domov"))) {
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
