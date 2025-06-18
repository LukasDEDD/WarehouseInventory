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



        //* Výpis produktů
        ArrayListStock.vypisProduktySeZarazenim(stock );

        // Vyhledání produktu
        ArrayListStock.findProduct(stock, "monitor");

        //* Aktualizace počtu kusů
        productNames.updateStock(2, 10);

        // Odebrání produktu
        ArrayListStock.removeProduct(stock, "monitor");




        }
    }
