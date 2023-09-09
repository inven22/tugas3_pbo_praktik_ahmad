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

public class soal2 {
   public static void main(String[] args) {
    System.out.println("================================");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        System.out.print("Masukkan input: ");
        String s1 = sc.next();
        int x = sc.nextInt();
        System.out.printf("%-20s%04d%n", "Hasil : " + s1, x); 
    }
    System.out.println("================================");
}


}
