import java.util.ArrayList;
import java.util.List;

public class ArrayListStock {

    private String nameLaptop;
    private String nameTelefon;
    private String nameMonitor;
    private String nameKlavesnice;
    private String nameMys;
    private String Sluchatka;

    public String getSluchatka() {
        return Sluchatka;
    }

    public ArrayListStock(String sluchatka) {
        Sluchatka = sluchatka;
    }

    public String getNameLaptop() {
        return nameLaptop;
    }

    public String getNameTelefon() {
        return nameTelefon;
    }

    public String getNameMonitor() {
        return nameMonitor;
    }

    public String getNameKlavesnice() {
        return nameKlavesnice;
    }

    public String getNameMys() {
        return nameMys;
    }

    @Override
    public String toString() {
        List<String> parts = new ArrayList<>();

        if (nameLaptop != null) parts.add(nameLaptop);
        if (nameTelefon != null) parts.add(nameTelefon);
        if (nameMonitor != null) parts.add(nameMonitor);
        if (nameKlavesnice != null) parts.add(nameKlavesnice);
        if (nameMys != null) parts.add(nameMys);
        if (Sluchatka != null) parts.add(Sluchatka);

        return String.join(", ", parts);
    }


    public ArrayListStock(String nameLaptop, String nameTelefon, String nameMonitor, String nameKlavesnice, String nameMys) {
        this.nameLaptop = nameLaptop;
        this.nameTelefon = nameTelefon;
        this.nameMonitor = nameMonitor;
        this.nameKlavesnice = nameKlavesnice;
        this.nameMys = nameMys;




    }
}
