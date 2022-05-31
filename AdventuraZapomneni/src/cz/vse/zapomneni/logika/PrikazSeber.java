package cz.vse.zapomneni.logika;

public class PrikazSeber implements IPrikaz {

    private static final String NAZEV = "seber";
    private HerniPlan herniPlan;
    private Inventar inventar;

    public PrikazSeber(HerniPlan herniPlan, Inventar inventar) {
        this.herniPlan = herniPlan;
        this.inventar = inventar;
    }


    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry.length == 0) {
            return "Nevím co mám sebrat. Specifikujte věc k sebrání.";
        } else if (parametry.length > 1) {
            return "Dokážu sebrat pouze jednu věc najednou.";
        }
        String jmenoVeciCoSeMaSebrat = parametry[0];
        Vec vecCoSeMaSebrat = herniPlan.getAktualniProstor().odeberVec(jmenoVeciCoSeMaSebrat);
        if (vecCoSeMaSebrat == null) {
            return "Tohle tu není.";
        }
        if (!(vecCoSeMaSebrat.isSebratelna())) {
            herniPlan.getAktualniProstor().pridejVec(vecCoSeMaSebrat);
            return "Tuhle věc nemůžeš sebrat.";
        } else if (vecCoSeMaSebrat.isSebratelna() && !(inventar.dostMista())) {
            herniPlan.getAktualniProstor().pridejVec(vecCoSeMaSebrat);
            return "Tohle už neponeseš, nemáš místo kam věc dát.";
        } else {
            inventar.vlozeniVeciDoInv(vecCoSeMaSebrat);
            return "Sebral jsi " + jmenoVeciCoSeMaSebrat + ".";
        }
    }

    @Override
    public String getNazev() {
        return NAZEV;
    }
}
