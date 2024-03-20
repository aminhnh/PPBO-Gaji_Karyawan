public class Main {
    public static void main(String[] args) {
        Tetap Ina = new Tetap("Ina", 5000000);
        Tetap Eko = new Tetap("Eko", 3500000);
        Kontrak Adi = new Kontrak("Adi", 40000, 80);

        Ina.rincian();
        Eko.rincian();
        Adi.rincian();
    }
}