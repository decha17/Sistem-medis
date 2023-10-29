import java.util.Scanner;

public class medis {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        // nama dokter umum
        String[] namaDokter = {"dr. Dita Rosita Marsudi Putri", "dr. Novita Wahyu Rahmawaty", "dr. Antonius ardijanto", "dr. Ira Prasasti, MMRS"};
        // nama dokter spesialis
        String[] namaDokterSp = {"Gwido putra", "Rizwan pratama" , "Bayu dimas" };
        // nama obat
        String[] NamaObat = {"Grathazon", "Paratusin", "Inamid", "Promaag", "Panadol", "Paracetamol", "Decolgen", "Ambeven", "Cataflam","OBH"};
        // nama keluhan
        String [] Keluhan = {"Radang" , "Flu", "Sakit perut", "Maag" , "Pusing", "Demam", "Pilek", "Wasir", "Sakit gigi", "Batuk"};
        // harga obat
        long [] hrgObat = {10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 95000, 30000};
        // Harga dokter umum
        long [] hrgDokterUm = {50000, 40000, 35000, 100000};
        // Harga dokter spesialis
        long [] hrgDokterSp = {150000, 200000, 500000};
        
        String radang = "radang" , flu = "flu", sakitPerut = "Sakit Perut", maag = "Maag", pusing = "Pusing", demam = "demam" ,pilek = "pilek" , wasir="Wasir", sakitGigi = "Sakit Gigi", batuk = "Batuk";

        String keluhan,TanggalPeriksa, asalKota,Nama ;  
        
        double jmluang, jmlObat ,totalHargaObat, totalBayar, diskonMember,kembalian, obat,totalDiskMember,TotaldiskAsuransi ;

        int menu,member,namadokter ;
        
        
        //nama dokter umum dan harganya
        namaDokter[0] = namaDokter[0] + " :"+ hrgDokterUm[0];
        namaDokter[1] = namaDokter[1] + " :"+ hrgDokterUm[1];
        namaDokter[2] = namaDokter[2] + " :"+ hrgDokterUm[2];
        namaDokter[3] = namaDokter[3] + " :"+ hrgDokterUm[3];

        //nama dokter spesialis dan harganya
        namaDokterSp[0] =  namaDokterSp[0] + " :"+ hrgDokterSp[0];
        namaDokterSp[1] =  namaDokterSp[1] + " :"+ hrgDokterSp[1];
        namaDokterSp[2] =  namaDokterSp[2] + " :"+ hrgDokterSp[2];
        
        //nama obat dan harganya
        NamaObat[0] = NamaObat[0] + " :"+ hrgObat[0]; 
        NamaObat[1] = NamaObat[0] + " :"+ hrgObat[1];
        NamaObat[2] = NamaObat[0] + " :"+ hrgObat[2];
        NamaObat[3] = NamaObat[0] + " :"+ hrgObat[3];
        NamaObat[4] = NamaObat[0] + " :"+ hrgObat[4];
        NamaObat[5] = NamaObat[0] + " :"+ hrgObat[5];
        NamaObat[6] = NamaObat[0] + " :"+ hrgObat[6];
        NamaObat[7] = NamaObat[0] + " :"+ hrgObat[7];
        NamaObat[8] = NamaObat[0] + " :"+ hrgObat[8]; 
        NamaObat[9] = NamaObat[0] + " :"+ hrgObat[9];
        //user dan password member
        String Username,Password;
        String User1 = "dimas123";
        String Pass1 = "dms12";
        //asuransi
        int PunyaAsuransi;
        String IDasuransi = "234172";
        String asuransi;
        double DiskAsuransi = 0.65; 
        double DiskMember = 0.8;

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("--- Selamat Datang di Platfrom Klinik sederhana ---");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        //menu pertama
        System.out.println("menu ");
        System.out.println("1. periksa");
        System.out.println("2. beli obat");
        System.out.print("pilih (1/2) : ");
        menu =sc.nextInt();
        
