package com.konverter.bilangan;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phpgeek
 */
public class BilanganOktal extends Bilangan {
    private ArrayList<String> pesan = new ArrayList<>();
    
    public BilanganOktal(String angka) {
        super.Bilangan(angka, 8);
    }
    
    public BilanganDesimal konversiKeDesimal() {
        // buat objek bilangan biner dari angkaBiner
        BilanganDesimal bilDesimal = new BilanganDesimal("0");
        
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.setPesan(new ArrayList<>());
        this.getPesan().add( "angka = " + this.getAngka() + ", basis " +  this.getBasis() );
        this.getPesan().add("---------------------------------------------");
          
        //ubah angka bilangan asal menjadi list angka
        String angkaBilBiner = this.getAngka();            
            
        //balik urutan angka
        angkaBilBiner = new StringBuffer(angkaBilBiner).reverse().toString();
 
          
        int jumlahPerulangan = 0;
        int angkaHasilKonversi = 0;
        int tmpHasilKonversi;
        for (char cAngka: angkaBilBiner.toCharArray()) {     
            // kalikan setiap karakter dari angka dengan basis pangkat jumlah perulangan
            int intAngka = Character.getNumericValue(cAngka);
            int basisPangkatPerulangan = (int) Math.pow((double) this.getBasis(), (double) jumlahPerulangan);
            tmpHasilKonversi = intAngka * basisPangkatPerulangan;
            
            //tambahankan dengan hasil konversi sebelumnya
            angkaHasilKonversi += tmpHasilKonversi;
            
            //tambahkan keterangan proses yang terjadi pada list pesan """
            this.getPesan().add( cAngka + " * " + this.getBasis() + "^" + jumlahPerulangan + " = " + tmpHasilKonversi );
                               
            jumlahPerulangan += 1;
        }
        
        //isi angka desimal dengan hasil konversi
        bilDesimal.setAngka(Integer.toString(angkaHasilKonversi));
        
        //tambahkan keterangan proses yang terjadi pada list pesan """ 
        this.getPesan().add( "---------------------------------------------" );
        this.getPesan().add( "Bilangan Desimalnya adalah " + bilDesimal.getAngka() );
        this.getPesan().add( "=============================================" );
        this.getPesan().add( "" );                

            
        //tampilkan pesan """
        tampilkanPesan();
        
        return bilDesimal;
    }
    
    public BilanganBiner konversiKeBiner() {
        BilanganBiner bilBiner = new BilanganBiner("0");
        
        // buat objek bilangan desimal untuk kemudian dikonversi ke biner
        BilanganDesimal bilDesimal = this.konversiKeDesimal();
        
        // konversi dari desimal ke biner
        bilBiner =  bilDesimal.konversiKeBiner();
        
        // dapatkan pesan konversi dari desimal ke oktal
        this.setPesan(bilDesimal.getPesan());
        
        // kembalikan objek bilangan oktal
        return bilBiner;
    }
    
    public BilanganHexa konversiKeHexa() {
        BilanganHexa bilHexa = new BilanganHexa("0");
        
        // buat objek bilangan desimal untuk kemudian dikonversi ke biner
        BilanganDesimal bilDesimal = this.konversiKeDesimal();
        
        // konversi dari desimal ke biner
        bilHexa =  bilDesimal.konversiKeHexa();
        
        // dapatkan pesan konversi dari desimal ke oktal
        this.setPesan(bilDesimal.getPesan());
        
        // kembalikan objek bilangan oktal
        return bilHexa;
    }

    /**
     * @return the pesan
     */
    public ArrayList<String> getPesan() {
        return pesan;
    }

    /**
     * @param pesan the pesan to set
     */
    public void setPesan(ArrayList<String> pesan) {
        this.pesan = pesan;
    }
    
    private void tampilkanPesan() {
        this.getPesan().stream().forEach((isiPesan) -> {
            System.out.println(isiPesan);
        });
            
    }
}
