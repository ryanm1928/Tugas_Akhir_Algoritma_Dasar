package survey_kelompok6;

import javax.swing.JOptionPane;

public class MAIN {

    public static String lagi = "y";
    public static String toko[], alamat[], pemilik[], jenis[], penjualan[], pembeli[];
    public static String cabang[], email[], sosmed[], telp[], status[], tanggal[];
    public static int modal[], umur[];
    public static int i = -1;

    public static void main(String[] args) {
        toko = new String[45];
        alamat = new String[45];
        pemilik = new String[45];
        jenis = new String[45];
        penjualan = new String[45];
        pembeli = new String[45];
        cabang = new String[45];
        email = new String[45];
        sosmed = new String[45];
        status = new String[45];
        telp = new String[45];
        modal = new int[45];
        umur = new int[45];
        tanggal = new String[1];

        INPUT_P inputs = new INPUT_P(); // OBJEK
        HAPUS_P delete = new HAPUS_P();
        EDIT_P edits = new EDIT_P();
        LAP_DATA data = new LAP_DATA();
        LAP_STATISTIK statistik = new LAP_STATISTIK();
        LAP_ALAMAT address = new LAP_ALAMAT();
        LAP_INOVASI inovasi = new LAP_INOVASI();
        while ("y".equals(lagi)) {
            String menu = JOptionPane.showInputDialog("     MENU SISTEM PEDAGANG\n          KOTA PEKALONGAN\n           DAN SEKITARNYA\n"
                    + "\n1.INPUT DATA PEDANGANG\n"
                    + "2.EDIT DATA PEDANGANG\n"
                    + "3.HAPUS DATA PEDANGANG\n"
                    + "4.LAPORAN DATA PENDANGAN\n"
                    + "5.LAPORAN STATISTIK\n"
                    + "6.LAPORAN ALAMAT USAHA\n"
                    + "7.LAPORAN INOVASI MAHASISWA\n"
                    + "8.EXIT\n                     PILIH [1-8]");

            switch (menu) {
                case "1":
                    inputs.input_data();
                    break;
                case "2":
                    if (i == -1) {
                        JOptionPane.showMessageDialog(null, "Data Kosong Silahkan Input Data");
                    } else {
                        edits.edit_data();
                    }
                    break;

                case "3":
                    if (i == -1) {
                        JOptionPane.showMessageDialog(null, "Data Kosong Silahkan Input Data");
                    } else {
                        delete.hapus_data();
                    }
                    break;

                case "4":
                    if (i == -1) {
                        JOptionPane.showMessageDialog(null, "Data Kosong Silahkan Input Data");
                    } else {
                        data.lap_data();
                    }

                    break;
                case "5":
                    if (i == -1) {
                        JOptionPane.showMessageDialog(null, "Data Kosong Silahkan Input Data");
                    } else {
                        statistik.lap_statistik();
                    }

                    break;

                case "6":
                    if (i == -1) {
                        JOptionPane.showMessageDialog(null, "Data Kosong Silahkan Input Data");
                    } else {
                        address.lap_alamat();
                        address.lap_alamat2();
                    }

                    break;

                case "7":
                    if (i == -1) {
                        JOptionPane.showMessageDialog(null, "Data Kosong Silahkan Input Data");
                    } else {
                        inovasi.lap_inovasi();
                    }

                    break;

                case "8":
                    JOptionPane.showMessageDialog(null, "System Keluar \n   "
                            + "bye bye");
                    System.exit(0);

                    break;
                case "9":
                    INPUT_P.cheats();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
            }

        }
    }
}
