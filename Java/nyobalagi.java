import java.util.LinkedList;

public class nyobalagi {
    public static void main(String[] args) {
        LinkedList<String> kelas = new LinkedList<String>();
        kelas.add("A");
        System.out.println(kelas);
        kelas.addFirst("B");
        System.out.println(kelas);
        kelas.addFirst("C");
        System.out.println(kelas);
        kelas.addLast("D");
        System.out.println(kelas);
        kelas.add(2, "E");
        System.out.println(kelas);
        kelas.addFirst("F");
        System.out.println(kelas);
        kelas.addLast("G");
        System.out.println(kelas);
        kelas.add(3, "H");
        System.out.println(kelas);
        kelas.remove(0);
        System.out.println(kelas);
    }
}
