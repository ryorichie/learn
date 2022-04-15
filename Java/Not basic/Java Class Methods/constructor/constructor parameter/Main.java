public class Main {
    public static void main(String[] args) {
        Main newObj = new Main(21);
        System.out.println(newObj.x);
    }

    int x;

    public Main(int y) {
        x = y;
    }
}
