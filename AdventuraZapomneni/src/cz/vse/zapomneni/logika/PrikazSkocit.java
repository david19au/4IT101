package cz.vse.zapomneni.logika;
/**
 * Class PrikazSkocit implementuje do hry příkaz 'skocit'.
 * Postava se pomocí tohoto příkazu může zabít skokem z Karlova mostu.
 *
 * @author Trong Dat Luu
 * @version LS 2021/22
 */
public class PrikazSkocit implements IPrikaz {

    private static final String NAZEV = "skocit";

    private HerniPlan herniPlan;
    private Hra hra;

    /**
     * Konstruktor pro příkaz 'skocit'.
     *
     * @param herniPlan herní plán kde se postava nachází a může se v ní pohybovat
     * @param hra instance aktuální hry
     */
    public PrikazSkocit(HerniPlan herniPlan, Hra hra) {
        this.herniPlan = herniPlan;
        this.hra = hra;
    }

    /**
     * Metoda provádí příkaz 'skocit'.
     * Ujistí se, pokud se postava nachází v prostoru 'karluv_most' a že nebyl zadán žádný extra parametr.
     * Pokud ano, postava skočí z mostu, zabije se a ukončí hru.
     * Pokud ne, napíše zprávu, že postava nemá odkud skočit.
     *
     * @param parametry kontroluje zda nebyl zadán extra parametr
     * @return vrací výsledek příkazu
     */
    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev().equals("karluv_most"))) {
            hra.setKonecHry(true);
            return "S hlubokým nádechem se postava zvedla na okraj Karlova mostu.\nNejdříve si jenom sedla a koukala na velkolepou Vltavu, poté ale zavřela oči a volným pádem skočila ze zábradlí mostu do Vltavy.\nKolemjdoucí šokovaní z toho co se stalo se přihrnuli k místě skoku a marně hledají kam postava skočila.\nZavolali pomoc a v mžiku se hledalo tělo, ale bylo už moc pozdě - ani po nalezení záchranáři nedokázali oživit postavu.";
        } else if (parametry.length >= 1) {
            return "Není třeba specifikovat jak skočit, skok je skok. Použijte příkaz bez parametrů, děkuji.";
        } else if (herniPlan.getAktualniProstor().getNazev().equals("strecha_skoly")) { //TODO
            hra.setKonecHry(true);
            return "Skočil jsi ze střechy.";
        } else if (herniPlan.getAktualniProstor().getNazev().equals("koleje")) { //TODO
            hra.setKonecHry(true);
            return "Skočil jsi do kolejí.";
        } else{
        return "Nemám kde skočit odsud.";
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