        //apakah anda memiliki membership
        switch (menu) {
            case 1:
            System.out.println("apakah anda memiliki membership");
            System.out.println("1. iyaa ");
            System.out.println("2. tidak ");
            System.out.print("pilih (1/2) : ");
            member  = sc.nextInt();

            switch (member) {
                case 1:
                    do{
                    System.out.println("Masukan username dan password");
                    System.out.print("Masukan Username :");
                    Username = sc.next();
                    System.out.print("Masukan password :");
                    Password = sc.next();
                    
                    }while ((!Username.equals(User1)) && (!Password.equals(Pass1)) );
                    System.out.println("Pilih dokter spesialis atau umum");
                    System.out.println("Dokter umum");
                    System.out.println("1. " + namaDokter[0]);
                    System.out.println("2. " + namaDokter[1]);
                    System.out.println("3. " + namaDokter[2]);
                    System.out.println("4. " + namaDokter[3]);
                    System.out.println("Dokter Spesialis ");
                    System.out.println("5. " + namaDokterSp[0] );
                    System.out.println("6. " + namaDokterSp[1] );
                    System.out.println("7. " + namaDokterSp[2] );
                    System.out.println("Masukan pilihan anda : (1/2/3/4/5/6/7)");
                    namadokter = sc.nextInt();
                    if (namadokter == 1 ) {
                        System.out.println("Dokter pilihan anda " + namaDokter[0] );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterUm[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                } else if (namadokter == 2) {
                    System.out.println("Dokter pilihan anda " + namaDokter[1] );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterUm[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                } else if (namadokter == 3) {
                    System.out.println("Dokter pilihan anda " + namaDokter[2] );
                        System.out.print("Masukan keluhan anda : ");
                        keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterUm[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                } else if (namadokter == 4) {
                    System.out.println("Dokter pilihan anda " + namaDokter[3] );
                    System.out.print("Masukan keluhan anda : ");
                    keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterUm[3] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                } else if (namadokter == 5) {
                    System.out.println("Dokter pilihan anda " + namaDokterSp[0] );
                    System.out.print("Masukan keluhan anda : ");
                    keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterSp[0] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                } else if (namadokter == 6) {
                    System.out.println("Dokter pilihan anda " + namaDokterSp[1] );
                    System.out.print("Masukan keluhan anda : ");
                    keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterSp[1] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                } else if (namadokter == 7) {
                    System.out.println("Dokter pilihan anda " + namaDokterSp[2] );
                    System.out.print("Masukan keluhan anda : ");
                    keluhan = sc.next();
                        if (keluhan.equalsIgnoreCase(radang) ) {
                            System.out.println("diagnosa dokter : radang" + " & Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = hrgObat[0] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                           
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(flu) ) {
                            System.out.println("diagnosa dokter : flu" + " & Obat yang disarankan : " + NamaObat[1]  );                                
                            totalBayar = hrgObat[1] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitPerut) ) {
                            System.out.println("diagnosa dokter : Sakit Perut" + " & Obat yang disarankan : " + NamaObat[2]  );                                
                            totalBayar = hrgObat[2] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                               
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(maag) ) {
                            System.out.println("diagnosa dokter : Maag" + " & Obat yang disarankan : " + NamaObat[3]  );                                
                            totalBayar = hrgObat[3] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pusing) ) {
                            System.out.println("diagnosa dokter : Pusing" + " & Obat yang disarankan : " + NamaObat[4]  );                                
                            totalBayar = hrgObat[4] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " & Obat yang disarankan : " + NamaObat[5]  );                                
                            totalBayar = hrgObat[5] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(pilek) ) {
                            System.out.println("diagnosa dokter : Pilek" + " & Obat yang disarankan : " + NamaObat[6]  );                                
                            totalBayar = hrgObat[6] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(wasir) ) {
                            System.out.println("diagnosa dokter : Wasir" + " & Obat yang disarankan : " + NamaObat[7]  );                                
                            totalBayar = hrgObat[7] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(sakitGigi) ) {
                            System.out.println("diagnosa dokter : Sakit Gigi" + " & Obat yang disarankan : " + NamaObat[8]  );                                
                            totalBayar = hrgObat[8] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    } else if (keluhan.equalsIgnoreCase(batuk) ) {
                            System.out.println("diagnosa dokter : Batuk" + " & Obat yang disarankan : " + NamaObat[9]  );                                
                            totalBayar = hrgObat[9] + hrgDokterSp[2] ;
                            System.out.println("Total yang harus anda bayar : " + totalBayar );
                            System.out.println("Masukan jumlah uang anda ");
                            jmluang = sc.nextInt();
                            totalDiskMember = totalBayar * DiskMember;
                            kembalian = jmluang - totalDiskMember;
                            System.out.println("Kembalian anda  " + kembalian);
                            System.out.println("Apakah anda punya asuransi : ");
                            System.out.println("1. ya");
                            System.out.println("2. tidak");
                            System.out.print("Masukan pilihan anda : ");
                            PunyaAsuransi = sc.nextInt();

                            if (PunyaAsuransi == 1) {
                            do {                               
                                System.out.print("Masukan ID asuransi :"); 
                                asuransi = sc.next();                                
                                System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalDiskMember );
                                TotaldiskAsuransi = totalDiskMember * DiskAsuransi;
                                System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                System.out.println("Masukan jumlah uang anda : ");
                                jmluang = sc.nextInt();
                                kembalian = jmluang - TotaldiskAsuransi;
                                System.out.println("Kembalian anda : " + kembalian);
                            } while (!asuransi.equals(IDasuransi));
                        } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + kembalian);
                            }                            
                    }
                }
                    break;

