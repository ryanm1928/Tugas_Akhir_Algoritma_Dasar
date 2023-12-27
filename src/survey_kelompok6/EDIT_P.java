package survey_kelompok6;

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

public class EDIT_P {

    public static String toko_s, alamat_s, pemilik_s, jenis_s, modal_s, penjualan_s, pembeli_s, cabang_s, email_s, sosmed_s, telp_s, status_s, umur_s;
    public static int modal_i, umur_i;
    public static String tampil = "", data_s;
    public static int x;
    public static boolean putar = true;

    static void edit_data() {
        do {
            do {
                data_s = JOptionPane.showInputDialog("Silakan Pilih Data Yang Ingin Di Edit [ 1 - " + (i + 1) + " ] ");
                try {
                    x = Integer.parseInt(data_s);
                    putar = false;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                    putar = true;

                }

            } while (putar || (!(x >= 1 && x <= (i + 1))));

            tampil = "";
            tampil += "No : " + x + "\n\n";
            tampil += "Pilih data yang akan di edit :" + "\n";
            tampil += "1.Nama Toko : " + toko[x - 1] + "\n";
            tampil += "2.Alamat : " + alamat[x - 1] + "\n";
            tampil += "3.Pemilik : " + pemilik[x - 1] + "\n";
            tampil += "4.Jenis Usaha : " + jenis[x - 1] + "\n";
            tampil += "5.Modal : " + modal[x - 1] + "\n";
            tampil += "6.Penjualan : " + penjualan[x - 1] + "\n";
            tampil += "7.Pembeli : " + pembeli[x - 1] + "\n";
            tampil += "8.Cabang : " + cabang[x - 1] + "\n";
            tampil += "9.Email : " + email[x - 1] + "\n";
            tampil += "10.Sosial Media : " + sosmed[x - 1] + "\n";
            tampil += "11.No TELPON / HP : " + telp[x - 1] + "\n";
            tampil += "12.Status Pemilik : " + status[x - 1] + "\n";
            tampil += "13.Umur Pedangang Yang Berjaga Di Kios : " + umur[x - 1] + "\n";

            String pilih_s = JOptionPane.showInputDialog(tampil);

            int pilih = Integer.parseInt(pilih_s);

            if (pilih == 1) {
                toko_s = JOptionPane.showInputDialog("[" + toko[x - 1] + "] \nNAMA TOKO");
                toko[x - 1] = toko_s;

            } else if (pilih == 2) {
                alamat_s = JOptionPane.showInputDialog("[" + alamat[x - 1] + "] \nALAMAT");
                alamat[x - 1] = alamat_s;

            } else if (pilih == 3) {
                pemilik_s = JOptionPane.showInputDialog("[" + pemilik[x - 1] + "] \nNAMA PEMILIK");
                pemilik[x - 1] = pemilik_s;

            } else if (pilih == 4) {
                String ket = "";
                do {
                    jenis_s = JOptionPane.showInputDialog("JENIS USAHA\n\n"
                            + "1.Pakaian            2.Sarung \n"
                            + "3.Makanan          4.Sepatu/Tas\n"
                            + "5.Elektronik        6.Barang Bekas\n"
                            + "8.Lain-lain           7.Bahan Pokok\n");

                    switch (jenis_s) {
                        case "1":
                            ket = "PAKAIAN";
                            putar = false;

                            break;
                        case "2":
                            ket = "SARUNG";
                            putar = false;
                            break;
                        case "3":
                            ket = "MAKANAN";
                            putar = false;
                            break;
                        case "4":
                            ket = "SEPATU/TAS";
                            putar = false;
                            break;
                        case "5":
                            ket = "ELEKTRONIK";
                            putar = false;
                            break;
                        case "6":
                            ket = "BARANG BEKAS";
                            putar = false;
                            break;
                        case "7":
                            ket = "BAHAN POKOK";
                            putar = false;
                            break;
                        case "8":
                            ket = "LAIN-LAIN";
                            putar = false;
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = true;

                    }

                } while (putar);
                jenis[x - 1] = ket;

            } else if (pilih == 5) {
                do {
                    try {
                        modal_s = JOptionPane.showInputDialog("[" + modal[x - 1] + "] \nMODAL : ");
                        modal_i = Integer.parseInt(modal_s);
                        putar = false;

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                        putar = true;

                    }

                } while (putar);

                modal[x - 1] = modal_i;

            } else if (pilih == 6) {
                String ket2 = "";
                do {

                    penjualan_s = JOptionPane.showInputDialog("[" + penjualan[x - 1] + "] \nPENJUALAN\n\n"
                            + "D. DALAM NEGERI\n"
                            + "L. LUAR NEGERI\n"
                            + "S. DALAM DAN LUAR NEGERI");

                    switch (penjualan_s) {
                        case "d":
                        case "D":
                            ket2 = "DALAM NEGERI";
                            putar = false;
                            break;
                        case "l":
                        case "L":
                            ket2 = "LUAR NEGERI";
                            putar = false;
                            break;
                        case "s":
                        case "S":
                            ket2 = "DALAM DAN LUAR NEGERI";
                            putar = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = true;
                    }
                } while (putar);
                penjualan[x - 1] = ket2;

            } else if (pilih == 7) {
                String ket3 = "";
                do {
                    putar = true;

                    pembeli_s = JOptionPane.showInputDialog("[" + pembeli[x - 1] + "] \nPEMBELI\n\n"
                            + "D. DOMESTIK\n"
                            + "L. LUAR\n"
                            + "C. CAMPURAN");

                    switch (pembeli_s) {
                        case "d ":
                        case "D":
                            ket3 = "DOMESTIK";
                            putar = true;
                            break;
                        case "l":
                        case "L":
                            ket3 = "LUAR";
                            putar = true;
                            break;
                        case "c":
                        case "C":
                            ket3 = "CAMPURAN";
                            putar = true;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = false;

                    }
                } while (putar);
                pembeli[x - 1] = ket3;
            } else if (pilih == 8) {

                String ket4 = "";
                do {
                    cabang_s = JOptionPane.showInputDialog("[" + cabang[x - 1] + "] \nCabang      T. TIDAK ADA        A.ADA");
                    switch (cabang_s) {
                        case "t":
                        case "T":
                            ket4 = "TIDAK ADA";
                            break;
                        case "a":
                        case "A":
                            ket4 = "ADA";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                    }
                } while (putar);
                cabang[x - 1] = ket4;

            } else if (pilih == 9) {
                email_s = JOptionPane.showInputDialog("[" + email[x - 1] + "] \nALAMAT EMAIL");
                email[x - 1] = email_s;

            } else if (pilih == 10) {
                String ket5 = "";
                do {

                    sosmed_s = JOptionPane.showInputDialog("S[" + sosmed[x - 1] + "] \nOSIAL MEDIA    "
                            + "\n1.FB"
                            + "\n2.WA"
                            + "\n3.IG"
                            + "\n4.TELEGRAM");
                    switch (sosmed_s) {
                        case "1":
                            ket5 = "FB";
                            putar = false;
                            break;
                        case "2":
                            ket5 = "WA";
                            putar = false;
                            break;
                        case "3":
                            ket5 = "IG";
                            putar = false;
                            break;
                        case "4":
                            ket5 = "TELEGRAM";
                            putar = false;
                            break;
                        case "5":
                            ket5 = "DLL";
                            putar = false;
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = true;
                    }
                } while (putar);
                sosmed[x - 1] = ket5;

            } else if (pilih == 11) {
                telp_s = JOptionPane.showInputDialog("[" + telp[x - 1] + "] \nNO TELPON/HP ");
                telp[x - 1] = telp_s;

            } else if (pilih == 12) {
                String ket6 = "";
                do {

                    status_s = JOptionPane.showInputDialog("[" + status[x - 1] + "] \nSTATUS PEMILIK [NIKAH/BELUM] [N/B]  ");

                    switch (status_s) {
                        case "n":
                        case "N":
                            ket6 = "NIKAH";
                            putar = false;
                            break;
                        case "b":
                        case "B":
                            ket6 = "BELUM";
                            putar = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = true;
                    }
                } while (putar);
                status[x - 1] = ket6;

            } else if (pilih == 13) {
                do {

                    try {
                        umur_s = JOptionPane.showInputDialog("[" + umur[x - 1] + "] \nBERAPA UMUR PEDANGAN YANG BEJAGA DI KIOS");
                        umur_i = Integer.parseInt(umur_s);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                        putar = true;
                    }
                } while (putar);

                umur[x - 1] = umur_i;

            } else {
                JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");

            }
            JOptionPane.showMessageDialog(null, "Edit data berhasil");
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
            JOptionPane.showMessageDialog(null, tampil, "Hasil Edit data", JOptionPane.INFORMATION_MESSAGE);
            String lagi = JOptionPane.showInputDialog("Ingin edit lagi? Y/T");
            if ("y".equals(lagi) || "Y".equals(lagi)) {
                putar = true;

            } else {
                putar = false;

            }
        } while (putar);
    }

}
