package survey_kelompok6;

import javax.swing.JOptionPane;
import static survey_kelompok6.MAIN.toko;
import static survey_kelompok6.MAIN.i;
import static survey_kelompok6.MAIN.modal;
import static survey_kelompok6.MAIN.penjualan;
import static survey_kelompok6.MAIN.pembeli;
import static survey_kelompok6.MAIN.cabang;
import static survey_kelompok6.MAIN.tanggal;

public class LAP_STATISTIK {

    public static String data = "", rekap = "";
    public static int hal = 0, jumlah_d = 0, sisa = 0, x1 = 0, x2 = 0;
    public static int DB, CB, LB, G_DB, G_CB, G_LB;
    public static int DJ, LJ, SJ, G_DJ, G_LJ, G_SJ;
    public static int TC, AC, tot, G_TC, G_AC, r_modal;

    static void lap_statistik() {
        G_DB = 0;
        G_CB = 0;
        G_LB = 0;
        G_DJ = 0;
        G_LJ = 0;
        G_SJ = 0;
        G_TC = 0;
        G_AC = 0;
        r_modal = 0;

        jumlah_d = (i + 1);

        sisa = jumlah_d % 4;

        if (sisa == 0) {

            hal = jumlah_d / 4; // ini rumus untuk kelipatan 3
        } else {

            hal = (jumlah_d / 4) + 1; // ini rumus / data untuk  bukan kelipatan 3
        }

        if (hal == 1) {
            x1 = 0;
            x2 = jumlah_d;

        } else {
            x1 = 0;
            x2 = 4;

        }

        rekap = "";

        for (int t = 1; t <= hal; t = t + 1) {
            if (t == hal) {
                x2 = jumlah_d;

            }
            data = "";
            DB = 0;
            CB = 0;
            LB = 0;
            DJ = 0;
            LJ = 0;
            SJ = 0;
            TC = 0;
            AC = 0;
            tot = 0;
            data += "              LAPORAN REKAP DATA STATISTIK PEDAGANG\n\n\n";
            data += "Tanggal : " + tanggal[0] + "                                                           Hal: " + t + "\n\n";
            data += "No | TOKO | MODAL | PENJUALAN | PEMBELI | CABANG \n";
            data += "===========================================================\n";

            for (int n = x1; n < x2; n = n + 1) {
                if ("DOMESTIK".equals(pembeli[n])) {
                    DB = DB + 1;

                } else if ("CAMPURAN".equals(pembeli[n])) {
                    CB = CB + 1;

                } else if ("LUAR".equals(pembeli[n])) {
                    LB = LB + 1;

                } else {
                    JOptionPane.showMessageDialog(null, "Data pembeli tidak di temukan");

                }

                if ("DALAM NEGERI".equals(penjualan[n])) {
                    DJ = DJ + 1;

                } else if ("LUAR NEGERI".equals(penjualan[n])) {
                    LJ = LJ + 1;

                } else if ("DALAM DAN LUAR NEGERI".equals(penjualan[n])) {
                    SJ = SJ + 1;

                } else {
                    JOptionPane.showMessageDialog(null, "Data Penjualan tidak di temukan");

                }
                if ("TIDAK ADA".equals(cabang[n])) {

                    TC = TC + 1;

                } else if ("ADA".equals(cabang[n])) {

                    AC = AC + 1;

                } else {
                    JOptionPane.showMessageDialog(null, "Data Cabang tidak di temukan");

                }

                tot = tot + modal[n];

                data += (n + 1) + "    " + toko[n] + "     " + modal[n] + "       " + penjualan[n] + "      " + pembeli[n] + "      " + cabang[n] + "\n\n";
            }
            G_DB = G_DB + DB;
            G_CB = G_CB + CB;
            G_LB = G_LB + LB;
            G_DJ = G_DJ + DJ;
            G_LJ = G_LJ + LJ;
            G_SJ = G_SJ + SJ;
            G_TC = G_TC + TC;
            G_AC = G_AC + AC;
            r_modal = r_modal + tot / jumlah_d;
            data += "===========================================================\n";
            data += "PEMBELI        :  D = " + DB + "      C = " + CB + "      L = " + LB + "\n";
            data += "PENJUALAN :  D = " + DJ + "        L = " + LJ + "      S = " + SJ + "\n";
            data += "CABANG         :  T = " + TC + "       A = " + AC + "\n";
            data += "TOTAL MODAL    : " + tot;
            JOptionPane.showMessageDialog(null, data, "LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
            if (t == hal) {
                rekap += "             LAPORAN REKAP DATA STATISTIK PEDAGANG\n\n\n";
                rekap += "Tanggal : " + tanggal[0] + "              Hal: " + (t + 1) + "\n\n";
                rekap += "===========================================================\n";
                rekap += "PEMBELI  :            D = " + G_DB + "\n"
                        + "                                C = " + G_CB + "\n"
                        + "                                L = " + G_LB + "\n\n";
                rekap += "PENJUALAN  :      D = " + G_DJ + "\n"
                        + "                                L = " + G_LJ + "\n"
                        + "                                S = " + G_SJ + "\n\n";
                rekap += "CABANG  :             A = " + G_AC + "\n"
                        + "                                T = " + G_TC + "\n\n";
                rekap += "RATA-RATA MODAL =  " + r_modal + "\n";
                rekap += "===========================================================\n";

                JOptionPane.showMessageDialog(null, rekap, "LAPORAN REKAP DATA STATISTIK PEDAGANG", JOptionPane.INFORMATION_MESSAGE);

            }

            x1 = x1 + 4;
            x2 = x2 + 4;

        }

    }

}
