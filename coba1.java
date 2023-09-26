package medis;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

import java.util.Arrays;
import java.util.ArrayList;


public class coba1 {
    static String[] namaDokter = {"dr. Dita Rosita Marsudi Putri", "dr. Novita Wahyu Rahmawaty", "dr. Antonius ardijanto", "dr. Ira Prasasti, MMRS"};
    static String[] NamaObat = {"grathazon", "paratusin", "inamid", "promaag", "panadol", "paracetamol", "antibiotik", "dekolgen"};
    public static void main(String[] args) {
        int obatA = 15000;
        int obatB = 15000;
        int obatC = 15000;
        int obatD = 15000;
        int obatE = 15000;
        int obatF = 15000;
        int obatG = 15000;
        int obatH = 15000;

        NamaObat[0] = "gratazon : " + obatA; 
        NamaObat[1] = "paratusin : " + obatB;
        NamaObat[2] = "inamid : " + obatC;
        NamaObat[3] = "promaag : " + obatD;
        NamaObat[4] = "panadol : " + obatE;
        NamaObat[5] = "paracetamol : " + obatF;
        NamaObat[6] = "antibiotik : " + obatG;
        NamaObat[7] = "dekolgen : " + obatH;

        int b,d,e,f,g,h;
        int dokterA = 50000;
        int dokterB = 40000;
        int dokterC = 35000;
        int dokterD = 100000;
        namaDokter[0] = "dr. Dita Rosita Marsudi Putri :" + dokterA;
        namaDokter[1] = "dr. Novita Wahyu Rahmawaty : " + dokterB;
        namaDokter[2] = "dr. Antonius ardijanto : " + dokterC;
        namaDokter[3] = "dr. Ira Prasasti, MMRS : " + dokterD;
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
                String dimasadi,dimas123;
                
                if (Username.equals(Username) && Password.equals(Password) ) {
                    System.out.println("Pilih dokter ");
                    System.out.println("1. " + namaDokter[0]);
                    System.out.println("2. " + namaDokter[1]);
                    System.out.println("3. " + namaDokter[2]);
                    System.out.println("4. " + namaDokter[3]);
                    System.out.println("Masukan pilihan anda : (1/2/3/4)");
                    int c = sc.nextInt();
                
            } else {
                System.out.println("Masukan");
                b=sc.nextInt(1);
            }
        
        }
    } else {
        System.out.println("pilihlah obat yg ingin anda beli ");
        System.out.println("1. " +NamaObat[0] );
        System.out.println("2. " +NamaObat[1]);
        System.out.println("3. " +NamaObat[1]);
        System.out.println("4. " +NamaObat[1]);
        System.out.println("5. " +NamaObat[1]);
        System.out.println("6. " +NamaObat[1]);
        System.out.println("7. " +NamaObat[1]);
        System.out.println("8. " +NamaObat[1]);
    } 
}
}
