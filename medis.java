import java.util.Scanner;

public class medis {
    static int hitungPembayaranPeriksa(int jmlUang, int totalBayar) {
        int KembalianPeriksa = totalBayar - jmlUang;
        return KembalianPeriksa;
    }

    static int hitungPembayaranObat(int jmlUangObat, int totalBayarObat) {
        int kembalianObat = totalBayarObat - jmlUangObat;
        return kembalianObat;
    }

    static final int MAX_ATTEMPTS = 3;
    static final String[] username = {"dimas123", "wantod20k", "gwido19"};
    static final String[] password = {"dms12", "wan20k", "gwd19"};

    static String[][] namaDokter = {
        {"dr. Dita Rosita Marsudi Putri", "dr. Novita Wahyu Rahmawaty", "dr. Antonius ardijanto", "dr. Ira Prasasti, MMRS"},
        {"Gwido putra", "Rizwan pratama", "Bayu dimas"}
    };

    static double[][] hargaDokter = {
        {50000, 40000, 35000, 100000},
        {150000, 200000, 500000}
    };

    static String[] namaObat = {"Grathazon", "Paratusin", "Inamid", "Promaag", "Panadol", "Paracetamol", "Decolgen", "Ambeven", "Cataflam", "OBH"};
    static double[] hargaObat = {10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 95000, 30000};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Keluhan = {"Radang", "Flu", "Sakit perut", "Maag", "Pusing", "Demam", "Pilek", "Wasir", "Sakit gigi", "Batuk"};

        String radang = "radang", flu = "flu", sakitPerut = "Sakit Perut", maag = "Maag", pusing = "Pusing", demam = "demam", pilek = "pilek", wasir = "Wasir", sakitGigi = "Sakit Gigi", batuk = "Batuk";

        String keluhan, TanggalPeriksa, asalKota, Nama;

        int menu, member, attempts = 0;

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("--- Selamat Datang di Platfrom Klinik sederhana ---");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        System.out.println("apakah anda memiliki membership");
        System.out.println("1. iyaa ");
        System.out.println("2. tidak ");
        System.out.print("pilih (1/2) : ");
        member = sc.nextInt();
        sc.nextLine(); 

        if (member == 1) {
            member(sc);
        } else if (member == 2) { 
            System.out.println("Silakan masukkan biodata:");
            System.out.print("Nama: ");
            String nama = sc.nextLine();
        
            System.out.print("Tanggal Periksa: ");
            String tanggalPeriksa = sc.nextLine();
        }
    
        System.out.println("Menu : ");
        System.out.println("1. Periksa/Konsultasi");
        System.out.println("2. Beli Obat");
        System.out.println("Masukkan pilihan (1/2)");
        menu = sc.nextInt();
        
        if (menu == 1) {
            int dokterIndex = menu - 1;
            periksa(dokterIndex); 
        } else if (menu == 2) {
            bobat();
        }


    }

    public static void periksa(int dokterIndex) {
        for (int i = 0; i < namaDokter[dokterIndex].length; i++) {
            System.out.println(i + 1 + ". " + namaDokter[dokterIndex][i] + " - Rp" + hargaDokter[dokterIndex][i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih dokter checkup: ");
        int pilihDokter = sc.nextInt();

        if (pilihDokter >= 1 && pilihDokter <= namaDokter[dokterIndex].length) {
            double harga = hargaDokter[dokterIndex][pilihDokter - 1];
            System.out.println("Anda memilih: " + namaDokter[dokterIndex][pilihDokter - 1]);
            System.out.println("Harga: Rp" + harga);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    static void bobat() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "\nPilih obat yang anda ingin beli: ");
        for (int i = 0; i < namaObat.length; i++) {
            System.out.println(i + 1 + ". " + namaObat[i] + " - Rp" + hargaObat[i]);
        }
        int obatIndex = sc.nextInt();
        if (obatIndex >= 1 && obatIndex <= namaObat.length) {
            double harga = hargaObat[obatIndex - 1];
            System.out.println("Anda memilih: " + namaObat[obatIndex - 1]);
            System.out.println("Harga: Rp" + harga);
        }    
            System.out.println("Tambah obat yang ingin dibeli? (y/t)");
            if (sc.next().equalsIgnoreCase("t")) {
            }
        }
    

    static int member(Scanner sc) {
        int userIndex = -1;
        int attempts; 

        for (attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
            System.out.print("Masukkan username: ");
            String enteredUsername = sc.nextLine();
            System.out.print("Masukkan password: ");
            String enteredPassword = sc.nextLine();

            for (int i = 0; i < username.length; i++) {
                if (username[i].equals(enteredUsername) && password[i].equals(enteredPassword)) {
                    userIndex = i;
                    System.out.println("Login berhasil. Selamat datang pasien " + enteredUsername);
                    return userIndex;
                }
            }

            System.out.print("\nUsername atau password salah. ");
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Anda salah login 3 kali, harap restart aplikasi");
                System.exit(0);
            }
            System.out.println("Coba lagi.\n");
        }

        return userIndex;
    }

    static int menu (int menu) {
    return menu;
        }
}