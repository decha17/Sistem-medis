import java.util.Scanner;

public class medis {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        // nama dokter umum
        String[] namaDokter = {"dr. Dita Rosita Marsudi Putri", "dr. Novita Wahyu Rahmawaty", "dr. Antonius ardijanto", "dr. Ira Prasasti, MMRS"};
        // nama dokter spesialis
        String[] namaDokterSp = {"Gwido putra", "Rizwan pratama" , "Bayu dimas" };
        // nama obat
        String[] NamaObat = {"Grathazon", "Paratusin", "Inamid", "Promaag", "Panadol", "Paracetamol", "Decolgen", "Ambeven", "Cataflam"};
        // nama keluhan
        String [] Keluhan = {"Radang" , "Flu", "Sakit perut", "Maag" , "Pusing", "Demam", "Pilek", "Wasir", "Sakit gigi"};
        // harga obat
        double obatA = 10000;
        double obatB = 11000;
        double obatC = 12000;
        double obatD = 13000;
        double obatE = 14000;
        double obatF = 15000;
        double obatG = 16000;
        double obatH = 17000;
        double obatI = 95000;
        
        String demam = "demam" ,pilek = "pilek" ,flu = "flu";

        String keluhan,TanggalPeriksa, asalKota,Nama ;  
        
        double jmluang, jmlObat ,totalHargaObat, totalBayar, diskonMember,kembalian, obat,totalDiskMember,TotaldiskAsuransi ;

        int menu,member,namadokter ;
        //Harga dokter umum
        double dokterA = 50000;
        double dokterB = 40000;
        double dokterC = 35000;
        double dokterD = 100000;

        //Harga dokter Spesialis
        double DokterA = 150000;
        double DokterB = 200000;
        double DokterC = 500000;
        
        //nama dokter umum
        namaDokter[0] = "dr. Dita Rosita Marsudi Putri :" + dokterA;
        namaDokter[1] = "dr. Novita Wahyu Rahmawaty : " + dokterB;
        namaDokter[2] = "dr. Antonius ardijanto : " + dokterC;
        namaDokter[3] = "dr. Ira Prasasti, MMRS : " + dokterD;

        //nama dokter spesialis
        namaDokterSp[0] = "Gwido putra : " + DokterA ;
        namaDokterSp[1] = "Rizwan pratama : " + DokterB;
        namaDokterSp[2] = "Bayu dimas : " + DokterC;
        
        //nama + harga obat
        NamaObat[0]= "gratazon : " + obatA; 
        NamaObat[1] = "paratusin : " + obatB;
        NamaObat[2] = "inamid : " + obatC;
        NamaObat[3] = "promaag : " + obatD;
        NamaObat[4] = "panadol : " + obatE;
        NamaObat[5] = "paracetamol : " + obatF;
        NamaObat[6] = "dekolgen : " + obatG;
        NamaObat[7] = "ambeven : " + obatH;
        NamaObat[8] = "cataflam : " + obatI; 
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = obatA + dokterA ;
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                            totalBayar = obatA + dokterA ;
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = obatA + dokterA ;
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                            totalBayar = obatA + dokterA ;
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                               
                            totalBayar = obatA + dokterA ;
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = obatA + dokterA ;
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
                        if (keluhan.equals(demam) ) {
                            System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObat[0]  );                                
                            totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
                                totalBayar = obatA + dokterA ;
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
            System.out.println("(1/2/3/4/5/6/7/8/9)");
            System.out.print("Masukan pilihan obat anda : ");
            obat = sc.nextInt();
            System.out.print("Masukan jumlah obat yang ingin anda beli : ");
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
            }  else if (obat == 9) {
                totalHargaObat = obatI*jmlObat;
                System.out.println("total harga yang anda bayar : " + totalHargaObat);
            }
                break;
            default:
                System.out.println("Inputan anda salah");
                break;
        }
        }
    }

