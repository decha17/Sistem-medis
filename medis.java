import java.util.Scanner;

public class medis {
    static double hitungKembalianPeriksa(double hargaBayar, boolean isMember) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        double kembalian = 0;
        if (isMember) {
            hargaBayar = hargaBayar * 0.7;
            System.out.println("Anda adalah member, mendapatkan diskon 30%");
        }
        System.out.println("Total Harga yang Harus anda Bayar adalah : " + hargaBayar);
        System.out.print("Masukan Jumlah uang : ");
        double jmlUangPeriksa = sc.nextDouble();
        kembalian = jmlUangPeriksa - hargaBayar;
        return kembalian;
    }

    static double hitungKembalianObat(double totalHarga, boolean isMember) {
        Scanner sc = new Scanner(System.in);
        double kembaliObat = 0;
        if (isMember) {
            totalHarga = totalHarga * 0.7;
            System.out.println("Anda adalah member, mendapatkan diskon 30%");
        }
        System.out.println("Total Harga yang Harus anda Bayar adalah : " + totalHarga);
        System.out.print("Masukan Jumlah uang : ");
        double jmlUangObat = sc.nextDouble();
        kembaliObat = jmlUangObat - totalHarga;
        return kembaliObat;
    }


    static final int MAX_ATTEMPTS = 3;
    static final String[] username = {"dimas123", "wantod20k", "gwido19"};
    static final String[] password = {"dms12", "wan20k", "gwd19"};
    private static final boolean isMember = false;

    static String[][] namaDokter = {
        {"dr. Dita Rosita Marsudi Putri", "dr. Novita Wahyu Rahmawaty", "dr. Antonius ardijanto", "dr. Ira Prasasti, MMRS"},
        {"Gwido putra", "Rizwan pratama", "Bayu dimas"}
    };

    static double[][] hargaDokter = {
        {50000, 40000, 35000, 100000},
        {150000, 200000, 500000}
    };

    static String[] Keluhan = {"Radang", "Flu", "diare", "Maag", "Pusing", "Demam", "Pilek", "Wasir", "Sakit gigi", "Batuk","Masuk Angin"  };
    static String[] namaObat = {"Grathazon", "Paratusin", "Inamid", "Promaag", "Panadol", "Paracetamol", "Decolgen", "Ambeven", "Cataflam", "OBH combi", "Enzyplex" };
    static double[] hargaObat = {10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 95000, 30000, 10000};
    static String[] riwayatObat = new String[100];
    static String[] riwayatPeriksa = new String[100];
    static int jumlahRiwayatObat = 0;



    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in);
        String keluhan, TanggalPeriksa, Nama;

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

        boolean isMember = member == 1;

        if (isMember) {
            member(sc);
        } else if (member == 2) { 
            System.out.println("Silakan masukkan biodata:");
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Domisili: ");
            String domSil = sc.nextLine();
            System.out.println("");
        }
        while (true) {
    
        
        
        System.out.println("");  
        System.out.println("Menu : ");
        System.out.println("1. Periksa/Konsultasi");
        System.out.println("2. Beli Obat");
        System.out.println("3. Informasi penyakit dengan obat dan harganya");
        System.out.println("4. Tampilkan riwayat periksa dan riwayat pembelian obat");
        System.out.println("Masukkan pilihan (1/2/3/4)");   
        menu = sc.nextInt();
        System.out.println("");
        
        if (menu == 1) {
            int dokterIndex = menu - 1;
            double hargaBayar = periksa(dokterIndex);
            double kembalianPeriksa = hitungKembalianPeriksa(hargaBayar, isMember);
            System.out.println("Kembalian anda : " + kembalianPeriksa);
        }  else if (menu == 2) {
            double totalHarga = bobat(sc);
            double kembaliObat = hitungKembalianObat(totalHarga, isMember);
            System.out.println("Kembalian anda : " + kembaliObat);
        } else if (menu == 3) {
            informasi(sc);
        } else if (menu == 4) {
            tampilkanRiwayatPeriksa();
            tampilkanRiwayatPembelianObat();
        } else if (menu == 5) {
            System.out.println("Anda telah keluar dari program");
        }
        System.out.print("Apakah anda ingin kembali ke menu utama : ");
        System.out.println("(Y/T)");
        if (sc.next().equalsIgnoreCase("t")) {
            break;
        } 
        }
    }

    
    public static double periksa(int dokterIndex) {
        Scanner sc = new Scanner(System.in);
        String diagnosa , saranObat;
        double hargaBayar = 0;
        System.out.println("Jenis dokter : ");
        System.out.println("1. Dokter umum");
        System.out.println("2. Dokter Spesialis");
        System.out.print("Masukkan Pilihan jenis dokter yang ingin Anda pilih : ");
        int pilihJenisDokter = sc.nextInt();
        System.out.println("");

        if (pilihJenisDokter == 1 || pilihJenisDokter == 2) {
            // Menggunakan indeks yang sesuai dengan pilihan jenis dokter
            int arrayIndex = pilihJenisDokter - 1;
    
            for (int i = 0; i < namaDokter[arrayIndex].length; i++) {
                System.out.println(i + 1 + ". " + namaDokter[arrayIndex][i] + " - Rp" + hargaDokter[arrayIndex][i]);
            }
    
            System.out.print("Pilih dokter checkup: ");
            int pilihDokter = sc.nextInt();
            System.out.println("");
            System.out.println("Masukkan keluhan anda: ");
            String keluhan = sc.next();
            System.out.println("");
            System.out.println("Masukkan tanggal periksa: ");
            String tangPer = sc.next();
            System.out.println("");

    
            if (pilihDokter >= 1 && pilihDokter <= namaDokter[arrayIndex].length) {
                hargaBayar = hargaDokter[arrayIndex][pilihDokter - 1];
                System.out.println("Anda memilih: " + namaDokter[arrayIndex][pilihDokter - 1]);
                System.out.println("Harga: Rp" + hargaBayar);
                System.out.println("Periksa pada tanggal: " + tangPer);
                diagnosa = deteksiPenyakit(keluhan);
                saranObat = beriSaranObat(deteksiPenyakit(keluhan));
                System.out.println("Sakit yang anda alami adalah : " + diagnosa );
                System.out.println("Obat yang disarankan oleh dokter adalah : " + saranObat);
                System.out.println("Silahkan anda beli obat yang kami sarankan di apotek Polinema");
                
                String infoPeriksa = "Dokter: " + namaDokter[arrayIndex][pilihDokter - 1] +
                                     ", Harga: Rp" + hargaBayar +
                                     ", Tanggal Periksa: " + tangPer +
                                     ", Diagnosa: " + diagnosa +
                                     ", Saran Obat: " + saranObat;
            for (int i = 0; i < riwayatPeriksa.length; i++) {
            if (riwayatPeriksa[i] == null) {
                riwayatPeriksa[i] = infoPeriksa;
                break;
            }
        }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } else {
            System.out.println("Pilihan jenis dokter tidak valid.");
        }
        
        return hargaBayar;
    }
    static String deteksiPenyakit(String keluhan) {
        if (keluhan.equalsIgnoreCase("sakitTenggorokan")) {
            return "radang";
        } else if (keluhan.equalsIgnoreCase("sakitPerut")) {
            return "Masuk angin";
        } else if (keluhan.equalsIgnoreCase("pusing")) {
            return "Migrain";
        } else if (keluhan.equalsIgnoreCase("pilek")) {
            return "flu";
        } else if (keluhan.equalsIgnoreCase("gusiBengkak")) {
            return "sakitGigi";
        } else {
            return "Penyakit tidak diketahui";
        }
    }

    static String beriSaranObat(String penyakit) {
        switch (penyakit.toLowerCase()) {
            case "radang":
                return "gratazon";
            case "masuk angin":
                return "enzyplex";
            case "migrain":
                return "panadol + paracetamol";
            case "flu" :
                return "dekolgen";
            case "SakitGigi" :
                return "cataflam";
            default:
                return "Tidak ada saran obat spesifik";
        }
    }


    public static double bobat(Scanner sc) {
        int[] obatYangDibeliIndex = new int[10];
        double totalHarga = 0;
        int count = 0;
        boolean check = false;
        
        while (!check) {
            System.out.println("\nPilih obat yang anda ingin beli: ");
            for (int i = 0; i < namaObat.length; i++) {
                System.out.println(i + 1 + ". " + namaObat[i] + " - Rp" + hargaObat[i]);
            }
            int obatIndex = sc.nextInt();
            
            if (obatIndex >= 1 && obatIndex <= namaObat.length) {
                double harga = hargaObat[obatIndex - 1];
                System.out.println("Anda memilih: " + namaObat[obatIndex - 1]);
                System.out.println("Harga: Rp" + harga);
        
                obatYangDibeliIndex[count] = obatIndex - 1;
                totalHarga += harga;
                count++;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            
            System.out.println("Tambah obat yang ingin dibeli? (y/t)");
            String lanjut = sc.next();
            if (lanjut.equalsIgnoreCase("t")) {
                check = true;
            }
        }
        
        System.out.println("\nObat yang dibeli:");
        for (int i = 0; i < count; i++) {
            System.out.println(namaObat[obatYangDibeliIndex[i]] + " - Rp" + hargaObat[obatYangDibeliIndex[i]]);
        }
        System.out.println("Total harga obat: Rp" + totalHarga);
        for (int i = 0; i < obatYangDibeliIndex.length; i++) {
            if (obatYangDibeliIndex[i] != 0) {
                String infoObat = namaObat[obatYangDibeliIndex[i]] + " - Rp" + hargaObat[obatYangDibeliIndex[i]];
                for (int j = 0; j < riwayatObat.length; j++) {
                    if (riwayatObat[j] == null) {
                        riwayatObat[j] = infoObat;
                        jumlahRiwayatObat++; 
                        break;
                    }
                }
            }
        }
        return totalHarga;
    }
    
        
    
    
    

    public static void informasi(Scanner sc) {    
        System.out.println("Informasi penyakit dan obatnya: ");
        for (int i = 0; i < namaObat.length; i++) {
            System.out.println((i + 1) + ". " + Keluhan[i] + " = " + namaObat[i] + " Rp." + hargaObat[i]);
        }
    }
    
    static int member(Scanner sc) {
        int userIndex = -1;
        int attempts; 

        for (attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
            System.out.println("");
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

            System.out.print("\nUsername atau password salah. Silahkan coba lagi");
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Anda salah login 3 kali, harap restart aplikasi");
                System.exit(0);
            }
            System.out.println("Coba lagi.\n");
        }

        return userIndex;

    }

    public static void tampilkanRiwayatPembelianObat() {
        if (jumlahRiwayatObat == 0) {
            System.out.println("Belum ada riwayat pembelian obat.");
        } else {
            System.out.println("\nRiwayat Pembelian Obat:");
            for (String infoObat : riwayatObat) {
                if (infoObat != null) {
                    System.out.println(infoObat);
                    System.out.println("");
                }
            }
        }
    }
    

    public static void tampilkanRiwayatPeriksa() {
        System.out.println("\nRiwayat Periksa:");
        for (String info : riwayatPeriksa) {
            if (info != null) {
                System.out.println(info);
                System.out.println("");
            }
        }
    }
}