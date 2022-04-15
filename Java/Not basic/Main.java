public class Main {
    int x = 5;
    final int y = 3; // 'final' disabled ability to override existing values

    public static void main(String[] args) {
        Main myObj = new Main();
        Main myObj1 = new Main();
        myObj.x = 40; // override existing values
        // myObj.x = 10 // will generate error
        System.out.println(myObj.x);
        System.out.println(myObj1.x); // this object value is still 5
    }
}
