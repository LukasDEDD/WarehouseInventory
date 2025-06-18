import java.util.ArrayList;
import java.util.List;

public class ArrayListStock {

    private String nameLaptop;
    private String nameTelefon;
    private String nameMonitor;
    private String nameKlavesnice;
    private String nameMys;
    private String sluchatka;

    private int[] stockLevels;  // <- pole s počty kusů

    public ArrayListStock(String nameLaptop, String nameTelefon, String nameMonitor, String nameKlavesnice, String nameMys) {
        this.nameLaptop = nameLaptop;
        this.nameTelefon = nameTelefon;
        this.nameMonitor = nameMonitor;
        this.nameKlavesnice = nameKlavesnice;
        this.nameMys = nameMys;

        this.stockLevels = new int[5];
    }

    public ArrayListStock(String sluchatka) {
        this.sluchatka = sluchatka;
        this.stockLevels = new int[1];
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


