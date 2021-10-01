package project;

import java.util.Scanner;

public class PesanHotel {

    static Scanner in = new Scanner(System.in);

    static String Standard[][] = new String[11][8];
    static String Deluxe[][] = new String[6][8];
    static String nama, ID, alamat, NoTlp, JenisKamar, NomorKamar, lamainap, total1;
    static int lamainap1, total;

    public static void main(String[] args) {

        Standard[0][0] = "Nama";
        Standard[0][1] = "No Identitas";
        Standard[0][2] = "Alamat";
        Standard[0][3] = "No Telepon";
        Standard[0][4] = "Jenis Kamar";
        Standard[0][5] = "Nomor Kamar";
        Standard[0][6] = "Lama Inap";
        Standard[0][7] = "Total Bayar";

        Deluxe[0][0] = "Nama";
        Deluxe[0][1] = "No Identitas";
        Deluxe[0][2] = "Alamat";
        Deluxe[0][3] = "No Telepon";
        Deluxe[0][4] = "Jenis Kamar";
        Deluxe[0][5] = "Nomor Kamar";
        Deluxe[0][6] = "Lama Inap";
        Deluxe[0][7] = "Total Bayar";

        System.out.println("==============================");
        System.out.println("SELAMAT DATANG");
        System.out.println("==============================");
        System.out.println("Menu :");
        System.out.println("1 Pesan Kamar");
        System.out.println("2 Lihat Pesanan");
        System.out.println("3 Lihat Daftar Kamar");
        System.out.println("4 Keluar");
        System.out.print("Silahkan Pilih Menu:");
        int pilih = in.nextInt();

        boolean pilihan = true;
        if (pilih == 4) {
            pilihan = false;
        }

        while (pilihan) {
            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.print("Nama \t\t\t:");
                    in.nextLine();
                    nama = in.nextLine();
                    System.out.print("No Indetitas \t\t:");
                    ID = in.nextLine();
                    System.out.print("Alamat \t\t\t:");
                    alamat = in.nextLine();
                    System.out.print("No Telepon \t\t:");
                    NoTlp = in.nextLine();
                    System.out.print("Pilih Jenis Kamar \t:");
                    JenisKamar = in.nextLine();
                    System.out.print("Pilih Nomor Kamar \t:");
                    NomorKamar = in.nextLine();
                    System.out.print("Lama Inap (Malam) \t:");
                    lamainap = in.nextLine();

                    switch (JenisKamar) {
                        case "Standard":
                            switch (NomorKamar) {
                                case "1":
                                    inputKamarStandard(1);
                                    break;
                                case "2":
                                    inputKamarStandard(2);
                                    break;
                                case "3":
                                    inputKamarStandard(3);
                                    break;
                                case "4":
                                    inputKamarStandard(4);
                                    break;
                                case "5":
                                   inputKamarStandard(5);
                                    break;
                                case "6":
                                    inputKamarStandard(6);
                                    break;
                                case "7":
                                    inputKamarStandard(7);
                                    break;
                                case "8":
                                    inputKamarStandard(8);
                                    break;
                                case "9":
                                    inputKamarStandard(9);
                                    break;
                                case "10":
                                    inputKamarStandard(10);
                                    break;
                                default:
                                    System.out.println("Terjadi Kesalahan Silahkan Coba Lagi");
                                    break;
                            }
                            break;

                        case "Deluxe":
                            switch (NomorKamar) {
                                case "1":
                                    inputKamarDeluxe(1);
                                    break;
                                case "2":
                                    inputKamarDeluxe(2);
                                    break;
                                case "3":
                                    inputKamarDeluxe(3);
                                    break;
                                case "4":
                                    inputKamarDeluxe(4);
                                    break;
                                case "5":
                                    inputKamarDeluxe(5);
                                    break;
                                default:
                                    System.out.println("Terjadi Kesalahan Silahkan Coba Lagi");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Terjadi Kesalahan Silahkan Coba Lagi");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Jenis Kamar \t\t:");
                    JenisKamar = in.next();
                    System.out.print("Nomor Kamar \t\t:");
                    NomorKamar = in.next();
                    switch (JenisKamar) {
                        case "Standard":
                            switch (NomorKamar) {
                                case "1":
                                    menampilkanKamarStandard(1);
                                    break;
                                case "2":
                                    menampilkanKamarStandard(2);
                                    break;
                                case "3":
                                    menampilkanKamarStandard(3);
                                    break;
                                case "4":
                                    menampilkanKamarStandard(4);
                                    break;
                                case "5":
                                    menampilkanKamarStandard(5);
                                    break;
                                case "6":
                                    menampilkanKamarStandard(6);
                                    break;
                                case "7":
                                    menampilkanKamarStandard(7);
                                    break;
                                case "8":
                                    menampilkanKamarStandard(8);
                                    break;
                                case "9":
                                    menampilkanKamarStandard(9);
                                    break;
                                case "10":
                                    menampilkanKamarStandard(10);
                                    break;
                                default:
                                    System.out.println("Terjadi Kesalahan Silahkan Coba Lagi");
                                    break;
                            }
                            break;

                        case "Deluxe":
                            switch (NomorKamar) {
                                case "1":
                                    menampilkanKamarDeluxe(1);
                                    break;
                                case "2":
                                    menampilkanKamarDeluxe(2);
                                    break;
                                case "3":
                                    menampilkanKamarDeluxe(3);
                                    break;
                                case "4":
                                    menampilkanKamarDeluxe(4);
                                    break;
                                case "5":
                                    menampilkanKamarDeluxe(5);
                                    break;
                                default:
                                    System.out.println("Terjadi Kesalahan Silahkan Coba Lagi");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Terjadi Kesalahan Silahkan Coba Lagi");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Daftar Kamar :");
                    for (int i = 1; i < 11; i++) {
                        if (Standard[i][0] == null) {
                            System.out.println("Kamar Standart nomor " + i + "(Kosong)");
                        }
                        if (Standard[i][0] != null) {
                            System.out.println("Kamar Standart nomor " + i + " Terpakai" + "  Atas nama :" + Standard[i][0]);
                        }

                    }
                    System.out.println();
                    for (int i = 1; i < 6; i++) {
                        if (Deluxe[i][0] == null) {
                            System.out.println("Kamar Deluxe nomor " + i + "(Kosong)");
                        }
                        if (Deluxe[i][0] != null) {
                            System.out.println("Kamar Deluxe nomor " + i + " Terpakai" + " Atas nama :" + Deluxe[i][0]);

                        }
                    }
                    break;

                case 4:
                    System.out.println();
                    break;

                default:
                    System.out.println("Maaf Pilihan Anda Tidak Ditemukan");
                    break;
            }

            System.out.println();
            System.out.println("Menu:");
            System.out.println("1 Pesan Kamar");
            System.out.println("2 Lihat Pesanan");
            System.out.println("3 Lihat Daftar Kamar");
            System.out.println("4 Keluar");
            System.out.print("Silahkan Pilih Menu:");
            pilih = in.nextInt();
            System.out.println();

            if (pilih == 4) {
                pilihan = false;
            }

        }
    }

    public static void inputKamarStandard(int x) {
        if (Standard[x][0] == null) {
            Standard[x][0] = nama;
            Standard[x][1] = ID;
            Standard[x][2] = alamat;
            Standard[x][3] = NoTlp;
            Standard[x][4] = JenisKamar;
            Standard[x][5] = NomorKamar;
            Standard[x][6] = lamainap;
            lamainap1 = Integer.parseInt(Standard[x][6]);
            total = lamainap1 * 1000000;
            total1 = Integer.toString(total);
            Standard[x][7] = total1;
            System.out.println("Selamat Pesanan Anda Berhasil");
        } else {
            System.out.println("Kamar Sudah Dipesan, Silahkan Pilih Kamar Lain");
        }
    }

    public static void inputKamarDeluxe(int x) {
        if (Deluxe[x][0] == null) {
            Deluxe[x][0] = nama;
            Deluxe[x][1] = ID;
            Deluxe[x][2] = alamat;
            Deluxe[x][3] = NoTlp;
            Deluxe[x][4] = JenisKamar;
            Deluxe[x][5] = NomorKamar;
            Deluxe[x][6] = lamainap;
            lamainap1 = Integer.parseInt(Deluxe[x][6]);
            total = lamainap1 * 3000000;
            total1 = Integer.toString(total);
            Deluxe[x][7] = total1;
            System.out.println("Selamat Pesanan Anda Berhasil");
        } else {
            System.out.println("Kamar Sudah Dipesan, Silahkan Pilih Kamar Lain");
        }

    }

    public static void menampilkanKamarStandard(int x) {
        if (Standard[x][0] == null) {
            System.out.println("Belum Ada Pesanan Untuk Kamar Ini");
        } else {
            System.out.println("Nama \t\t\t:" + Standard[x][0]);
            System.out.println("Nomor Identitas \t:" + Standard[x][1]);
            System.out.println("Alamat \t\t\t:" + Standard[x][2]);
            System.out.println("Nomor Telepon \t\t:" + Standard[x][3]);
            System.out.println("Jenis Kamar \t\t:" + Standard[x][4]);
            System.out.println("Nomor Kamar \t\t:" + Standard[x][5]);
            System.out.println("Nomor Kunci \t\t:S-0" + x);
            System.out.println("Lama Inap \t\t:" + Standard[x][6] + " Malam");
            System.out.println("Total Bayar \t\t:Rp " + Standard[x][7]);

        }
    }

    public static void menampilkanKamarDeluxe(int x) {
        if (Deluxe[x][0] == null) {
            System.out.println("Belum Ada Pesanan Untuk Kamar Ini");
        } else {
            System.out.println("Nama \t\t\t:" + Deluxe[x][0]);
            System.out.println("Nomor Identitas \t:" + Deluxe[x][1]);
            System.out.println("Alamat \t\t\t:" + Deluxe[x][2]);
            System.out.println("Nomor Telepon \t\t:" + Deluxe[x][3]);
            System.out.println("Jenis Kamar \t\t:" + Deluxe[x][4]);
            System.out.println("Nomor Kamar \t\t:" + Deluxe[x][5]);
            System.out.println("Kunci Kamar \t\t:D-0" + x);
            System.out.println("Lama Inap \t\t:" + Deluxe[x][6] + " Malam");
            System.out.println("Total Bayar \t\t:Rp " + Deluxe[x][7]);
        }
    }

}
