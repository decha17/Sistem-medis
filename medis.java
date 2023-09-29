import java.util.Scanner;

public class medis {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String NamaObatA,NamaObatB,NamaObatC,NamaObatD,NamaObatE,NamaObatF,NamaObatG,NamaObatH;
        int obatA = 10000;
        int obatB = 11000;
        int obatC = 12000;
        int obatD = 13000;
        int obatE = 14000;
        int obatF = 15000;
        int obatG = 16000;
        int obatH = 17000;

        String keluhan,TanggalPeriksa, asalKota,Nama ;  

        String User = "dimasadi" ;
        String Pass = "dimasadi123";

        int jmluang, jmlObat ,totalHargaObat ;

        int namaDokter;

        int menu,member,obat ;
        int dokterA = 50000;
        int dokterB = 40000;
        int dokterC = 35000;
        int dokterD = 100000;
        int DokterA = 150000;
        int DokterB = 200000;
        int DokterC = 500000;

        //nama dokter spesialis
        String namaDokterSpA = "Gwido putra : " + DokterA ;
        String namaDokterSpB = "Rizwan pratama : " + DokterB;
        String namaDokterSpC = "Bayu dimas : " + DokterC;

        //nama + harga obat
        NamaObatA= "gratazon : " + obatA; 
        NamaObatB = "paratusin : " + obatB;
        NamaObatC = "inamid : " + obatC;
        NamaObatD = "promaag : " + obatD;
        NamaObatE = "panadol : " + obatE;
        NamaObatF = "paracetamol : " + obatF;
        NamaObatG = "antibiotik : " + obatG;
        NamaObatH = "dekolgen : " + obatH;

        //nama dokter umum
        String namaDokterA = "dr. Dita Rosita Marsudi Putri :" + dokterA;
        String namaDokterB = "dr. Novita Wahyu Rahmawaty : " + dokterB;
        String namaDokterC = "dr. Antonius ardijanto : " + dokterC;
        String namaDokterD = "dr. Ira Prasasti, MMRS : " + dokterD;

        //menu pertama
        System.out.println("menu ");
        System.out.println("1. periksa");
        System.out.println("2. beli obat");
        System.out.print("pilih (1/2) : ");
        menu =sc.nextInt();

        //apakah anda memiliki membership
        if (menu == 1) {
            System.out.println("apakah anda memiliki membership");
            System.out.println("1. iyaa ");
            System.out.println("2. tidak ");
            System.out.print("pilih (1/2) : ");
            member  = sc.nextInt();

            //jika iya masukan username dan password membership
            if (member == 1) {
                System.out.println("Masukan username dan password");
                System.out.print("Masukan Username :");
                String Username = sc.next();
                System.out.print("Masukan Password :");
                String Password = sc.next();
                if (Username.equals(User) && Password.equals(Pass)) {
                    System.out.println("Pilih dokter spesialis atau umum");
                    System.out.println("Dokter umum");
                    System.out.println("1. " + namaDokterA);
                    System.out.println("2. " + namaDokterB);
                    System.out.println("3. " + namaDokterC);
                    System.out.println("4. " + namaDokterD);
                    System.out.println("Dokter Spesialis ");
                    System.out.println("5. " + namaDokterSpA );
                    System.out.println("6. " + namaDokterSpB );
                    System.out.println("7. " + namaDokterSpC );
                    System.out.println("Masukan pilihan anda : (1/2/3/4/5/6/7)");
                    namaDokter = sc.nextInt();

                    if (namaDokter == 1) {
                        System.out.println("Dokter pilihan anda " + namaDokterA );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 2) {
                        System.out.println("Dokter pilihan anda " + namaDokterB );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 3) {
                        System.out.println("Dokter pilihan anda " + namaDokterC );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 4) {
                        System.out.println("Dokter pilihan anda " + namaDokterD );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 5) {
                        System.out.println("Dokter pilihan anda " + namaDokterSpA );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 6) {
                        System.out.println("Dokter pilihan anda " + namaDokterSpB );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 7) {
                        System.out.println("Dokter pilihan anda " + namaDokterSpC );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    }

                } else {
                    System.out.println("Username dan Password anda salah silahkan ulangi lagi");
                }
            } 
            //masukan identitas
            else if (member == 2) {
                System.out.print("Masukan identitas ");
                System.out.print("Masukan Nama : ");
                Nama = sc.next();
                System.out.print("Masukan Umur : ");
                String umur = sc.next();
                System.out.print("Masukan Asal Kota : ");
                asalKota = sc.next();
                System.out.print("Masukan  Tanggal periksa : ");
                TanggalPeriksa = sc.next();
                
                System.out.println("Pilih dokter spesialis atau umum");
                System.out.println("Dokter umum");
                System.out.println("1. " + namaDokterA);
                System.out.println("2. " + namaDokterB);
                System.out.println("3. " + namaDokterC);
                System.out.println("4. " + namaDokterD);
                System.out.println("Dokter Spesialis ");
                System.out.println("5. " + namaDokterSpA );
                System.out.println("6. " + namaDokterSpB );
                System.out.println("7. " + namaDokterSpC );
                System.out.println("Masukan pilihan anda : (1/2/3/4/5/6/7)");
                namaDokter = sc.nextInt();

                if (namaDokter == 1) {
                        System.out.println("Dokter pilihan anda " + namaDokterA );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 2) {
                        System.out.println("Dokter pilihan anda " + namaDokterB );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 3) {
                        System.out.println("Dokter pilihan anda " + namaDokterC );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 4) {
                        System.out.println("Dokter pilihan anda " + namaDokterD );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 5) {
                        System.out.println("Dokter pilihan anda " + namaDokterSpA );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 6) {
                        System.out.println("Dokter pilihan anda " + namaDokterSpB );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    } else if (namaDokter == 7) {
                        System.out.println("Dokter pilihan anda " + namaDokterSpC );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                    }

            } else {
                System.out.println("Input tidak dikenali");
            }
            
        } else if (menu == 2) {
            System.out.println("pilihlah obat yg ingin anda beli ");
        System.out.println("1. " +NamaObatA );
        System.out.println("2. " +NamaObatB);
        System.out.println("3. " +NamaObatC);
        System.out.println("4. " +NamaObatD);
        System.out.println("5. " +NamaObatE);
        System.out.println("6. " +NamaObatF);
        System.out.println("7. " +NamaObatG);
        System.out.println("8. " +NamaObatH);
        System.out.println("Masukan pilihan obat anda : (1/2/3/4/5/6/7/8)");
        obat = sc.nextInt();
        System.out.println("Masukan jumlah obat yang ingin anda beli : ");
        jmlObat = sc.nextInt();

        if (obat == 1) {
            totalHargaObat = obatA*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 2) {
            totalHargaObat = obatB*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 3) {
            totalHargaObat = obatC*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 4) {
            totalHargaObat = obatD*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 5) {
            totalHargaObat = obatE*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 6) {
            totalHargaObat = obatF*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 7) {
            totalHargaObat = obatG*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        } else if (obat == 8) {
            totalHargaObat = obatH*jmlObat;
            System.out.println("total harga yang anda bayar : " + totalHargaObat);
        }
        } else {
            System.out.println("input tidak di kenali");
        } {
            
        }
    }
}
