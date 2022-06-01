package cz.vse.zapomneni.logika;

public class PrikazBodnout implements IPrikaz{

    private static final String NAZEV = "bodnout";
    private HerniPlan herniPlan;
    private Inventar inventar;
    private Hra hra;

    public PrikazBodnout(HerniPlan herniPlan, Inventar inventar, Hra hra) {
        this.herniPlan = herniPlan;
        this.inventar = inventar;
        this.hra = hra;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (inventar.obsahujeVInventari("nuz"))) {
            hra.setKonecHry(true);
            return "Postava zdráhavě vezme nůž do ruky a otočí jej hrotem k sobě.\nS hlubokými nádechy a výdechy, spolu se zavřenýma očima zabodne kuchyňský nůž do břicha. Okamžitě po bodnutí pocítí šílenou bolest a lituje svého rozhodnutí.\nBolest je ale tak silná, že postava se nedokáže proplazit k pevné lince aby zavolala pomoc, zároveň je natolik slabá, aby dokázala zařvat o pomoc.\nNěkolik minut uplyne a postupně postava omdlívá.\nPostavu po pár dnech našli kamarádi spolu s policií a rodiči...";
        } else if (parametry.length == 1 && inventar.obsahujeVInventari("nuz")) {
            return "Bodnout se dá mnoha způsoby, ale udělejme to jednoduše - použijte prosím jeden parametr.";
        }
/*        if (parametry.length == 0 && !(inventar.obsahujeVInventari("penize"))) {
            return "Postava nemá peníze, aby si mohla koupit drogy.";
        }*/
        return "Postava se nemá čím nebo jak bodnout.";
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
