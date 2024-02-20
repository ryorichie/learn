public class Static_variable {
    static int umur = 21;
    static String nama = "Ryo Richie";
    public Static_variable() {
        System.out.println(this.nama); // this tidak wajib
        System.out.println(this.umur);
        umur++;
    }
    public static void main(String[]args) {
        Static_variable a = new Static_variable();
        Static_variable b = new Static_variable();
    }
}

//static variabel menyimpan value dan mengupdatenya sendiri