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
        return "ArrayListStock{" +
                "nameLaptop='" + nameLaptop + '\'' +
                ", nameTelefon='" + nameTelefon + '\'' +
                ", nameMonitor='" + nameMonitor + '\'' +
                ", nameKlavesnice='" + nameKlavesnice + '\'' +
                ", nameMys='" + nameMys + '\'' +
                ", Sluchatka='" + Sluchatka + '\'' +
                '}';
    }

    public ArrayListStock(String nameLaptop, String nameTelefon, String nameMonitor, String nameKlavesnice, String nameMys) {
        this.nameLaptop = nameLaptop;
        this.nameTelefon = nameTelefon;
        this.nameMonitor = nameMonitor;
        this.nameKlavesnice = nameKlavesnice;
        this.nameMys = nameMys;




    }
}
