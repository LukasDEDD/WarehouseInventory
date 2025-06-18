import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayField s = new ArrayField();

        ArrayListStock productNames = new ArrayListStock("laptop", "telefon", "monitor", "klavesnice", "mys");
        ArrayListStock item = new ArrayListStock("sluchatka");

        List<ArrayListStock> stock = new ArrayList<>();
        stock.add(productNames);
        stock.add(item);

        vypisProduktySeZarazenim(stock);
        ArrayListStock.findProduct(stock, "monitor");

    }

        public static void vypisProduktySeZarazenim (List < ArrayListStock > stock) {
            int pozice = 1;
            for (ArrayListStock polozka : stock) {
                List<String> produkty = polozka.getAllProducts();
                for (String produkt : produkty) {
                    System.out.println("Produkt na pozici " + pozice + " je " + produkt);
                    pozice++;
                }






            }
        }
    }
