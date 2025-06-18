import java.util.ArrayList;
import java.util.List;

public class ArrayListStock {

    private String laptop;
    private String telefon;
    private String monitor;
    private String klavesnice;
    private String mys;
    private String sluchatka;

    private int[] stockLevels;  // <- pole s počty kusů

    public ArrayListStock(String nameLaptop, String nameTelefon, String nameMonitor, String nameKlavesnice, String nameMys) {
        this.laptop = nameLaptop;
        this.telefon = nameTelefon;
        this.monitor = nameMonitor;
        this.klavesnice = nameKlavesnice;
        this.mys = nameMys;

        this.stockLevels = new int[5];
    }

    public ArrayListStock(String sluchatka) {
        this.sluchatka = sluchatka;
        this.stockLevels = new int[1];
    }

    // Vrací seznam všech neprázdných produktů
    public List<String> getAllProducts() {
        List<String> produkty = new ArrayList<>();
        if (laptop != null) produkty.add(laptop);
        if (telefon != null) produkty.add(telefon);
        if (monitor != null) produkty.add(monitor);
        if (klavesnice != null) produkty.add(klavesnice);
        if (mys != null) produkty.add(mys);
        if (sluchatka != null) produkty.add(sluchatka);
        return produkty;
    }

    //  Metoda updateStock podle indexu
    public void updateStock(int index, int novyPocet) {
        if (index < 0 || index >= stockLevels.length) {
            System.out.println("Neplatný index: " + index);
            return;
        }

        stockLevels[index] = novyPocet;
        System.out.println("Aktualizován počet kusů na pozici " + index + " na " + novyPocet);

        vypisStavSkladu();
    }

    // Výpis stavu skladu
    public void vypisStavSkladu() {
        List<String> produkty = getAllProducts();
        int soucet = 0;

        System.out.println("Aktuální stav skladu:");
        for (int i = 0; i < produkty.size(); i++) {
            System.out.println(produkty.get(i) + ": " + stockLevels[i] + " kusů");
            soucet += stockLevels[i];
        }
        System.out.println("Celkem kusů: " + soucet);
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
    // smaze produkt
    public static void removeProduct(List<ArrayListStock> stock, String smazanyProdukt) {
        for (int i = 0; i < stock.size(); i++) {
            ArrayListStock polozka = stock.get(i);
            List<String> produkty = polozka.getAllProducts();
            for (String produkt : produkty) {
                if (produkt.equalsIgnoreCase(smazanyProdukt)) {
                    stock.remove(i);
                    System.out.println("Produkt \"" + smazanyProdukt + "\" byl odstraněn ze skladu.");
                    return;
                }
            }
        }
        System.out.println("Produkt \"" + smazanyProdukt + "\" se ve skladu nenachází.");

    }
    public static void vypisProduktySeZarazenim(List<ArrayListStock> stock) {
        int pozice = 1;
        for (ArrayListStock polozka : stock) {
            List<String> produkty = polozka.getAllProducts();
            for (String nazevProduktu : produkty) {
                System.out.println("Produkt na pozici " + pozice + " je " + nazevProduktu);
                pozice++;
            }
        }
    }

    @Override
    public String toString () {
        return String.join(", ", getAllProducts());
    }
}