package cz.vse.zapomneni.logika;

public class PrikazZazvonit implements IPrikaz {

    private static final String NAZEV = "zazvonit";
    private HerniPlan herniPlan;
    private Hra hra;

    public PrikazZazvonit(HerniPlan herniPlan, Hra hra) {
        this.herniPlan = herniPlan;
        this.hra = hra;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev().equals("kamaraduv_byt"))) {
            hra.setKonecHry(true);
            return "Po zazvonění na byt kamaráda se zeptá postava jestli může za ním do bytu, jestli by si nemohli promluvit.\nKamarád řekne postavě, že určitě a popovídají si.\nPostava říká všechny její problémy a její kamarád se ji snaží vyslechnout a pomoct.\nKamarád postavy pevně sevře postavu do náručí, s tím, že jí má rádo a zároveň také zmiňuje, že je spousta dalších lidí co má postavu také rádo.\nSpolečně kouknou na resty co má postava na sobě a pomůže ji.\nPostava je v mírném šoku, ale získala zpět trošku sebevědomí a vrací se domů s tím, že má lidi kolem sebe a že budou lepší dny.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev().equals("kamaraduv_byt"))) {
            return "Prosím použijte příkaz bez parametrů, děkuji.";
        }
        return "Postava nemá kde zazvonit.";
    }


    @Override
    public String getNazev() {
        return NAZEV;
    }
}
