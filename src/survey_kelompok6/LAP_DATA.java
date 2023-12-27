package survey_kelompok6;

import javax.swing.JOptionPane;
import static survey_kelompok6.MAIN.toko;
import static survey_kelompok6.MAIN.i;
import static survey_kelompok6.MAIN.pemilik;
import static survey_kelompok6.MAIN.jenis;
import static survey_kelompok6.MAIN.alamat;
import static survey_kelompok6.MAIN.tanggal;

public class LAP_DATA {

    public static int hal = 0, jumlah_d = 0, sisa = 0, x1 = 0, x2 = 0;
    public static int P, S, M, B, S_T, B_P, E, L_L;
    public static int G_P, G_S, G_M, G_B, G_ST, G_BP, G_E, G_LL;
    public static String data = "", rekap = "";

    static void lap_data() {
        G_P = 0;
        G_S = 0;
        G_M = 0;
        G_B = 0;
        G_ST = 0;
        G_BP = 0;
        G_E = 0;
        G_LL = 0;
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
            P = 0;
            S_T = 0;
            S = 0;
            B_P = 0;
            M = 0;
            E = 0;
            B = 0;
            L_L = 0;
            data += "              LAPORAN DATA PEDAGANG\n\n\n";
            data += "Tanggal : " + tanggal[0] + "                                                       Hal: " + t + "\n\n";
            data += "No | NAMA TOKO | ALAMAT | NAMA PEMILIK | JENIS USAHA \n";
            data += "===========================================================\n";
            for (int n = x1; n < x2; n = n + 1) {
                if ("PAKAIAN".equals(jenis[n])) {
                    P = P + 1;

                } else if ("SEPATU/TAS".equals(jenis[n])) {
                    S_T = S_T + 1;

                } else if ("SARUNG".equals(jenis[n])) {
                    S = S + 1;

                } else if ("BAHAN POKOK".equals(jenis[n])) {
                    B_P = B_P + 1;

                } else if ("MAKANAN".equals(jenis[n])) {
                    M = M + 1;

                } else if ("ELEKTRONIK".equals(jenis[n])) {
                    E = E + 1;

                } else if ("BARANG BEKAS".equals(jenis[n])) {
                    B = B + 1;

                } else if ("LAIN-LAIN".equals(jenis[n])) {
                    L_L = L_L + 1;

                }else {
                    JOptionPane.showMessageDialog(null, "Data Jenis Usaha tidak di temukan");

                }
                data += (n + 1) + "    " + toko[n] + "     " + alamat[n] + "       " + pemilik[n] + "      " + jenis[n] + "\n\n";
            }
            G_P = G_P + P;
            G_ST = G_ST + S_T;
            G_S = G_S + S;
            G_BP = G_BP + B_P;
            G_M = G_M + M;
            G_E = G_E + E;
            G_B = G_B + B;
            G_LL = G_LL + L_L;
            data += "===========================================================\n";
            data += "PAKAIAN : " + P + "       " + "SEPATU/TAS : " + S_T + "\n";
            data += "SARUNG : " + S + "       " + "BAHAN POKOK : " + B_P + "\n";
            data += "MAKANAN : " + M + "       " + "ELEKTRONIK : " + E + "\n";
            data += "BARANG BEKAS : " + B + "       " + "LAIN-LAIN : " + L_L + "\n";

            JOptionPane.showMessageDialog(null, data, "LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
            if (t == hal) {
                rekap += "              LAPORAN DATA PEDAGANG\n\n\n";
                rekap += "Tanggal : " + tanggal[0] + "                               Hal: " + (t + 1) + "\n\n";
                rekap += "==========================================\n";
                rekap += "PAKAIAN : " + G_P + "                        " + "SEPATU/TAS : " + G_ST + "\n";
                rekap += "SARUNG : " + G_S + "                          " + "BAHAN POKOK : " + G_BP + "\n";
                rekap += "MAKANAN : " + G_M + "                        " + "ELEKTRONIK : " + G_E + "\n";
                rekap += "BARANG BEKAS : " + G_B + "                  " + "LAIN-LAIN : " + G_LL + "\n";
                JOptionPane.showMessageDialog(null, rekap, "LAPORAN REKAP DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);

            }

            x1 = x1 + 4;
            x2 = x2 + 4;
        }

    }

}
