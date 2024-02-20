import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FrameMain extends JFrame implements ActionListener {
    // Inheritance
    private JButton tombol1, tombol2, tombol3, tombol4; // hiding information

    public FrameMain() {
        super("PRATIKUM PBO"); // implementasi SUPER

        Container c = getContentPane();
        c.setLayout(null);

        tombol1 = new JButton("1");
        tombol1.setLocation(0, 0);
        tombol1.setSize(100, 350);
        tombol1.setBackground(Color.red);
        tombol2 = new JButton("2");
        tombol2.setLocation(100, 0);
        tombol2.setSize(100, 350);
        tombol2.setBackground(Color.yellow);
        tombol3 = new JButton("3");
        tombol3.setLocation(200, 0);
        tombol3.setSize(100, 350);
        tombol3.setBackground(Color.blue);
        tombol4 = new JButton("4");
        tombol4.setLocation(300, 0);
        tombol4.setSize(100, 350);
        tombol4.setBackground(Color.green);

        c.add(tombol1);
        c.add(tombol2);
        c.add(tombol3);
        c.add(tombol4);

        setSize(410, 350);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent en) {
        if (en.getSource() == tombol1) {
            setVisible(false);
            FrameFirst fs = new FrameFirst();
            fs.setVisible(true);
        } else if (en.getSource() == tombol2) {
            setVisible(false);
            FrameSecond fd = new FrameSecond();
            fd.setVisible(true);
        } else if (en.getSource() == tombol3) {
            setVisible(false);
            FrameThird ft = new FrameThird();
            ft.setVisible(true);
        } else if (en.getSource() == tombol4) {
            setVisible(false);
            FrameFourth fe = new FrameFourth();
            fe.tmplFrame();
        }
    }

}

class FrameFirst extends JFrame implements ActionListener {
    private JButton tombol1;
    private JLabel labelnama, labelnpm, labelkls;
    private JTextField txtnama, txtnpm, txtkls;

    public FrameFirst() {
        super("BUTTON 1");

        Container c = getContentPane();
        c.setLayout(null);

        labelnama = new JLabel("Nama :");
        labelnama.setLocation(10, 10);
        labelnama.setSize(labelnama.getPreferredSize());
        txtnama = new JTextField();
        txtnama.setLocation(70, 10);
        txtnama.setSize(300, 20);

        labelnpm = new JLabel("NPM      :");
        labelnpm.setLocation(10, 30);
        txtnpm = new JTextField();
        txtnpm.setLocation(70, 30);
        txtnpm.setSize(300, 20);

        labelnpm.setSize(labelnama.getPreferredSize());
        labelkls = new JLabel("Kelas :");
        labelkls.setLocation(10, 50);
        labelkls.setSize(labelnama.getPreferredSize());
        txtkls = new JTextField();
        txtkls.setLocation(70, 50);
        txtkls.setSize(300, 20);

        tombol1 = new JButton("OK");
        tombol1.setLocation(10, 100);
        tombol1.setSize(80, 20);
        tombol1.addActionListener(this);

        c.add(tombol1);
        c.add(labelnama);
        c.add(txtnama);
        c.add(labelnpm);
        c.add(txtnpm);
        c.add(labelkls);
        c.add(txtkls);

        setSize(410, 350);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent en) {
        if (en.getSource() == tombol1) {
            String nama = txtnama.getText();
            String npm = txtnpm.getText();
            String kls = txtkls.getText();
            JOptionPane.showMessageDialog(null, "Nama" + nama + "\nNpm: " + npm + "\nKelas : " + kls);
            setVisible(false);
            FrameMain fo = new FrameMain();
            fo.setVisible(true);
        }
    }
}

class FrameSecond extends JFrame implements ActionListener {
    private JButton tombol1, tombol2, tombol3;// information hiding
    private JLabel labelalas, labeltinggi, labelhasil;// information hiding
    private JTextField txtalas, txttinggi, txthasil;// information hiding

