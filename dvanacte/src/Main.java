public class Main { //polymorfismus a dědičnost
    public static void main(String[] args) {
        Fighter genericFighter = new Fighter("FUCK YOU") { //anonymní metoda
            @Override
            public void goOnAdventure() {
                System.out.println("NIKAM NEJDU LMAO");
            }

            @Override
            public void sayHi() {
                System.out.println("TAKHLE NE");
            }
        };
        BraveFighter braveFighter = new BraveFighter("EggsD");
        WeakFighter weakFighter = new WeakFighter("xd");

        braveFighter.goOnAdventure();
        weakFighter.goOnAdventure();


        genericFighter.sayHi();
        genericFighter.goOnAdventure();

        System.out.println(braveFighter);

    }
}
