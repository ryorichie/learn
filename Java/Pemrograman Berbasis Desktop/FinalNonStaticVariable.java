public class FinalNonStaticVariable {

    private final int id;

    public FinalNonStaticVariable() {
        id = 100;
    }

    public void printId() {
        System.out.println(id);
    }

    public void changeId() {
        // id = 200; can't do this
    }
}
