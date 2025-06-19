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

    public ArrayListStock(String Laptop, String telefon, String monitor, String nameKlavesnice, String mys) {
        this.laptop = Laptop;
        this.telefon = telefon;
        this.monitor = monitor;
        this.klavesnice = nameKlavesnice;
        this.mys = mys;

        this.stockLevels = new int[5];

    }

    public ArrayListStock(String sluchatka) {
        this.sluchatka = sluchatka;
        this.stockLevels = new int[1];
    } /* mam 2 konsturktory 1 pro productNames a 2. pro item ->
        pouzivam promenou ArraylistStock, ktera absorbuje str + pole ->
pote pracuji s obema hodnotami najednou*/

    // Vrací seznam všech neprázdných produktů - bez null
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


    //  Metoda updateStock podle indexu
    public void updateStock(int index, int novyPocet){
                if (index < 0 || index >= stockLevels.length) {
                    System.out.println("Neplatný index: " + index);
                    return;
                }

        stockLevels[index] = novyPocet;
        System.out.println("Aktualizován počet kusů na pozici " + index + " na " + novyPocet);

        vypisStavSkladu(); // navazuje metoda vypisStavSkladu
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
// nastaveni pro smazani
    public boolean removeProductByName(String nazevProduktu) {
        List<String> produkty = getAllProducts();
        for (int i = 0; i < produkty.size(); i++) {
            if (produkty.get(i).equalsIgnoreCase(nazevProduktu)) {
                stockLevels[i] = 0;
                return true;
            }
        }
        return false;
    }
    // smaze produkt
    public static void removeProduct(List<ArrayListStock> stock, String smazanyProdukt) {
        for (ArrayListStock polozka : stock) {
            boolean bylSmazan = polozka.removeProductByName(smazanyProdukt);
            if (bylSmazan) {
                System.out.println("Produkt \"" + smazanyProdukt + "\" byl odstraněn ze skladu.");
                return;
            }
        }
        System.out.println("Produkt \"" + smazanyProdukt + "\" se ve skladu nenachází.");
    }

    @Override
    public String toString () {
                return String.join(", ", getAllProducts());
            }
        }
