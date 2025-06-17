public class ArrayField {

    int[] stockLevels;
    int[] primeStock = {20, 30, 40, 50, 60};
    int soucet = 0;

    public ArrayField() {
        stockLevels = new int[6]; }
    {
        System.out.println("Produkt 1 má na skladě " + primeStock[0] + " kusů.");
        System.out.println("Produkt 2 má na skladě " + primeStock[1] + " kusů.");
        System.out.println("Produkt 3 má na skladě " + primeStock[2] + " kusů.");
        System.out.println("Produkt 4 má na skladě " + primeStock[3] + " kusů.");
        System.out.println("Produkt 4 má na skladě " + primeStock[4] + " kusů.");

        for (int hodnota : primeStock) {
            soucet += hodnota; }
        System.out.println( "Celkovy pocet kusu na sklade je: " + soucet );



    }
}
