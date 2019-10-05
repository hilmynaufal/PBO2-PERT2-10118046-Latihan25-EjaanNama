/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : mengeja nama yang di input
 */
public class PBO2PERT210118046Latihan25EjaanNama {

    /**
     * @param nami
     */
    
    public static void tampilNama(String nami) {
        System.out.println("Ejaan untuk '" + nami + "' adalah: ");
        for (int i = 0; i < nami.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + nami.charAt(i));
            
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama depan anda untuk di-eja: ");
        Scanner scanner = new Scanner(System.in);
        String nami = scanner.next();
        tampilNama(nami);
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
