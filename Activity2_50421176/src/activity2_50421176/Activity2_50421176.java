/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2_50421176;

/**
 *
 * @author LENOVO
 */
public class Activity2_50421176 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa("Annisa", "50421176", 21);
        mahasiswa.tampilkanData();
        System.out.println();
     
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana("Dazai", "50421678", 21, "Teknik Industri");
        mahasiswaSarjana.tampilkanData();
    }
    
}
