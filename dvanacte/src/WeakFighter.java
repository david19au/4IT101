public class WeakFighter extends Fighter {


    public WeakFighter(String name) {
        super(name);
    }

    @Override
    public void goOnAdventure() {
        System.out.println("No.");
    }

    @Override
    public void sayHi() {
        System.out.println("hello");
    }
}
