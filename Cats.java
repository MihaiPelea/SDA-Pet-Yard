import java.util.ArrayList;
import java.util.List;

public class Cats {

    private List<String> pisici = new ArrayList<>();

    void adaugaPisica(String numePisica) {
        pisici.add(numePisica);
        System.out.println("Numele '" + numePisica + "' a fost adaugat in lista.");
        System.out.println();
    }

    void afiseazaPisici() {
        System.out.println("### Lista Pisici ###");
        for (int i = 0; i < pisici.size(); i++) {
            System.out.println(pisici.get(i));
        }
        System.out.println();
    }
}
