package cz.vse.zapomneni.logika;

public class PrikazSkocit implements IPrikaz{

    private static final String NAZEV = "skocit";

    private HerniPlan herniPlan;
    private Hra hra;

    public PrikazSkocit(HerniPlan herniPlan, Hra hra) {
        this.herniPlan = herniPlan;
        this.hra = hra;
    }


    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0 && (herniPlan.getAktualniProstor().getNazev() == "karluv_most")) {
            hra.setKonecHry(true);
            return "S hlubokým nádechem se postava zvedla na okraj Karlova mostu.\nNejdříve si jenom sedla a koukala na velkolepou Vltavu, poté ale zavřela oči a volným pádem skočila ze zábradlí mostu do Vltavy.\nKolemjdoucí šokovaní z toho co se stalo se přihrnuli k místě skoku a marně hledají kam postava skočila.\nZavolali pomoc a v mžiku se hledalo tělo, ale bylo už moc pozdě - ani po nalezení záchranáři nedokázali oživit postavu.";
        } else if (parametry.length == 1 && (herniPlan.getAktualniProstor().getNazev() == "karluv_most")) {
            return "Není třeba specifikovat jak skočit, skok je skok. Použijte příkaz bez parametrů, děkuji.";
        }
        return "Nemám kde skočit odsud.";
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
