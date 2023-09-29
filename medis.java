package medis;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

import java.util.Arrays;
import java.util.ArrayList;


public class medis {
    
    public static void main(String[] args) {
        String NamaObatA,NamaObatB,NamaObatC,NamaObatD,NamaObatE,NamaObatF,NamaObatG,NamaObatH;
        int obatA = 10000;
        int obatB = 11000;
        int obatC = 12000;
        int obatD = 13000;
        int obatE = 14000;
        int obatF = 15000;
        int obatG = 16000;
        int obatH = 17000;

        NamaObatA= "gratazon : " + obatA; 
        NamaObatB = "paratusin : " + obatB;
        NamaObatC = "inamid : " + obatC;
        NamaObatD = "promaag : " + obatD;
        NamaObatE = "panadol : " + obatE;
        NamaObatF = "paracetamol : " + obatF;
        NamaObatG = "antibiotik : " + obatG;
        NamaObatH = "dekolgen : " + obatH;

        int b,d,e,f,g,h;
        int dokterA = 50000;
        int dokterB = 40000;
        int dokterC = 35000;
        int dokterD = 100000;
        String namaDokterA = "dr. Dita Rosita Marsudi Putri :" + dokterA;
        String namaDokterB = "dr. Novita Wahyu Rahmawaty : " + dokterB;
        String namaDokterC = "dr. Antonius ardijanto : " + dokterC;
        String namaDokterD = "dr. Ira Prasasti, MMRS : " + dokterD;
        Scanner sc = new Scanner(System.in);
        System.out.println("menu ");
        System.out.println("1. periksa");
        System.out.println("2. beli obat");
        System.out.print("pilih (1/2) : ");
        int a =sc.nextInt();
        
        if (a==1) {
            System.out.println("apakah anda memiliki membership");
            System.out.println("1. iyaa ");
            System.out.println("2. tidak ");
            System.out.print("pilih (1/2) : ");
            b = sc.nextInt();
            if (b == 1) {
                System.out.println("Masukan username dan password");
                System.out.print("Masukan Username :");
                String Username = sc.next();
                System.out.print("Masukan Password :");
                String Password = sc.next();
                String User = "dimasadi" ;
                String Pass = "dimasadi123";

                
                if (Username.equals(User) && Password.equals(Pass) ) {
                    System.out.println("Pilih dokter ");
                    System.out.println("1. " + namaDokterA);
                    System.out.println("2. " + namaDokterB);
                    System.out.println("3. " + namaDokterC);
                    System.out.println("4. " + namaDokterD);
                    System.out.println("Masukan pilihan anda : (1/2/3/4)");
                    int c = sc.nextInt();
                } 
            }
            if (b == 2) {
                System.out.print("Masukan identitas ");
                System.out.print("Masukan Nama : ");
                String Nama = sc.next();
                System.out.print("Masukan Umur : ");
                String umur = sc.next();
                System.out.print("Masukan Asal Kota : ");
                String asalKota = sc.next();
                System.out.print("Masukan  Tanggal periksa : ");
                String TanggalPeriksa = sc.next();
                System.out.print("Masukan Keluhan : ");
                String Keluhan = sc.next();
            }
        else {
            System.out.println("Input tidak dikenali");
        }
        } else if (a==2) {
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
        int obat = sc.nextInt();
        System.out.println("Masukan jumlah obat yang ingin anda beli : ");
        int jmlObat = sc.nextInt();
        int totalHargaObat ;
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
        
    }{
        }
    } else {
        System.out.println("Input tidak diketahui");
    }
}
}
