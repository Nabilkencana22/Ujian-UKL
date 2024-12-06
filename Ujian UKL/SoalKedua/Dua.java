package SoalKedua;
import java.util.Scanner;

public class Dua {
    public static double hitungLuasPermukaanBola(double jariJari) {
        return 4 * 3.14 * jariJari * jariJari;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = in.nextDouble(); 

        double luasPermukaan = hitungLuasPermukaanBola(jariJari);
        System.out.println("Luas permukaan bola: " + luasPermukaan); 
    }
}

