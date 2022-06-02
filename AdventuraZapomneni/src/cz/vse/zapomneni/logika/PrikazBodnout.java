package cz.vse.zapomneni.logika;

/**
 * Class PrikazBodnout implementuje příkaz 'bodnout'.
 * Pomocí tohoto příkazu se postava může zabít bodnutím nože do těla.
 *
 * @author Trong Dat Luu
 * @version LS 2021/22
 */
public class PrikazBodnout implements IPrikaz {

    private static final String NAZEV = "bodnout";
    private Inventar inventar;
    private Hra hra;


    /**
     * Konstruktor pro příkaz 'bodnout'.
     *
     * @param inventar inventář postavy/hráče
     * @param hra instance aktuální hry
     */
    public PrikazBodnout(Inventar inventar, Hra hra) {
        this.inventar = inventar;
        this.hra = hra;
    }

    /**
     * Metoda která provádí přikaz 'bodnout'.
     * Kontroluje, zda má postava nůž v inventáři, pokud ne, neumožní postavě se zabít.
     * @param parametry kontroluje zda hráč nenapsal žádný extra parametr.
     * @return vrací text s odpovědí na určitou činnost.
     */
    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (inventar.obsahujeVInventari("nuz"))) {
            hra.setKonecHry(true);
            return "Postava zdráhavě vezme nůž do ruky a otočí jej hrotem k sobě.\nS hlubokými nádechy a výdechy, spolu se zavřenýma očima zabodne kuchyňský nůž do břicha. Okamžitě po bodnutí pocítí šílenou bolest a lituje svého rozhodnutí.\nBolest je ale tak silná, že postava se nedokáže proplazit k pevné lince aby zavolala pomoc, zároveň je natolik slabá, aby dokázala zařvat o pomoc.\nNěkolik minut uplyne a postupně postava omdlívá.\nPostavu po pár dnech našli kamarádi spolu s policií a rodiči...";
        } else if (parametry.length >= 1 && inventar.obsahujeVInventari("nuz")) {
            return "Bodnout se dá mnoha způsoby, ale udělejme to jednoduše - použijte prosím jeden parametr.";
        } else{
        return "Postava se nemá čím nebo jak bodnout.";
        }
    }

    /**
     * Metoda vrací název příkazu.
     *
     * @return vrátí název příkazu.
     */
    @Override
    public String getNazev() {
        return NAZEV;
    }
}
