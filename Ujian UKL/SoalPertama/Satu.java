package SoalPertama;
import java.util.Scanner;

public class Satu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double diskon = 0.0;

        System.out.print("Masukkan total belanja: Rp.");
        double totalBelanja = in.nextDouble();

        if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            diskon = 0.10; 
        } else if (totalBelanja >= 200000) {
            diskon = 0.20;
        }

        double totalDiskon = totalBelanja * diskon;
        double totalSetelahDiskon = totalBelanja - totalDiskon ;

        System.out.println("Total Belanja: Rp" + totalBelanja);
        System.out.println("Diskon: Rp" + totalDiskon);
        System.out.println("Total setelah diskon: Rp" + totalSetelahDiskon);
    }
}
