public abstract class Fighter implements IFighter{ //abstract vynutí prvního neabstraktního potomka aby měli metody které já chci

    protected final String name;

    public Fighter(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    public abstract void sayHi();


//    String somethingNothing() { //můžu použít pouze v rámci balíčku
//        return "nothing";
//    }
//
//    private String somethingPrivate() { //můžu použít pouze v rámci třídy
//        return "private";
//    }
//
//    protected String somethingProtected() { //můžu použít pouze při extends a v balíčku
//        return "protected";
//    }

}
