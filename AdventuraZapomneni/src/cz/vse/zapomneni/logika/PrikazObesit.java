package cz.vse.zapomneni.logika;

public class PrikazObesit implements IPrikaz {
    private static final String NAZEV = "obesit";
    private HerniPlan herniPlan;
    private Hra hra;

    public PrikazObesit(HerniPlan herniPlan, Hra hra) {
        this.herniPlan = herniPlan;
        this.hra = hra;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev().equals("domov"))) {
            hra.setKonecHry(true);
            return "S pocitem bezcennosti si vzala postava lano ze skříně a hodila si jej přes lustr s pomocí židle.\nSebevražedný knot na krku a židle pod nohami bylo všechno co postava potřebovala.\nNohou odkopla postava židli a krk už visel pouze na laně - doufala, že proces bude rychlý, ale bezmocně jenom lapala po dechu zhruba 4 minuty. Nedostatek kyslíku dokáže změnit názor na sebevraždu každému, ale už bylo pozdě.\nPostavu po pár dnech našli kamarádi...";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev().equals("domov"))) {
            return "Prosím použijte příkaz bez parametrů, děkuji.";
        }
        return "Nemám se tu jak oběsit.";
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
