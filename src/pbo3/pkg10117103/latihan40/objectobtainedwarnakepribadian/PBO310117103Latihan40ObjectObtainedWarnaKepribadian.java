/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117103.latihan40.objectobtainedwarnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Rizaldi
 * NAMA  :Rizaldi Perdana Seristian
    NIM   :10117103   
    KELAS :IF-3
 */
public class PBO310117103Latihan40ObjectObtainedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Warna wrn = new Warna();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ usr.namaUser.toUpperCase()+"====");
        wrn.tesKepribadian(wrn.namaWarna,usr.namaUser);

    }
    
}
