public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

class OuterClass {
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}

class OuterClass2 {
    int x = 10;

    private class InnerClass2 {
        int y = 5;
    }
}