/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan30.cakep;

import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk mengecek apakah latihan dikerjakan
 * sendiri atau tidak
 */
public class PBOIF210119064Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static String normal = "\u001b[0m";
    public static String red = "\u001b[31m";
    public static String green = "\u001b[32m";
    public static String yellow = "\u001b[33m";
    public static String blue = "\u001b[34m";
    public static String cyan = "\u001b[36m";
    public static String purple = "\u001b[35m";
    
    public static void tampil(String jawab){
        if ("Yoi".equals(jawab)) {
            System.out.println("");
            System.out.println(red + "Cakep Bener. " + purple + "Good Job");
        }else{
            System.out.println("");
            System.out.println(red + "Tetep cakep sih.");
            System.out.println(cyan + "Sing penting paham konsep nya yee.");
            System.out.println("Keep the code work dude");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String jawab;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(red + "Kamu " + green + "ngerjain sendiri " + yellow + "latihan 17 sampe " + blue + "latihan 30 ini?");
        System.out.print(blue + "Jawab " + red + "(Yoi/Enggak) : ");
        jawab = keyboard.next();
        
        tampil(jawab);
    }
    
}
