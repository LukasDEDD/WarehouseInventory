import java.util.ArrayList;
import java.util.List;

public class ArrayListStock {

    private String nameLaptop;
    private String nameTelefon;
    private String nameMonitor;
    private String nameKlavesnice;
    private String nameMys;
    private String sluchatka;


    public ArrayListStock(String nameLaptop, String nameTelefon, String nameMonitor, String nameKlavesnice, String nameMys) {
        this.nameLaptop = nameLaptop;
        this.nameTelefon = nameTelefon;
        this.nameMonitor = nameMonitor;
        this.nameKlavesnice = nameKlavesnice;
        this.nameMys = nameMys;
    }


    public ArrayListStock(String sluchatka) {
        this.sluchatka = sluchatka;
    }

    // Vrací seznam všech neprázdných produktů
    public List<String> getAllProducts() {
        List<String> produkty = new ArrayList<>();
        if (nameLaptop != null) produkty.add(nameLaptop);
        if (nameTelefon != null) produkty.add(nameTelefon);
        if (nameMonitor != null) produkty.add(nameMonitor);
        if (nameKlavesnice != null) produkty.add(nameKlavesnice);
        if (nameMys != null) produkty.add(nameMys);
        if (sluchatka != null) produkty.add(sluchatka);
        return produkty;
    }

    // Vyhledá produkt podle názvu
    public static void findProduct(List<ArrayListStock> stock, String hledanyProdukt) {
        int pozice = 1;
        for (ArrayListStock polozka : stock) {
            List<String> produkty = polozka.getAllProducts();
            for (String produkt : produkty) {
                if (produkt.equalsIgnoreCase(hledanyProdukt)) {
                    System.out.println("Produkt \"" + hledanyProdukt + "\" je na pozici " + pozice + ".");
                    return;
                }
                pozice++;
            }
        }
        System.out.println("Produkt \"" + hledanyProdukt + "\" nebyl nalezen.");
    }


    @Override
    public String toString() {
        return String.join(", ", getAllProducts());
    }
}

