import java.util.List;

public class Livre {
    private String nom;
    private List<Page> pages;


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPages() {
        return pages.size();
    }

    public Livre(String nom, List<Page> pages) {
        this.nom = nom;
        this.pages = pages;
    }
}
