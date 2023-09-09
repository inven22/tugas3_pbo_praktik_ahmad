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
import java.math.*;

public class soal6 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = getInput(in);
        BigInteger b = getInput(in);
        
        printTambah(a, b);
        printKali(a, b);
    }
    
    public static BigInteger getInput(Scanner in) {
        
        return in.nextBigInteger();
    }

    public static void printTambah(BigInteger a, BigInteger b) {
        BigInteger tambah = a.add(b);
        System.out.println("jika ditambah hasil :" + tambah);
    }

    public static void printKali(BigInteger a, BigInteger b) {
        BigInteger kali = a.multiply(b);
        System.out.println("jika dikali hasil : " + kali);
    }
}
