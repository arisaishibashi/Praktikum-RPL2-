/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1_50421176;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Activity1_50421176 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama anda: ");
        String  nama = input.nextLine();
        
        System.out.println("Masukkan npm anda: ");
        String  npm = input.nextLine();
        
        System.out.println("Masukkan umur anda: ");
        int  umur = input.nextInt();
        
        System.out.println("Nama anda adalah : " + nama);
        System.out.println("NPM anda adalah : " + npm);
        System.out.println("Umur anda : " + umur + "tahun");
        
    }
    
}
