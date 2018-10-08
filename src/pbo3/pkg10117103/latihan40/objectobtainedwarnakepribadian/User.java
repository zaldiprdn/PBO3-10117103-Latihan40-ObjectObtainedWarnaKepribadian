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
 *  NAMA  :Rizaldi Perdana Seristian
    NIM   :10117103   
    KELAS :IF-3
 */
public class User {
    public String namaUser;
    Scanner scn = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namaUser = scn.next();
        System.out.println("(Developed by : Rizaldi Perdana Seristian)");

    }
    
}
