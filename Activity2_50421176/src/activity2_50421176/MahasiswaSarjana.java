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
public class MahasiswaSarjana extends Mahasiswa { //innheritance
    private String jurusan;
    
    
    public MahasiswaSarjana(String nama, String npm, int umur, String jurusan){
        super(nama, npm, umur);
        this.jurusan = jurusan;
    }
    
    @Override //polymorphism
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Jurusan: " + jurusan);
    }
  
}
