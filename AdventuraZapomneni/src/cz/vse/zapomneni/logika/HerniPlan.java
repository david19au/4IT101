package cz.vse.zapomneni.logika;


/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2016/2017
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
        Prostor kuchyn = new Prostor("kuchyň", "kuchyň, kde má postava prázdnou lednici a na kuchyňské lince nůž.\nTaké zde nacházíte poslední úspory");

        Prostor ulice = new Prostor("ulice","ulice bytu kde postava bydlí.\nMáte možnost jít zpět domů, ke kamarádovi domů, na hlavní nádraží, do školy anebo na Václavské náměstí..");

        Prostor kamaraduvByt = new Prostor("kamarádův_byt","vchod do kamarádova bytu.\nNejste si jistí jestli Vás vůbec má kamarád rád a jestli Vás bere jako kamaráda. Můžete se ale pokusit se promluvit s kamarádem.");

        Prostor hlavniNadrazi = new Prostor("hlavní_nádraží","hlavní nádraží s vlaky a turisty.\nNemáte dostatek peněz a ani náladu někam odcestovat, avšak stále Vás mrzí, že ostatní si to mohou dovolit.\nMůžete jim ukázat, jaké to je, nemoct odcestovat ale..");
        Prostor koleje = new Prostor("koleje","koleje na hlavním nádraží.\nPodle tabulky příjezdů jste si našli, že nejbližší příjezd pokračujícího vlaku je na nástupišti 2.\nPřicházíte na koleje a těsně před příjezdem vlaku skáčete pod koleje, kde už není kudy úniku a ani záchrany - vlak totiž nedokáže tak rychle zabrzdit.\nKrev je všude po čelním skle vlaku a většina nádraží je paralyzována.\nVšude po zprávách se šíří zpráva o sebevraždě na hlavním nádraží a celá událost rozkmitá řadu smutečných reakcí od rodiny i od přátel, kterých měla postava více, jak si myslela.\nV tomto sezení pro Vás hra skončila. Ukončete hru použitím příkazu 'konec'");

        Prostor skola = new Prostor("škola","vysoká škola kam chodí postava.\nPostava ví, že škola nabízí zdarma psychologickou pomoc, která mu může pomoct s momentální situací.\nNa druhou stranu ale nikdy u takové pomoci nebyl a bojí se, že na tom bude ještě hůř jak dříve a lidi kolem se mu budou navíc ještě vysmívat, že se s tím nedokáže vypořádat sám.\nVí také ale, že vstup na střechu není monitorovaný a může z ní skočit..");
        Prostor strechaSkoly = new Prostor("střecha_školy","střechy vysoké školy.\nPomalu se postava připlíží ke hraně střechy a kouká směrem dolů na ulici. Postavě se motá hlava, nedokáže udržet rovnováhu a padá střemhlav na zem.\nBezvládně dopadne na chodník a krvácí, kolemjdoucí se postavě snaží pomoct ale ani po příjezdu sanitky už nebylo jak pomoci...\nVšude po zprávách se šíří zpráva o sebevraždě vysokoškolského studenta a celá událost rozkmitá řadu smutečných reakcí od rodiny i od přátel, kterých měl víc, jak si myslel.\nV tomto sezení pro Vás hra skončila. Ukončete hru použitím příkazu 'konec'");
        Prostor psycholog = new Prostor("psycholog","čekárny u školního psychologa. Po nějaké chvilce si postavu vyzvedne a vyslechne psycholog, kde postava mu říká všechny svoje problémy.\nPsycholog postavu uklidní a navede ho aspoň částečně na jiné myšlenky jak chuť spáchat sebevraždu a pocit bezcennosti.\nDomluví se na pravidelných schůzkách, a že postava není jediná, kde se takhle pociťuje a není to nic špatného, se občas takhle cítit a mít potřebu si o tom promluvit s někým.\nPomůže postavě dále si napsat seznam věcí, které musí udělat, kde se ukázalo, že se to dá všechno zvládnout.\nTouto cestou se postavě nic nestane a vrátí se domů s klidnější hlavou.\nUkončete hru použitím příkazu 'konec'");

        Prostor vaclavskeNamesti = new Prostor("václavské_náměstí","Václavské náměstí, kde se pohybuje tuna turistů.\nRozhoduje se, zda by procházka dále mohla pomoct se uklidnit, či jestli by nebylo rychlejší navštívit drogového dealera, který postavě umožní se na chvíli vypnout.");
        Prostor drogovyDealer = new Prostor("drogový_dealer","u drogového dealera, kde si postava může koupit dočasný ráj pro sebe.\nMůže si zde promluvit s dealerem, aby mu dal drogy.");
        Prostor karluvMost = new Prostor("karlův_most","karlůva mostu s lidmi kolem.\nPostava si po procházce uvědomí, že je už relativně pozdě a neměl by proto už chodit někam dále.\nPostava si ale zároveň uvědomí, že na něj čeká hrozně moc věcí, které prostě nezvládne a v hlavě má jen dvě možnosti – všechno ukončit hned teď anebo se vrátit a doufat, že se naskytne jiná možnost, která bude „lepší“.\n Skočit můžete pomocí příkazu 'skok'.");
        
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
        kamaraduvByt.setVychod(ulice);
        vaclavskeNamesti.setVychod(ulice);
        vaclavskeNamesti.setVychod(drogovyDealer);
        vaclavskeNamesti.setVychod(karluvMost);
        skola.setVychod(psycholog);
        skola.setVychod(strechaSkoly);
        skola.setVychod(ulice);
                
        aktualniProstor = domov;  // hra začíná v domě postavy

        Vec nuz = new Vec("nůž", true,true);
        Vec penize =  new Vec("peníze", true, false);
        Vec pevnaLinka = new Vec("pevná_linka", false, true);
        Vec lano = new Vec("lano", false, true);
        Vec zvonek = new Vec("zvonek", false, true);

        kuchyn.pridejVec(nuz);
        kuchyn.pridejVec(penize);
        domov.pridejVec(pevnaLinka);
        domov.pridejVec(lano);
        kamaraduvByt.pridejVec(zvonek);
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
