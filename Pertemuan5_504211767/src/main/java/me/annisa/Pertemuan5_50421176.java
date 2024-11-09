/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.annisa;
import me.annisa.contoller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author LENOVO
 */

@SpringBootApplication
public class Pertemuan5_50421176 implements CommandLineRunner {
    @Autowired
    private MahasiswaController mhsController;

    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_50421176.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        mhsController.tampilkanMenu();
    }
}
