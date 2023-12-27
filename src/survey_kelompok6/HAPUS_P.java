package survey_kelompok6;

import static survey_kelompok6.MAIN.i;
import javax.swing.JOptionPane;
import static survey_kelompok6.MAIN.toko;
import static survey_kelompok6.MAIN.alamat;
import static survey_kelompok6.MAIN.pemilik;
import static survey_kelompok6.MAIN.jenis;
import static survey_kelompok6.MAIN.modal;
import static survey_kelompok6.MAIN.penjualan;
import static survey_kelompok6.MAIN.pembeli;
import static survey_kelompok6.MAIN.cabang;
import static survey_kelompok6.MAIN.email;
import static survey_kelompok6.MAIN.sosmed;
import static survey_kelompok6.MAIN.telp;
import static survey_kelompok6.MAIN.status;
import static survey_kelompok6.MAIN.umur;
import static survey_kelompok6.MAIN.i;
import static survey_kelompok6.MAIN.lagi;

public class HAPUS_P {

    public static String tampil = "", data_s;
    public static int x;
    public static boolean putar = true;
    public static String cek;

    static void hapus_data() {
        do {
            do {

                try {
                    data_s = JOptionPane.showInputDialog("Silakan Pilih Data Yang Ingin Di Hapus [ 1 - " + (i + 1) + " ]");
                    x = Integer.parseInt(data_s);
                    putar = false;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                    putar = true;
                }

            } while (putar || (!(x >= 1 && x <= (i + 1))));

            tampil = "";
            tampil += "No : " + x + "\n";
            tampil += "Nama Toko : " + toko[x - 1] + "\n";
            tampil += "Alamat : " + alamat[x - 1] + "\n";
            tampil += "Pemilik : " + pemilik[x - 1] + "\n";
            tampil += "Jenis Usaha : " + jenis[x - 1] + "\n";
            tampil += "Modal : " + modal[x - 1] + "\n";
            tampil += "Penjualan : " + penjualan[x - 1] + "\n";
            tampil += "Pembeli : " + pembeli[x - 1] + "\n";
            tampil += "Cabang : " + cabang[x - 1] + "\n";
            tampil += "Email : " + email[x - 1] + "\n";
            tampil += "Sosial Media : " + sosmed[x - 1] + "\n";
            tampil += "No TELPON / HP : " + telp[x - 1] + "\n";
            tampil += "Status Pemilik : " + status[x - 1] + "\n";
            tampil += "Umur Pedangang Yang Berjaga Di Kios : " + umur[x - 1] + "\n";

            JOptionPane.showMessageDialog(null, tampil, "Rekap Data Yang Akan Di Hapus", JOptionPane.INFORMATION_MESSAGE);

            String konfirmasi = JOptionPane.showInputDialog("Anda Yakin Ingin Menghapus Data\n"
                    + "Y. Ya\n"
                    + "T. Tidak\n"
                    + "M. Kembali ke Menu");
            if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                int h = x - 1;
                if (h >= 0 && h < i) {
                    for (int p = h; p < i; p = p + 1) {
                        toko[p] = toko[p + 1];
                        alamat[p] = alamat[p + 1];
                        pemilik[p] = pemilik[p + 1];
                        jenis[p] = jenis[p + 1];
                        modal[p] = modal[p + 1];
                        penjualan[p] = penjualan[p + 1];
                        pembeli[p] = pembeli[p + 1];
                        cabang[p] = cabang[p + 1];
                        email[p] = email[p + 1];
                        sosmed[p] = sosmed[p + 1];
                        telp[p] = telp[p + 1];
                        status[p] = status[p + 1];
                        umur[p] = umur[p + 1];
                    }
                }
                i = i - 1;
                JOptionPane.showMessageDialog(null, "Data berhasil Di hapus");
                if (i == -1) {
                    JOptionPane.showMessageDialog(null, "Data telah terhapus semua");
                    JOptionPane.showMessageDialog(null, "Silahkan Input data lagi");
                    lagi = "y";
                    putar = false;

                } else {
                    String lagi = JOptionPane.showInputDialog("Ingin hapus data lagi? Y/T");
                    if ("y".equals(lagi) || "Y".equals(lagi)) {
                        putar = true;
                    } else {
                        putar = false;
                    }
                }
            } else if ("M".equals(konfirmasi) || "m".equals(konfirmasi)) {
                lagi = "y";
                putar = false;

            } else {
                putar = true;

            }
        } while (putar);

    }

}
