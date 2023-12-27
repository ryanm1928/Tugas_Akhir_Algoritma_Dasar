package survey_kelompok6;

import javax.swing.*;
import static survey_kelompok6.MAIN.toko;
import static survey_kelompok6.MAIN.i;
import static survey_kelompok6.MAIN.sosmed;
import static survey_kelompok6.MAIN.email;
import static survey_kelompok6.MAIN.telp;
import static survey_kelompok6.MAIN.tanggal;
import static survey_kelompok6.MAIN.alamat;
import static survey_kelompok6.MAIN.pemilik;
import static survey_kelompok6.MAIN.status;
import static survey_kelompok6.MAIN.modal;

public class LAP_ALAMAT {

    public static int hal = 0, jumlah_d = 0, sisa = 0, x1 = 0, x2 = 0;
    public static String data = "", rekap = "";
    public static int FB, WA, IG, TL, DLL, tot_email, tot_telp, g_telp, g_email;
    public static int G_FB, G_WA, G_IG, G_TL, G_DLL, tot_k, j = -1;

    static void lap_alamat() {
        G_FB = 0;
        G_WA = 0;
        G_IG = 0;
        G_TL = 0;
        G_DLL = 0;
        g_email = 0;
        g_telp = 0;
        jumlah_d = (i + 1);
        sisa = jumlah_d % 6;
        if (sisa == 0) {
            hal = jumlah_d / 6; //untuk data kelipatan 3
        } else {
            hal = (jumlah_d / 6) + 1; // untuk data bukan kelipatan 3
        }
        if (hal == 1) {
            x1 = 0;
            x2 = jumlah_d;
        } else {
            x1 = 0;
            x2 = 6;
        }

        rekap = "";
        for (int t = 1; t <= hal; t = t + 1) {
            if (t == hal) {
                x2 = jumlah_d; //untuk hal terakhir
            }
            data = "";
            FB = 0;
            WA = 0;
            IG = 0;
            TL = 0;
            DLL = 0;
            tot_email = 0;
            tot_telp = 0;
            data += "                                 LAPORAN ALAMAT USAHA\n";
            data += "HAL : " + t + "                                                            TANGGAL : " + tanggal[0] + "\n\n";
            data += "==========================================================================\n";
            data += "NO  |   NAMA TOKO   |  MEDIA SOSIAL  |  EMAIL  |     TELEPON/HP    |\n";
            data += "==========================================================================\n";

            for (int n = x1; n < x2; n = n + 1) {
                if (!("-".equals(email[n]))) {
                    tot_email = tot_email + 1;

                }

                if (!("-".equals(telp[n]))) {
                    tot_telp = tot_telp + 1;

                }

                if ("FB".equals(sosmed[n])) {
                    FB = FB + 1;

                } else if ("WA".equals(sosmed[n])) {
                    WA = WA + 1;

                } else if ("IG".equals(sosmed[n])) {
                    IG = IG + 1;

                } else if ("TELEGRAM".equals(sosmed[n])) {
                    TL = TL + 1;

                } else if ("DLL".equals(sosmed[n])) {
                    DLL = DLL + 1;

                }

                data += (n + 1) + "      " + toko[n] + "          " + sosmed[n] + "          " + email[n] + "          " + telp[n] + "\n\n";
            }
            data += "===================================================================\n";
            data += "JUMLAH TOKO YANG MEMILIKI EMAIL  : " + tot_email + "\n\n";
            data += "JUMLAH TOKO YANG MEMILIKI TELPON : " + tot_telp + "\n\n";
            data += "FB = " + FB + "    " + "WA = " + WA + "    " + "IG = " + IG + "    " + "TELEGRAM = " + TL + "     " + "DLL = " + DLL + "\n";
            JOptionPane.showMessageDialog(null, data, " LAPORAN ALAMAT USAHA ", JOptionPane.INFORMATION_MESSAGE);
            G_FB = G_FB + FB;
            G_WA = G_WA + WA;
            G_IG = G_IG + IG;
            G_TL = G_TL + TL;
            G_DLL = G_DLL + DLL;
            g_email = g_email + tot_email;
            g_telp = g_telp + tot_telp;
            if (t == hal) {
                rekap += "                                 LAPORAN REKAP ALAMAT USAHA\n";
                rekap += "HAL : " + t + "                            TANGGAL : " + tanggal[0] + "\n\n";
                rekap += "===================================================================\n";
                rekap += "TOTAL KESELURUHAN EMAIL = " + g_email + "     " + "TELEPON = " + g_telp + "\n\n";
                rekap += "TOTAL MEDIA SOSIAL :\n";
                rekap += "FB = " + G_FB + "     " + "WA = " + G_WA + "       " + "IG = " + G_IG + "     " + "TELEGRAM = " + G_TL + "        " + "DLL = " + G_DLL + "\n\n";
                rekap += "===================================================================\n";
                JOptionPane.showMessageDialog(null, rekap, "LAPORAN REKAP ALAMAT USAHA", JOptionPane.INFORMATION_MESSAGE);

            }
            x1 = x1 + 6;
            x2 = x2 + 6;
        }
    }

    static void lap_alamat2() {
        j = -1;
        jumlah_d = (i + 1);
        sisa = jumlah_d % 6;
        if (sisa == 0) {
            hal = jumlah_d / 6; //untuk data kelipatan 3
        } else {
            hal = (jumlah_d / 6) + 1; // untuk data bukan kelipatan 3
        }
        if (hal == 1) {
            x1 = 0;
            x2 = jumlah_d;
        } else {
            x1 = 0;
            x2 = 6;
        }

        for (int t = 1; t <= hal; t = t + 1) {
            if (t == hal) {
                x2 = jumlah_d; //untuk hal terakhir
            }
            if (t % 2 == 0) {
                x1 = 0;
                x2 = 4;

            } else {
                x1 = 0;
                x2 = 6;
            }
            data = "";
            tot_k = 0;
            data += "                                 LAPORAN ALAMAT USAHA DI GROSIR SETONO\n"
                    + "                                 PEKALONGAN BULAN DESEBER TAHUN 2023 \n";
            data += "HAL : " + t + "\n";
            data += "-------------------------------------------------------------------------------------------------------------------\n";
            data += "NO  |   NAMA TOKO   |  ALAMAT  |  NAMA PEMILIK  |    STATUS    |\n";
            data += "-------------------------------------------------------------------------------------------------------------------\n";

            for (int n = x1; n < x2; n = n + 1) {
                j = j + 1;
                data += (j + 1) + "      " + toko[j] + "          " + alamat[j] + "          " + pemilik[j] + "          " + status[j] + "\n\n";
                tot_k = tot_k + modal[j];
            }
            data += "-------------------------------------------------------------------------------------------------------------------\n";
            data += "TOTAL KESELUHAN MODAL  : " + tot_k + "                                     [ TEKAN ENTER UNTUK LANJUT ]";
            JOptionPane.showMessageDialog(null, data, " LAPORAN ALAMAT USAHA ", JOptionPane.INFORMATION_MESSAGE);

            x1 = x1 + 6;
            x2 = x2 + 4;
        }

    }

}