    public FrameSecond() {
        super("BUTTON 2"); // SUPER
        Container c = getContentPane();
        c.setLayout(null);

        labelalas = new JLabel("Alas");
        labelalas.setLocation(10, 10);
        labelalas.setSize(labelalas.getPreferredSize());
        txtalas = new JTextField();
        txtalas.setLocation(70, 10);
        txtalas.setSize(300, 20);

        labeltinggi = new JLabel("Tinggi");
        labeltinggi.setLocation(10, 30);
        labeltinggi.setSize(labeltinggi.getPreferredSize());
        txttinggi = new JTextField();
        txttinggi.setLocation(70, 30);
        txttinggi.setSize(300, 20);

        tombol1 = new JButton("Hitung");
        tombol1.setLocation(10, 60);
        tombol1.setSize(80, 25);
        tombol1.addActionListener(this);

        tombol2 = new JButton("Reset");
        tombol2.setLocation(150, 60);
        tombol2.setSize(80, 25);
        tombol2.addActionListener(this);

        tombol3 = new JButton("Close");
        tombol3.setLocation(290, 60);
        tombol3.setSize(80, 25);
        tombol3.addActionListener(this);

        labelhasil = new JLabel("Hasil");
        labelhasil.setLocation(10, 100);
        labelhasil.setSize(labelhasil.getPreferredSize());
        txthasil = new JTextField();
        txthasil.setLocation(70, 100);
        txthasil.setSize(300, 20);

        c.add(tombol1);
        c.add(tombol2);
        c.add(tombol3);
        c.add(labelalas);
        c.add(txtalas);
        c.add(labeltinggi);
        c.add(txttinggi);
        c.add(labelhasil);
        c.add(txthasil);
        setSize(410, 350);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent en) {
        if (en.getSource() == tombol1) {
            try {
                double alas = Double.parseDouble(txtalas.getText());
                double tinggi = Double.parseDouble(txttinggi.getText());
                double hasil = 0.5 * alas * tinggi;
                txthasil.setText("" + hasil);
            } catch (Exception e) {// Implementasi Exception
                if (txtalas.getText().equals("") && txttinggi.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Angka Tidak boleh kosong, harus diisi !");
                    txtalas.setText("");
                    txttinggi.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Inputan harus Angka");
                    txtalas.setText("");
                    txttinggi.setText("");
                }
            }
        }
        if (en.getSource() == tombol2) {
            txtalas.setText("");
            txthasil.setText("");
            txttinggi.setText("");
        }
        if (en.getSource() == tombol3) {
            setVisible(false);
            FrameMain fo = new FrameMain();
            fo.setVisible(true);
        }
    }
}

class FrameThird extends JFrame implements ActionListener {
    private JButton tombol1;
    private JLabel labelnama, labelnpm, labelkls;

    public FrameThird() {
        super("BUTTON 3");

        Container c = getContentPane();
        c.setLayout(null);
        
        DrawPanel draw = new DrawPanel();
        Panel panel = new Panel();
        panel.setLocation(0, 0);
        panel.setSize(200, 350);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(draw);

        tombol1 = new JButton("Close");
        tombol1.setLocation(200, 0);
        tombol1.setSize(200, 350);
        tombol1.addActionListener(this);

        c.add(tombol1);
        c.add(panel);
        
        setSize(410, 350);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent en) {
        if (en.getSource() == tombol1) {
            setVisible(false);
            FrameMain fo = new FrameMain();
            fo.setVisible(true);
        }
    }
}

class DrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.red);
        g.fillOval(110, 90, 30, 30);
        g.setColor(Color.blue);
        g.fillOval(80, 130, 30, 30);
        g.setColor(Color.green);
        g.fillOval(140, 130, 30, 30);
        g.setColor(Color.yellow);
        g.fillOval(90, 175, 30, 30);
        g.setColor(Color.pink);
        g.fillOval(130, 175, 30, 30);
    }
}

class FrameFourth{
    public void tmplFrame() {
        JOptionPane.showMessageDialog(null, "Terima Kasih sudah menggunakan aplikasi ini");
        System.exit(0);
    }
}

public class Modul4 {
    public static void main(String[] args) {
        FrameMain fo = new FrameMain();
        fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
