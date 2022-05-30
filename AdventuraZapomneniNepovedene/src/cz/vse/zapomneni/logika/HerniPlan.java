package cz.vse.zapomneni.logika;


/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova, Trong Dat Luu
 *@version    1.0
 */
public class HerniPlan {
    
    private Prostor aktualniProstor;
    
     /**
     *  Konstruktor který vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví halu.
     */
    public HerniPlan() {
        zalozProstoryHry();

    }
    /**
     *  Vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví domeček.
     */
    private void zalozProstoryHry() {
        // vytvářejí se jednotlivé prostory
        Prostor domov = new Prostor("domov","domov, ve kterém bydlí postava.\nV obývacím pokoji se nachází funkční pevná linka, přes kterou můžete zavolat svým rodičům a ve skříni máte lano.\nMůžete také jít ven na ulici se projít anebo se kouknout do kuchyně..");
        Prostor kuchyn = new Prostor("kuchyň", ", kde má postava prázdnou lednici a na kuchyňské lince nůž.\nTaké zde nacházíte poslední úspory.");

        Prostor ulice = new Prostor("ulice","ulice bytu kde postava bydlí.\nMáte možnost jít zpět domů, ke kamarádovi domů, na hlavní nádraží, do školy anebo na Václavské náměstí.");

        Prostor kamaraduvByt = new Prostor("kamarádův_byt","vchod do kamarádova bytu.\nNejste si jistí jestli Vás vůbec má kamarád rád a jestli Vás bere jako kamaráda. Můžete mu avšak ale stále zazvonit.");

        Prostor hlavniNadrazi = new Prostor("hlavní_nádraží","hlavní nádraží s vlaky a turisty");
        Prostor koleje = new Prostor("koleje","koleje na hlavním nádraží");

        Prostor skola = new Prostor("škola","vysoká škola kam chodí postava");
        Prostor strechaSkoly = new Prostor("střecha_školy","střecha vysoké školy");
        Prostor psycholog = new Prostor("psycholog","psycholog ve škole");

        Prostor vaclavskeNamesti = new Prostor("václavské_náměstí","václavské náměstí plné lidí");
        Prostor drogovyDealer = new Prostor("drogový_dealer","dočasný ráj pro postavu");
        Prostor karluvMost = new Prostor("karlův_most","karlův most s lidmi kolem");

        Vec nuz = new Vec("nůž", false,true);
        Vec penize =  new Vec("peníze", true, true);
        Vec pevnaLinka = new Vec("pevná_linka", false, true);
        Vec lano = new Vec("lano", false, true);
        Vec zvonek = new Vec("zvonek", false, true);

        // přiřazují se průchody mezi prostory (sousedící prostory)
        domov.setVychod(kuchyn);
        domov.setVychod(ulice);
        kuchyn.setVychod(domov);
        ulice.setVychod(domov);
        ulice.setVychod(kamaraduvByt);
        ulice.setVychod(vaclavskeNamesti);
        ulice.setVychod(hlavniNadrazi);
        ulice.setVychod(skola);
        hlavniNadrazi.setVychod(koleje);
        hlavniNadrazi.setVychod(ulice);
        koleje.setVychod(hlavniNadrazi);
        kamaraduvByt.setVychod(ulice);
        vaclavskeNamesti.setVychod(ulice);
        vaclavskeNamesti.setVychod(drogovyDealer);
        vaclavskeNamesti.setVychod(karluvMost);
        skola.setVychod(psycholog);
        skola.setVychod(strechaSkoly);
        skola.setVychod(ulice);


        // přiřazuju věci k prostorům

        kuchyn.setVec(nuz);
        kuchyn.setVec(penize);
        domov.setVec(pevnaLinka);
        domov.setVec(lano);
        kamaraduvByt.setVec(zvonek);


        aktualniProstor = domov;  // hra začíná v domečku
    }
    
    /**
     *  Metoda vrací odkaz na aktuální prostor, ve ktetém se hráč právě nachází.
     *
     *@return     aktuální prostor
     */
    
    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }
    
    /**
     *  Metoda nastaví aktuální prostor, používá se nejčastěji při přechodu mezi prostory
     *
     *@param  prostor nový aktuální prostor
     */
    public void setAktualniProstor(Prostor prostor) {
       aktualniProstor = prostor;
    }

}
