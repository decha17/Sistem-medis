package percobaanchatgpt;

import java.util.Scanner;

public class coba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Pilihan Pertama");
            System.out.println("2. Pilihan Kedua");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Anda memilih Pilihan Pertama.");
                    // Lakukan tindakan yang sesuai dengan Pilihan Pertama di sini
                    break;
                case 2:
                    System.out.println("Anda memilih Pilihan Kedua.");
                    // Lakukan tindakan yang sesuai dengan Pilihan Kedua di sini
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
