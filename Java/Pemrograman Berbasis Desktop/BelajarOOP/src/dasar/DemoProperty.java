package dasar;
public class DemoProperty {
    // Deklarasai property
    private String text;
    
    //method getter setter
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public static void main(String[] args) {
        DemoProperty deploy = new DemoProperty();
        deploy.setText("Belajar");;
        System.out.println("text : " + deploy.getText());
    }
}
