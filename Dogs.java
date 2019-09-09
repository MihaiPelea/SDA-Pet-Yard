import java.util.ArrayList;
import java.util.List;

public class Dogs {

    private List<String> caini = new ArrayList<>();

    void adaugaCaine(String numeCaine) {
        caini.add(numeCaine);
        System.out.println("Numele '" + numeCaine + "' a fost adaugat in lista.");
        System.out.println();
    }

    void afiseazaCaini() {
        System.out.println("### Lista Caini ###");
        for (int i = 0; i < caini.size(); i++) {
            System.out.println(caini.get(i));
        }
        System.out.println();
    }
}