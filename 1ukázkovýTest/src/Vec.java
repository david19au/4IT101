
/*******************************************************************************
 * Instance třídy Vec představují věci v místnostech. Některé z nich lze sebrat,
 * jiné ne.
 *
 * @author Luboš Pavlíček
 * @version 23. 11. 2011
 */
public class Vec {
    //== Datové atributy (statické i instancí)======================================
    private String nazev;  // název/jméno věci
    private boolean sebratelna; // zda lze věc sebrat z místnosti

    /***************************************************************************
     *  Pomocí konstruktoru se vytváří instance popisující věc.
     *  @param  nazev       název (jméno) věci
     *  @param  sebratelna  zda lze věc z místnosti sebrat,
     */
    public Vec(String nazev, boolean sebratelna) {
        this.nazev = nazev;
        this.sebratelna = sebratelna;
    }

    /**
     * metoda vrací název věci
     *
     * @return název věci
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * metoda vrátí true, pokud lze věc v místnosti sebrat
     *
     * @return true, pokud lze věc sebrat
     */
    public boolean isSebratelna() {
        return sebratelna;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vec) {
            Vec druha = (Vec) o;
            return nazev.equals(druha.nazev);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return nazev.hashCode();
    }

}

