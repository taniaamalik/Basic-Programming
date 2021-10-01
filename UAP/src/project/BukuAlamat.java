package project;



import java.util.Scanner;

public class BukuAlamat {

    static int pil, x = 0;
    static String input;
    static String data[][] = new String[200][5];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n--------------Buku Alamat-------------");
            System.out.println("| 1. Menambahkan Data                |");
            System.out.println("| 2. Mengedit Data                   |");
            System.out.println("| 3. Menghapus Data                  |");
            System.out.println("| 4. Menampilkan Data                |");
            System.out.println("| 5. Mencari Data                    |");
            System.out.println("| 6. Keluar                          |");
            System.out.println("--------------------------------------\n");
            System.out.print("Masukkan pilihan anda : ");
            pil = in.nextInt();
            switch (pil) {
                case 1:
                    do {
                        System.out.println("------Menambahkan Data------");
                        inputdata(x);
                        System.out.println("----------------------------");
                        x++;
                        System.out.println("Masukkan data lagi? [y][t]");
                        input = in.next();
                    } while (input.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("Edit data :");
                    System.out.println("1. Edit berdasarkan nama");
                    System.out.println("2. Edit berdasarkan no hp");
                    System.out.println("Masukkan pilihan anda : ");
                    int p = in.nextInt();
                    switch (p) {
                        case 1:
                            System.out.print("Masukkan nama : ");
                            String nama = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][0] != null) {
                                    if (data[i][0].equalsIgnoreCase(nama)) {
                                        caridata(i);
                                        System.out.println("Data baru : ");
                                        inputdata(i);
                                        break;
                                    }
                                    }else {
                                        System.out.println("DATA TIDAK DITEMUKAN");
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan no hp : ");
                            String no = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][1] != null) {
                                    if (data[i][1].equalsIgnoreCase(no)) {
                                        caridata(i);
                                        System.out.println("Data baru : ");
                                        inputdata(i);
                                        break;
                                    } 
                                    }else {
                                        System.out.println("DATA TIDAK DITEMUKAN");
                                }
                            }
                            break;
                        default:
                            System.out.println("Masukkan pilihan dengan benar!");
                    }

                    break;
                case 3:
                    System.out.println("Hapus data :");
                    System.out.println("1. Hapus berdasarkan nama");
                    System.out.println("2. Hapus berdasarkan no hp");
                    System.out.println("Masukkan pilihan anda : ");
                    int n = in.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("Masukkan nama : ");
                            String nama = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][0] != null) {
                                    if (data[i][0].equalsIgnoreCase(nama)) {
                                        hapusdata(x, i);
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan no hp : ");
                            String no = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][1] != null) {
                                    if (data[i][1].equalsIgnoreCase(no)) {
                                        hapusdata(x, i);
                                    }
                                }
                            }
                            break;
                        default:
                            System.out.println("Masukkan pilihan dengan benar!");
                    }
                    break;
                case 4:
                    System.out.println("Tampilkan data :");
                    System.out.println("1. Tampilkan semua data");
                    System.out.println("2. Tampilkan berdasarkan nama");
                    System.out.println("3. Tampilkan berdasarkan no hp");
                    System.out.println("Masukkan pilihan anda : ");
                    n = in.nextInt();
                    switch (n) {
                        case 1:
                            System.out.printf("%-30s %-30s %-30s %-30s %-30s", "NAMA", "NO HP", "ALAMAT", "KODE POS", "EMAIL");
                            for (int i = 0; i < x; i++) {
                                if (data[i][0] != null && data[i][1] != null && data[i][2] != null && data[i][3] != null && data[i][4] != null) {
                                    System.out.printf("\n%-30s %-30s %-30s %-30s %-30s", data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan nama : ");
                            String nama = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][0] != null) {
                                    if (data[i][0].equalsIgnoreCase(nama)) {
                                        penampildata(i);
                                        break;
                                    }
                                    } else {
                                        System.out.println("DATA TIDAK DITEMUKAN");
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Masukkan no hp : ");
                            String no = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][1] != null) {
                                    if (data[i][1].equalsIgnoreCase(no)) {
                                        penampildata(i);
                                        break;
                                    } 
                                    }else {
                                        System.out.println("DATA TIDAK DITEMUKAN");
                                }
                            }
                            break;
                        default:
                            System.out.println("Masukkan pilihan dengan benar!");
                    }

                    break;
                case 5:
                    System.out.println("Cari data :");
                    System.out.println("1. Cari berdasarkan nama");
                    System.out.println("2. Cari berdasarkan no hp");
                    System.out.println("Masukkan pilihan anda : ");
                    n = in.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("Masukkan nama : ");
                            String nama = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][0] != null) {
                                    if (data[i][0].equalsIgnoreCase(nama)) {
                                        caridata(i);
                                        break;
                                    } 
                                    }else {
                                        System.out.println("DATA TIDAK DITEMUKAN");
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan no hp : ");
                            String no = in.next();
                            for (int i = 0; i <= x; i++) {
                                if (data[i][1] != null) {
                                    if (data[i][1].equalsIgnoreCase(no)) {
                                        caridata(i);
                                        break;
                                    } 
                                    }else {
                                        System.out.println("DATA TIDAK DITEMUKAN");
                                }
                            }
                            break;
                        default:
                            System.out.println("Masukkan pilihan dengan benar!");
                            break;
                    }
            }
        } while (pil != 6);
    }

    public static void inputdata(int x) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama       : ");
        data[x][0] = in.next();
        System.out.print("Masukkan No Hp      : ");
        data[x][1] = in.next();
        System.out.print("Masukkan Alamat     : ");
        data[x][2] = in.next();
        System.out.print("Masukkan Kode Pos   : ");
        data[x][3] = in.next();
        System.out.print("Masukkan Email      : ");
        data[x][4] = in.next();
    }
    public static void hapusdata(int x, int i){
        Scanner in = new Scanner (System.in);
        System.out.println("HASIL PENCARIAN");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s\n", "NAMA", "NO HP", "ALAMAT", "KODE POS", "EMAIL");
        System.out.printf("\n%-30s %-30s %-30s %-30s %-30s\n", data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
        System.out.println("Yakin mau menghapus data? [y][t]");
        String op = in.next();
        if (op.equalsIgnoreCase("y")) {
            for (int j = i; j <= x; j++) {
                for (int k = 0; k < 5; k++) {
                    data[j][k] = data[j + 1][k];
                }
            }
        }
    }
    public static void penampildata(int i){
        System.out.println("Nama     : " + data[i][0]);
        System.out.println("No Hp    : " + data[i][1]);
        System.out.println("Alamat   : " + data[i][2]);
        System.out.println("Kode Pos : " + data[i][3]);
        System.out.println("Email    : " + data[i][4]);
    }
    public static void caridata(int i){
        System.out.println("HASIL PENCARIAN");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s\n", "NAMA", "NO HP", "ALAMAT", "KODE POS", "EMAIL");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s\n", data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]);
    }
}