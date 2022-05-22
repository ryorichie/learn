class kebunBinatang {

}

class hidupDiUdara extends kebunBinatang {
    String hidupDiUdara[] = {"Gagak", "Kakak Tua", "Beo"};
    public void showUdara() {
        System.out.println("\nBerikut adalah Hewan yang Hidup di Udara");
        for (int i = 0; i < 3; i++) {
        System.out.println(hidupDiUdara[i]);
        }
    }
}

class hidupDiDarat extends kebunBinatang  {
    String hidupDiDarat[] = {"Sapi", "Harimau", "Kuda"};
    public void showDarat() {
        System.out.println("\nBerikut adalah Hewan yang Hidup di Darat");
        for (int i = 0; i < 3; i++) {
        System.out.println(hidupDiDarat[i]);
        }
    }
}

class hidupDiAir extends kebunBinatang  {
    String hidupDiAir[] = {"Ikan Koki", "Ikan Mas", "Ikan Lele"};
    public void showAir() {
        System.out.println("\nBerikut adalah Hewan yang Hidup di Air");
        for (int i = 0; i < 3; i++) {
        System.out.println(hidupDiAir[i]);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        hidupDiUdara hidupdiUdara = new hidupDiUdara();
        hidupdiUdara.showUdara();
        hidupDiDarat hidupdiDarat = new hidupDiDarat();
        hidupdiDarat.showDarat();
        hidupDiAir hidupdiAir = new hidupDiAir();
        hidupdiAir.showAir();
    }
}