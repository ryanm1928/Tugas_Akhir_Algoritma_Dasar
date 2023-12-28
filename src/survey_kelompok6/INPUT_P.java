package survey_kelompok6;

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
import static survey_kelompok6.MAIN.tanggal;
import static survey_kelompok6.MAIN.i;
import javax.swing.JOptionPane;

public class INPUT_P {

    public static String tanggal_s, toko_s, alamat_s, pemilik_s, jenis_s, modal_s, penjualan_s, pembeli_s, cabang_s, email_s, sosmed_s, telp_s, status_s, umur_s;
    public static String tampil = "";
    public static int modal_i, umur_i;
    public static boolean putar = true;

    static void input_data() {
        do {
            i = i + 1;
            if (i > 44) {
                JOptionPane.showMessageDialog(null, "Data Sudah Penuh");
                putar = false;
                i =  i - 1;
            } else {
                if (i == 0) {
                    do {
                        tanggal_s = JOptionPane.showInputDialog("Masukan Tanggal");
                        if (tanggal_s == null || "".equals(tanggal_s)) {
                            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                            putar = true;
                        } else {
                            putar = false;

                        }

                    } while (putar);

                }
                do {
                    toko_s = JOptionPane.showInputDialog("NAMA TOKO");
                    if (toko_s == null || "".equals(toko_s)) {
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                        putar = true;

                    } else {
                        putar = false;

                    }

                } while (putar);
                do {
                    alamat_s = JOptionPane.showInputDialog("ALAMAT");
                    if (alamat_s == null || "".equals(alamat_s)) {
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                        putar = true;

                    } else {
                        putar = false;

                    }

                } while (putar);

                do {
                    pemilik_s = JOptionPane.showInputDialog("NAMA PEMILIK");
                    if (pemilik_s == null || "".equals(pemilik_s)) {
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                        putar = true;

                    } else {
                        putar = false;

                    }

                } while (putar);

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
                do {
                    try {
                        modal_s = JOptionPane.showInputDialog("MODAL : ");
                        putar = false;
                        modal_i = Integer.parseInt(modal_s);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                        putar = true;
                    }

                } while (putar);

                String ket2 = "";
                do {
                    penjualan_s = JOptionPane.showInputDialog("PENJUALAN\n\n"
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
                String ket3 = "";
                do {
                    pembeli_s = JOptionPane.showInputDialog("PEMBELI\n\n"
                            + "D. DOMESTIK\n"
                            + "L. LUAR\n"
                            + "C. CAMPURAN");

                    switch (pembeli_s) {
                        case "d":
                        case "D":
                            ket3 = "DOMESTIK";
                            putar = false;
                            break;
                        case "l":
                        case "L":
                            ket3 = "LUAR";
                            putar = false;
                            break;
                        case "c":
                        case "C":
                            putar = false;
                            ket3 = "CAMPURAN";
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = true;
                    }

                } while (putar);

                String ket4 = "";
                do {
                    cabang_s = JOptionPane.showInputDialog("Cabang\n"
                            + "T. TIDAK ADA\n"
                            + "A. ADA");
                    switch (cabang_s) {
                        case "t":
                        case "T":
                            ket4 = "TIDAK ADA";
                            putar = false;
                            break;
                        case "a":
                        case "A":
                            ket4 = "ADA";
                            putar = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                            putar = true;
                    }

                } while (putar);
                do {
                    email_s = JOptionPane.showInputDialog("ALAMAT EMAIL");
                    if (email_s == null || "".equals(email_s)) {
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                        putar = true;

                    } else {
                        putar = false;

                    }

                } while (putar);

                String ket5 = "";
                do {
                    sosmed_s = JOptionPane.showInputDialog("SOSIAL MEDIA\n"
                            + "1.FB\n"
                            + "2.WA\n"
                            + "3.IG\n"
                            + "4.TELEGRAM");
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
                do {
                    telp_s = JOptionPane.showInputDialog("NO TELPON/HP ");
                    if (telp_s == null || "".equals(telp_s)) {
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                        putar = true;

                    } else {
                        putar = false;

                    }

                } while (putar);

                String ket6 = "";
                do {
                    status_s = JOptionPane.showInputDialog("STATUS PEMILIK [NIKAH/BELUM] [N/B]  ");

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
                do {
                    try {
                        umur_s = JOptionPane.showInputDialog("BERAPA UMUR PEDANGAN YANG BEJAGA DI KIOS");
                        umur_i = Integer.parseInt(umur_s);
                        putar = false;

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
                        putar = true;

                    }

                } while (putar);
                tanggal[0] = tanggal_s;
                toko[i] = toko_s;
                alamat[i] = alamat_s;
                pemilik[i] = pemilik_s;
                jenis[i] = ket;
                modal[i] = modal_i;
                penjualan[i] = ket2;
                pembeli[i] = ket3;
                cabang[i] = ket4;
                email[i] = email_s;
                sosmed[i] = ket5;
                telp[i] = telp_s;
                status[i] = ket6;
                umur[i] = umur_i;

                tampil = "";
                tampil += "No : " + (i + 1) + "\n";
                tampil += "Nama Toko : " + toko_s + "\n";
                tampil += "Alamat : " + alamat_s + "\n";
                tampil += "Pemilik : " + pemilik_s + "\n";
                tampil += "Jenis Usaha : " + ket + "\n";
                tampil += "Modal : " + modal_i + "\n";
                tampil += "Penjualan : " + ket2 + "\n";
                tampil += "Pembeli : " + ket3 + "\n";
                tampil += "Cabang : " + ket4 + "\n";
                tampil += "Email : " + email_s + "\n";
                tampil += "Sosial Media : " + ket5 + "\n";
                tampil += "No TELPON / HP : " + telp_s + "\n";
                tampil += "Status Pemilik : " + ket6 + "\n";
                tampil += "Umur Pedangang Yang Berjaga Di Kios : " + umur_i + "\n";

                JOptionPane.showMessageDialog(null, tampil, "Hasil Input Data", JOptionPane.INFORMATION_MESSAGE);
                String lagi = JOptionPane.showInputDialog("Ingin input data lagi? Y/T");
                if ("y".equals(lagi) || "Y".equals(lagi)) {
                    putar = true;

                } else {
                    putar = false;

                }
            }
        } while (putar);

    }

    static void cheats() {
        tanggal[0] = "24 Desember 2024";
        for (int j = 1; j <= 20; j++) {
            i = i + 1;
            switch (j) {
                case 1:
                    toko[i] = "Batik Salma";
                    alamat[i] = "Blok V dalam No 101";
                    pemilik[i] = "Hj Ummi Hanik";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 75000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "email1";
                    sosmed[i] = "WA";
                    telp[i] = "08156934157";
                    status[i] = "NIKAH";
                    umur[i] = 22;
                    break;
                case 2:
                    toko[i] = "Syafasz Batik";
                    alamat[i] = "Blok 3";
                    pemilik[i] = "Umar";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 20000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "LUAR";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "emails2";
                    sosmed[i] = "IG";
                    telp[i] = "082227117598";
                    status[i] = "NIKAH";
                    umur[i] = 17;
                    break;
                case 3:
                    toko[i] = "Takoyaki";
                    alamat[i] = "Blok L";
                    pemilik[i] = "Rini";
                    jenis[i] = "MAKANAN";
                    modal[i] = 5000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "LUAR";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "DLL";
                    telp[i] = "08782636567";
                    status[i] = "NIKAH";
                    umur[i] = 18;

                    break;
                case 4:
                    toko[i] = "Batik Putri Rizki";
                    alamat[i] = "Blok Sejahtera No.10";
                    pemilik[i] = "HJ. Rozaqon";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 40000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "IG";
                    telp[i] = "081229056249";
                    status[i] = "NIKAH";
                    umur[i] = 23;
                    break;
                case 5:
                    toko[i] = "Barasa Batik";
                    alamat[i] = "Blok Sejahtera";
                    pemilik[i] = "Ibu Mila";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 50000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "TELEGRAM";
                    telp[i] = "082324147482";
                    status[i] = "NIKAH";
                    umur[i] = 24;
                    break;
                case 6:
                    toko[i] = "Rumah Batik Fadila";
                    alamat[i] = "Blok Sejahtera";
                    pemilik[i] = "Moh. Thori";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 60000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "085866122022";
                    status[i] = "NIKAH";
                    umur[i] = 35;
                    break;
                case 7:
                    toko[i] = "Batik Kinanti";
                    alamat[i] = "Blok Ekselen";
                    pemilik[i] = "Bapak Rozikin";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 50000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "IG";
                    telp[i] = "085842844021";
                    status[i] = "NIKAH";
                    umur[i] = 32;
                    break;
                case 8:
                    toko[i] = "Batik Hasya";
                    alamat[i] = "Blok L";
                    pemilik[i] = "Soni Hikmatul";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 75000000;
                    penjualan[i] = "DALAM DAN LUAR NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "088226308244";
                    status[i] = "NIKAH";
                    umur[i] = 24;
                    break;
                case 9:
                    toko[i] = "Toko Delima";
                    alamat[i] = "Blok Jlamprang";
                    pemilik[i] = "Munihat";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 50000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "085540442080";
                    status[i] = "NIKAH";
                    umur[i] = 41;
                    break;
                case 10:
                    toko[i] = "Toko Trijaya";
                    alamat[i] = "Blok Jlamprang No.51";
                    pemilik[i] = "Riswanto";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 40000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "082326206366";
                    status[i] = "NIKAH";
                    umur[i] = 69;
                    break;
                case 11:
                    toko[i] = "Budhequ";
                    alamat[i] = "Blok Jlamprang";
                    pemilik[i] = "Mutamimah";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 45000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "085713776069";
                    status[i] = "NIKAH";
                    umur[i] = 20;
                    break;
                case 12:
                    toko[i] = "Toko Ijo Minuman";
                    alamat[i] = "Blok Jlamprang";
                    pemilik[i] = "Bu Etni";
                    jenis[i] = "MAKANAN";
                    modal[i] = 5000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "085867767899";
                    status[i] = "NIKAH";
                    umur[i] = 42;
                    break;
                case 13:
                    toko[i] = "Toko Davina";
                    alamat[i] = "Blok Sejahtera";
                    pemilik[i] = "Bpk. Holidin";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 35000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "081229279274";
                    status[i] = "NIKAH";
                    umur[i] = 19;
                    break;
                case 14:
                    toko[i] = "Putri Barosa";
                    alamat[i] = "Blok 2 No.45";
                    pemilik[i] = "Milatina";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 40000000;
                    penjualan[i] = "DALAM DAN LUAR NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "IG";
                    telp[i] = "082324147482";
                    status[i] = "NIKAH";
                    umur[i] = 34;
                    break;
                case 15:
                    toko[i] = "Batik Wafha";
                    alamat[i] = "Blok 1";
                    pemilik[i] = "Sukma";
                    jenis[i] = "PAKAIAN";
                    modal[i] = 45000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "IG";
                    telp[i] = "08975124100";
                    status[i] = "NIKAH";
                    umur[i] = 32;
                    break;
                case 16:
                    toko[i] = "Bakso Pak Nardi 2";
                    alamat[i] = "Blok Jlamprang";
                    pemilik[i] = "Pak Nardi";
                    jenis[i] = "MAKANAN";
                    modal[i] = 15000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "ADA";
                    email[i] = "-";
                    sosmed[i] = "FB";
                    telp[i] = "085868726659";
                    status[i] = "NIKAH";
                    umur[i] = 36;
                    break;
                case 17:
                    toko[i] = "Rumah Makan Simak";
                    alamat[i] = "No 20";
                    pemilik[i] = "Ibu Erna";
                    jenis[i] = "MAKANAN";
                    modal[i] = 10000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "-";
                    telp[i] = "085729880174";
                    status[i] = "NIKAH";
                    umur[i] = 32;
                    break;
                case 18:
                    toko[i] = "Mie Ayam";
                    alamat[i] = "Blok C";
                    pemilik[i] = "Pak Wardi";
                    jenis[i] = "MAKANAN";
                    modal[i] = 8000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "-";
                    telp[i] = "-";
                    status[i] = "NIKAH";
                    umur[i] = 53;
                    break;
                case 19:
                    toko[i] = "Sop Buah";
                    alamat[i] = "Blok C";
                    pemilik[i] = "Pak Rudi Yanto";
                    jenis[i] = "MAKANAN";
                    modal[i] = 5000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "CAMPURAN";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "085741757420";
                    status[i] = "NIKAH";
                    umur[i] = 45;
                    break;
                case 20:
                    toko[i] = "Toko Vita";
                    alamat[i] = "Blok C";
                    pemilik[i] = "Ibu Novita";
                    jenis[i] = "BAHAN POKOK";
                    modal[i] = 10000000;
                    penjualan[i] = "DALAM NEGERI";
                    pembeli[i] = "DOMESTIK";
                    cabang[i] = "TIDAK ADA";
                    email[i] = "-";
                    sosmed[i] = "WA";
                    telp[i] = "082327371075";
                    status[i] = "NIKAH";
                    umur[i] = 39;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Anda Salah Input Ulangi");
            }
        }
        JOptionPane.showMessageDialog(null, "CHEAT AKTIF \n\n"
                + "[ Cheat Input Data By Ryan ] \n ");

    }

}
