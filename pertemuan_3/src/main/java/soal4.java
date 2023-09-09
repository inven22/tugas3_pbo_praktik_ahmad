
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad al fajri
 */
public class soal4 {
   public static void main(String[] args) {
        // Input jumlah penjualan bulan ini
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();
        
        // Harga setiap item
        int hargaPerItem = 50000;
        
        // Gaji pokok
        int gajiPokok = 500000;
        
        // Hitung total penjualan
        int totalPenjualan = jumlahPenjualan * hargaPerItem;
        
        // Inisialisasi bonus penjualan
        double bonusPenjualan = 0;
        
        // Cek kondisi bonus penjualan
        if (jumlahPenjualan >= 80) {
            bonusPenjualan = totalPenjualan * 0.35;
        } else if (jumlahPenjualan >= 40) {
            bonusPenjualan = totalPenjualan * 0.25;
        } else if (jumlahPenjualan < 15) {
            double denda = (15 - jumlahPenjualan) * hargaPerItem * 0.15;
            gajiPokok -= denda;
        }
        
        // Hitung gaji total
        double gajiTotal = gajiPokok + bonusPenjualan;
        
        // Output gaji yang diterima
        if (jumlahPenjualan < 40) {
            System.out.println("Gaji yang diterima: Rp. " + (int) gajiTotal); // Menggunakan (int) untuk menghilangkan desimal
        } else {
            System.out.println("Gaji yang diterima: Rp. " + (int) gajiTotal); // Output tanpa desimal
        }
        
        // Tutup scanner
        scanner.close();
    }
}