                case 2:
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
                    System.out.println("1. " + namaDokter[0]);
                    System.out.println("2. " + namaDokter[1]);
                    System.out.println("3. " + namaDokter[2]);
                    System.out.println("4. " + namaDokter[3]);
                    System.out.println("Dokter Spesialis ");
                    System.out.println("5. " + namaDokterSp[0] );
                    System.out.println("6. " + namaDokterSp[1] );
                    System.out.println("7. " + namaDokterSp[2]);
                    System.out.println("Masukan pilihan anda : (1/2/3/4/5/6/7)");
                    namadokter = sc.nextInt();

                    if (namadokter == 1) {
                        System.out.println("Dokter pilihan anda " + namaDokter[0] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    } else if (namadokter == 2) {
                        System.out.println("Dokter pilihan anda " + namaDokter[1] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    } else if (namadokter == 3) {
                        System.out.println("Dokter pilihan anda " + namaDokter[2] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                                
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    } else if (namadokter == 4) {
                        System.out.println("Dokter pilihan anda " + namaDokter[3] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    } else if (namadokter == 5) {
                        System.out.println("Dokter pilihan anda " + namaDokterSp[0] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                              
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    } else if (namadokter == 6) {
                        System.out.println("Dokter pilihan anda " + namaDokterSp[1] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    } else if (namadokter == 7) {
                        System.out.println("Dokter pilihan anda " + namaDokterSp[2] );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                                totalBayar = hrgObat[0] + hrgDokterUm[0] ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                totalBayar = jmluang - totalBayar;
                                System.out.println("Kembalian anda  " + totalBayar);
                                System.out.println("Apakah anda punya asuransi : ");
                                System.out.println("1. ya");
                                System.out.println("2. tidak");
                                System.out.print("Masukan pilihan anda : ");
                                PunyaAsuransi = sc.nextInt();

                                if (PunyaAsuransi == 1) {
                                do {
                                   
                                    System.out.print("Masukan ID asuransi :"); 
                                    asuransi = sc.next();
                                    
                                        System.out.println("Anda mendapatkan potongan sebesar 35% ");
                                        System.out.println("Total yang harus anda bayar sebelum di kurangi asuransi : " + totalBayar );
                                        TotaldiskAsuransi = totalBayar * DiskAsuransi;
                                        System.out.println("Total yang harus di bayar setelah dikurangi asuransi : " + TotaldiskAsuransi);
                                
                                } while (!asuransi.equals(IDasuransi));
                            } else if (PunyaAsuransi == 2) {
                                System.out.println("Kembalian anda  " + totalBayar);
                            }                            
                        }
                    }
            }
                break;
            case 2:
            System.out.println("pilihlah obat yg ingin anda beli ");
            System.out.println("1. " +NamaObat[0] );
            System.out.println("2. " +NamaObat[1]);
            System.out.println("3. " +NamaObat[2]);
            System.out.println("4. " +NamaObat[3]);
            System.out.println("5. " +NamaObat[4]);
            System.out.println("6. " +NamaObat[5]);
            System.out.println("7. " +NamaObat[6]);
            System.out.println("8. " +NamaObat[7]);
            System.out.println("9. " +NamaObat[8]);
            System.out.println("10. " +NamaObat[9]);
            System.out.println("(1/2/3/4/5/6/7/8/9/10)");
            System.out.print("Masukan pilihan obat anda : ");
            obat = sc.nextInt();
            System.out.print("Masukan jumlah obat yang ingin anda beli : ");
            jmlObat = sc.nextInt();
    
            if (obat == 1) {
                totalHargaObat = hrgObat[0]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);    
            } else if (obat == 2) {
                totalHargaObat = hrgObat[1]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 3) {
                totalHargaObat = hrgObat[2]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 4) {
                totalHargaObat = hrgObat[3]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 5) {
                totalHargaObat = hrgObat[4]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 6) {
                totalHargaObat = hrgObat[5]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 7) {
                totalHargaObat = hrgObat[6]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 8) {
                totalHargaObat = hrgObat[7]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            }  else if (obat == 9) {
                totalHargaObat = hrgObat[8]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            } else if (obat == 10) {
                totalHargaObat = hrgObat[9]*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);                
            }   
                break;
            default:
                System.out.println("Inputan anda salah");
                break;
        }
        }
    }

