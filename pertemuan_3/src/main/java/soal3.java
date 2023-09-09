/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad al fajri
 */
import java.util.Scanner;

public class soal3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan bilangan :");
            float A = sc.nextFloat();
            String operator = sc.next();
            float B = sc.nextFloat();
            
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("Program berakhir.");
                break;
            }

           

            float hasil = 0;

            switch (operator) {
                case "+":
                    hasil = A + B;
                    break;
                case "-":
                    hasil = A - B;
                    break;
                case "*":
                    hasil = A * B;
                    break;
                case "/":
                    if (B != 0) {
                        hasil = A / B;
                    } else {
                        System.out.println("Error: Pembagian oleh nol tidak diperbolehkan.");
                        continue; // Membaca operasi matematika berikutnya
                    }
                    break;
                case "%":
                    if (B !=0) {
                        hasil = A % B;
                    } else {
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                        continue; // Membaca operasi matematika berikutnya
                    }
                    break;
                default:
                    System.out.println("Error: Operator matematika tidak valid.");
                    continue; // Membaca operasi matematika berikutnya
            }

            System.out.println("Hasil: " + hasil);
        }
    }
}
