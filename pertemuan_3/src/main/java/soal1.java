/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad al fajri
 */
import java.io.*;
import java.util.*;

public class soal1 {
    public static void main(String[] args) {
    System.out.print("Masukkan input: ");
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();
    String originalString = s; 
    s = s.trim();
    if (s.length() == 0) {
        System.out.println(0);
    } else {
        String[] strings = s.split("['!?,._@ ]+");
        System.out.println(strings.length);
        for (String str : strings)
            System.out.println(str);
    }
    
    
       
}

}
