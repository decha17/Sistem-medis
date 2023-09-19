package medis;

import java.util.Scanner;


public class medis {
        public static void main(String[] args) {
            
            System.out.println("_____________________________________________________");
            System.out.println("Selamat datang di Klinik polinema");
            System.out.println("_____________________________________________________");

            Scanner scanner = new Scanner(System.in);
            
            int Pilihan, pilihan, pilih, pilih_a ;

            do {
                System.out.println("menu : ");
                System.out.println("1. periksa");
                System.out.println("2. beli obat");
                System.out.print("Masukan pilihan anda : ");
                Pilihan = scanner.nextInt();
                System.out.println("1. pasien baru ");
                System.out.println("2. pasien ");
                System.out.print("masukan pilihan anda : ");
                pilihan = scanner.nextInt();
                
                String nama, umur, asalKota, tanggalPeriksa, keluhan;
                System.out.println("masuka identitas");
                System.out.print("nama : ");
                nama = scanner.next();
                System.out.print("umur : ");
                umur = scanner.next();
                System.out.print("asal kota : ");
                asalKota = scanner.next();
                System.out.print("tangal periksa :");
                tanggalPeriksa = scanner.next();
                System.out.print("keluhan : ");
                keluhan = scanner.next();
                
                pilih_a = scanner.nextInt();

                
                
                do { 
                    switch (pilih_a) {
                        case 1:
                            System.out.println("");
                            break;
                    
                        default:
                            break;
                    }
                    
                } while (pilih_a != 3);
                pilih = scanner.nextInt();
                
                switch (Pilihan) {
                    case 1:
                        System.out.println("Periksa");
                        switch (pilihan) {
                            case 1:
                                System.out.println("apakah anda pasien lama : ");
                                switch (pilih) {
                                    case 1:
                                        System.out.println("masukan identitas");
                                        
                                        break;
                                
                                    default:
                                        System.out.println("keluar");
                                        break;
                                }
                                
                                break;
                        
                            default:
                                System.out.println("kembali ke menu awal : ");
                                break;
                        }
                        break;
                    
                    case 2: 
                        System.out.println("beli obat");
                        break;
                
                    default:
                        System.out.print("ulangi perintah");
                        break;
                }
                
            } while (Pilihan != 3);
                scanner.close();


            
                
        
                
            
    }
}