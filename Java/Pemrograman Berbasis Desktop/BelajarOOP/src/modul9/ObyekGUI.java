import javax.swing.*;

public class ObyekGUI {
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
    final JTextField fnama = new JTextField(10);

    JLabel lnama = new JLabel("Nama Lengkap");
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin");

    JRadioButton rbPria = new JRadioButton("Laki-laki");
    JRadioButton rbWanita = new JRadioButton("Perempuan");

    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = { "Islam", "Kristen", "Katolik", "Hindu", "Buddha" };

    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lhobby = new JLabel("Hobby");

    JCheckBox cbSepakbola = new JCheckBox("Sepak Bola");
    JCheckBox cbBasket = new JCheckBox("Basket");

    JButton btnSave = new JButton("OK");

    public GUI() {
        setTitle("Mencoba kombinasi komponen GUI");
        setDefaultCloseOperation(3);
        setSize(350, 200);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbSepakbola);
        add(cbBasket);
        add(btnSave);

        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbPria.setBounds(130, 35, 120, 20);
        rbWanita.setBounds(230, 35, 120, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmbAgama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbSepakbola.setBounds(130, 85, 100, 20);
        cbBasket.setBounds(230, 85, 150, 20);
        btnSave.setBounds(100, 130, 120, 20);
        setVisible(true);
    }
}