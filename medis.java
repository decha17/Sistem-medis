import java.util.Scanner;

public class medis {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String NamaObatA,NamaObatB,NamaObatC,NamaObatD,NamaObatE,NamaObatF,NamaObatG,NamaObatH;
        double obatA = 10000;
        double obatB = 11000;
        double obatC = 12000;
        double obatD = 13000;
        double obatE = 14000;
        double obatF = 15000;
        double obatG = 16000;
        double obatH = 17000;
        
        String demam = "panas" ,flu = "flu";

        String keluhan,TanggalPeriksa, asalKota,Nama ;  
        
        double jmluang, jmlObat ,totalHargaObat, totalBayar, diskonMember,kembalian, obat,totalDiskMember,TotaldiskAsuransi ;
        int namaDokter;
        
        int menu,member ;
        double dokterA = 50000;
        double dokterB = 40000;
        double dokterC = 35000;
        double dokterD = 100000;
        double DokterA = 150000;
        double DokterB = 200000;
        double DokterC = 500000;
        
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
        
        String Username,Password;
        String User1 = "dimas123";
        String Pass1 = "dms12";

        int PunyaAsuransi;
        String IDasuransi = "234172";
        String asuransi;
        double DiskAsuransi = 0.65; 
        double DiskMember = 0.8;

        int attempt , MaxAtt;

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

                    switch (namaDokter) {
                        case 1:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
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
                            }                            
                        }
                            break;
                        
                        case 2:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;
                        
                        case 3:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 4:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 5:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 6:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 7:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        default:
                            System.out.println("Dokter yang anda pilih tidak ada");
                            break;
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

                    switch (namaDokter) {
                        case 1:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
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
                            }                            
                        }
                            break;
                        
                        case 2:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
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
                            }                            
                        }
                            break;
                        
                        case 3:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
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
                            }                            
                        }
                            break;

                        case 4:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 5:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 6:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        case 7:
                            System.out.println("Dokter pilihan anda " + namaDokterA );
                            System.out.print("Masukan keluhan anda : ");
                            keluhan = sc.next();
                            if (keluhan.equals(demam) ) {
                                System.out.println("diagnosa dokter : demam" + " Obat yang disarankan : " + NamaObatA  );                                totalBayar = obatA + dokterA ;
                                totalBayar = obatA + dokterA ;
                                System.out.println("Total yang harus anda bayar : " + totalBayar );
                                System.out.println("Masukan jumlah uang anda ");
                                jmluang = sc.nextInt();
                                System.out.println("Kembalian anda  " + (jmluang - totalBayar));
                                                        
                        }
                            break;

                        default:
                            System.out.println("Dokter yang anda pilih tidak ada");
                            break;
                    }
                    break;    

                default:
                    break;
            }
                break;
            case 2:
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
                break;
            default:
                System.out.println("Inputan anda salah");
                break;
        }
    
            
        }
    }

