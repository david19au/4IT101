public class BraveFighter extends Fighter {

    public BraveFighter(String name) {
        super(name);
    }

    @Override
    public void goOnAdventure() {
        System.out.println("Jmeno:" + name); //name můžu použít protože je ve viditelnosti "protected"
        System.out.println("I went on an adventure and have won every fight!");
    }

    @Override
    public void sayHi() {
        System.out.println("hi.");
    }


    //    @Override
//    public void goOnAdventure() {
//        System.out.println("I went on an adventure and have won every fight!");
//
//    }
}
