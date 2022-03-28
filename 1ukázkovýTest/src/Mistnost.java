import java.util.Collection;
import java.util.HashSet;

public class Mistnost {
    private String nazevMistnosti;

    public Mistnost(String nazevMistnosti) {
        this.nazevMistnosti = nazevMistnosti;
    }

    public Collection<Vec> veciMistnost;
    public Mistnost() {
        veciMistnost = new HashSet<>();
    }

    public boolean vlozVec(Vec vec) {
        return veciMistnost.add(vec);
    }

    public Vec odeberVec(String nazevVeci) {
        for (Vec vec : veciMistnost) {
            if (vec.getNazev().equals(nazevVeci)) {
                veciMistnost.remove((vec));
                return vec;
            }
        }
        return null;
    }

}
