import java.util.ArrayList;
import java.util.List;

public class TP9 {

    public static void main(String[] args) {
        List<String> chapitres = new ArrayList<String>();
        chapitres.add("Chapitre 1.Qu’est-ce que le Java?");
        chapitres.add("Chapitre 2.Qu’est-ce qu’une variable");
        chapitres.add("Chapitre 3. Les Conditions");
        chapitres.add("Chapitre 4. Les tableaux");

        for ( String i:chapitres
             ) {
            System.out.println(i);
        }

        chapitres.forEach(System.out::println);

    }
}
