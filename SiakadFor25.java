import java.util.Scanner;

public class SiakadFor25 {
    public static void main(String[] args) {
        // Deklarasi Variabel
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0;

        // Perulangan Input Nilai
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + i + " : ");
            nilai = input.nextDouble();
            if(nilai > tertinggi) {
                tertinggi = nilai;
            }
            if(nilai < terendah) {
                terendah = nilai;
            }
            lulus += (nilai >= 60) ? 1 : 0 ;
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa Yang Lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa Yang Tidak Lulus : " + (10 - lulus));
    }
}