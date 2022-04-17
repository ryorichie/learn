public class Main {
    public static void main(String[] args) {
        /// Calling Inner Class
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        /// Calling Private Inner Class
        // OuterClass2 myOuter2 = new OuterClass2();
        // OuterClass2.InnerClass2 myInner2 = myOuter2.new InnerClass2();
        // System.out.println(myInner2.y + myOuter2.x);

        /// Calling Static Inner Class
        OuterClass3.InnerClass3 myInner3 = new OuterClass3.InnerClass3();
        System.out.println(myInner3.y);

        /// Access Outer Class From Inner Class
        OuterClass4 myOuter4 = new OuterClass4();
        OuterClass4.InnerClass4 myInner4 = myOuter4.new InnerClass4();
        System.out.println(myInner4.myInnerMethod());
    }
}

// Inner Class
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

// Private Inner Class
class OuterClass2 {
    int x = 10;

    private class InnerClass2 {
        int y = 5;
    }
}

// Static Inner Class
class OuterClass3 {
    int x = 10;

    static class InnerClass3 {
        int y = 5;
    }
}

// Access Outer CLass From Inner Class
class OuterClass4 {
    int x = 10;

    class InnerClass4 {
        public int myInnerMethod() {
            return x;
        }
    }
}