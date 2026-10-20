import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        //Scanner & deklarasi variabel
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        //Perulangan pembelian
        do {

            //Input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
             
            //Pembatalan transaksi
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Tranksaksi dibatalkan.");
                break;
            }

            //Input jumlah item yang dibeli
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            //Output total harga
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
