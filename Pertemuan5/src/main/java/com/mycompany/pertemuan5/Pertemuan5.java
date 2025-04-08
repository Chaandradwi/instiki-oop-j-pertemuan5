/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pertemuan5;

/**
 *
 * @author LAB F
 */
public class Pertemuan5 {

    public static void main(String[] args) {
        jajan pancong = new jajan();
        //pancong.Bentuk = "lonjong";
        pancong.setBentuk ("lonjong");
        pancong.rasa = "suka-suka";
        pancong.harga = 5000;
        pancong.warna = "pink";
        
        System.out.println("Bentuknya: "+pancong.getBentuk());
        
    }
}



