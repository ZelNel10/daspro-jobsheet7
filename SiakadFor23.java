import java.util.Scanner;

public class SiakadFor23 {
    public static void main(String[] args) {
        //Scanner & Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidak_lulus = 0;

        //Perulangan jumlah mahasiswa dan nilainya
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();


            //Ketentuan kelulusan
            if (nilai >= 60) {
                lulus++;
            } else {
                tidak_lulus++;
            }

            //Nilai tertinggi & terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        //Output jumlah kelulusan mahasiswa & nilai tertinggi dan terendah
        System.out.println("Banyaknya mahasiswa yang lulus: " + lulus);
        System.out.println("Banyaknya mahasiswa yang tidak lulus: " + tidak_lulus);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}
