package SoalKetiga;
import java.util.Scanner;

public class Satu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalHariHadir = 0;
        int jumlahHariKerja = 24;
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = in.nextInt();

        int[] hariHadir = new int[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + ( i + 1) + ": ");
            hariHadir[i] = in.nextInt();
        }

        for (int hari : hariHadir) {
            totalHariHadir += hari;
        }

        double rataRata = (double) totalHariHadir / jumlahSiswa;  

        System.out.println("---------- REKAP ----------");
        System.out.println("Rekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + jumlahHariKerja + " Hari):");
        System.out.println("");

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1)+ ": " + hariHadir[i] + " hari hadir");
        }

        System.out.println("---------- RATA RATA ----------");
        System.out.println("Rata-rata kehadiran siswa: " + rataRata + " hari");
        System.out.println("");
        
        System.out.println("---------- KESIMPULAN ----------");
        System.out.println("Kesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");

        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
        
        System.out.println("");

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
    }
}