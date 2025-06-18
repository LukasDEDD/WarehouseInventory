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

        System.out.println(" Na sklade jsou tyto polozky : "+ stock );

        ArrayListStock.findProduct(stock, "monitor");

    }
}