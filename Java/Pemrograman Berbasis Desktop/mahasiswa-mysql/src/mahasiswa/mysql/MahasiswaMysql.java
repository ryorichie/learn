/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa.mysql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ryori
 */
// parameter JDBC untk koneksi ke database
public class MahasiswaMysql {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pendaftaran";
    static final String USER = "roti";
    static final String PASS = "123";
    Scanner scanner = new Scanner(System.in);

    // objek untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Update Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.println("PILIHAN>");

        try {
            int pilihan = Integer.parseInt(input.readLine());
            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    updateData();
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void inputData() {
        try {
            System.out.println("Nama Mahasiswa :");
            String nama = input.readLine().trim();
            System.out.println("Alamat");
            String alamat = input.readLine().trim();

            String sql = "INSERT INTO MAHASISWA (nama, alamat) VALUE('%s', '%s')";
            sql = String.format(sql, nama, alamat);

            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void tampilData() {
        String sql = "SELECT * FROM mahasiswa";
        try {
            rs = stmt.executeQuery(sql);
            System.out.println("+---------------------------+");
            System.out.println("+      DATA MAHASISWA       +");
            System.out.println("+---------------------------+");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                System.out.println(String.format("%d. %s tinggal di (%s)", id, nama, alamat));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void updateData() {
        try {
            System.out.println("ID yang mau diedit : ");
            int id = Integer.parseInt(input.readLine());
            System.out.println("Nama : ");
            String nama = input.readLine().trim();
            System.out.println("Alamat : ");
            String alamat = input.readLine().trim();

            String sql = "UPDATE mahasiswa SET nama='%s', alamat='%s' WHERE id=%d";
            sql = String.format(sql, nama, alamat, id);
            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
