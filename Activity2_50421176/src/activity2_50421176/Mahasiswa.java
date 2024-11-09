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
public class Mahasiswa {
    private String nama; //encapsulation
    private String npm;
    private int umur;
    
    public Mahasiswa(String nama, String npm, int umur){
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    
    public void tampilkanData(){
        System.out.println("Nama: "+ nama);
        System.out.println("NPM: "+ npm);
        System.out.println("Umur: "+ umur);
    }
}
