package survey_kelompok6;

import javax.swing.JOptionPane;
import static survey_kelompok6.MAIN.toko;
import static survey_kelompok6.MAIN.pemilik;
import static survey_kelompok6.MAIN.umur;
import static survey_kelompok6.MAIN.cabang;
import static survey_kelompok6.MAIN.i;
import static survey_kelompok6.MAIN.tanggal;

public class LAP_INOVASI {

    public static String data = "", rekap = "";
    public static int hal = 0, jumlah_d = 0, sisa = 0, x1 = 0, x2 = 0;
    public static int TC, AC, tot;
    public static double r_umur;

    static void lap_inovasi() {
        r_umur = 0;

        jumlah_d = (i + 1);

        sisa = jumlah_d % 10;

        if (sisa == 0) {

            hal = jumlah_d / 10; // ini rumus untuk kelipatan 3
        } else {

            hal = (jumlah_d / 10) + 1; // ini rumus / data untuk  bukan kelipatan 3
        }

        if (hal == 1) {
            x1 = 0;
            x2 = jumlah_d;

        } else {
            x1 = 0;
            x2 = 10;

        }

        for (int t = 1; t <= hal; t = t + 1) {
            if (t == hal) {
                x2 = jumlah_d;

            }
            data = "";
            TC = 0;
            AC = 0;
            r_umur = 0;
            tot = 0;
            data += "              LAPORAN UMUR PEGAWAI YANG BERJAGA \n\n\n";
            data += "Hal : " + t + "                                                                Tanggal : " + tanggal[0] + "\n\n\n";
            data += "No | NAMA TOKO | NAMA PEMILIK  | UMUR | CABANG \n";
            data += "===========================================================\n";

            for (int n = x1; n < x2; n = n + 1) {
                if ("TIDAK ADA".equals(cabang[n])) {

                    TC = TC + 1;

                } else if ("ADA".equals(cabang[n])) {

                    AC = AC + 1;

                } else {
                    JOptionPane.showMessageDialog(null, "Data Cabang tidak di temukan");

                }
                tot = tot + umur[n];

                data += (n + 1) + "    " + toko[n] + "     " + pemilik[n] + "       " + umur[n] + "      " + cabang[n] + "\n\n";
            }
            r_umur = r_umur + tot / 10;
            data += "===========================================================\n";
            data += "TOTAL UMUR    : " + r_umur + "\n";
            data += "CABANG         \n";
            data += "Tidak Ada :  T = " + TC  + "\n";
            data += "Ada        :  T = " + AC  + "\n";
            
            JOptionPane.showMessageDialog(null, data, "LAPORAN INVOASI MAHASISWA", JOptionPane.INFORMATION_MESSAGE);

            x1 = x1 + 10;
            x2 = x2 + 10;

        }

    }

}
