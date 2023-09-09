
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
public class soal5 {
   
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Membaca input plat nomor mobil
        scanner.close();

        String[] platNomor = input.split(" ");

        int totalAngka = 0;
        for (String plat : platNomor) {
            String cleanedPlat = plat.replaceAll("[^0-9]", "");
            int platValue = Integer.parseInt(cleanedPlat);
            totalAngka += platValue;
        }

        // Memeriksa apakah totalAngka - 999999 dapat dibagi habis oleh 5
        if ((totalAngka - 999999) % 5 == 0) {
            System.out.println("berhenti"); // Output "berhenti" jika kondisi terpenuhi
        } else {
            System.out.println("jalan"); // Output "jalan" jika kondisi tidak terpenuhi
        }
    }
}



