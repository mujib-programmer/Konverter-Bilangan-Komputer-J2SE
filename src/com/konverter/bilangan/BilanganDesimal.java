package com.konverter.bilangan;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phpgeek
 */
public class BilanganDesimal extends Bilangan {
    private ArrayList<String> pesan;
    
    public BilanganDesimal(String angka) {
        super.Bilangan(angka, 10);
        
    }
    
    public BilanganBiner konversiKeBiner() {
        // inisiasi objek bilangan biner 0
        BilanganBiner bilBiner = new BilanganBiner("0");
        
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.pesan = new ArrayList<>();
        this.getPesan().add( "angka = " + this.getAngka() + ", basis " +  this.getBasis() );
        this.getPesan().add("---------------------------------------------");  
        
        //inisiasi variabel-variabel yang diperlukan untuk proses konversi """
        int sisaHasilBagi = 0;
        int hasilBagi = Integer.parseInt( this.getAngka() ) ;
        
        //list angka hasil konversi sepenuhnya dalam bentuk string
        //agar bisa mengadopsi simbol angka hexadesimal juga
        String angkaHasilKonversi = new String();
        int jumlahPerulangan = 0;
        
        while ( hasilBagi > bilBiner.getAngkaMaks() ) {
                int BilanganSebelumnya = hasilBagi;
                sisaHasilBagi = BilanganSebelumnya % bilBiner.getBasis();
                hasilBagi = (BilanganSebelumnya - sisaHasilBagi) / bilBiner.getBasis();
            
                //tambahkan sisa hasil bagi ke list angka hasil konversi
                angkaHasilKonversi += Character.toString( bilBiner.getSimbolAngka()[sisaHasilBagi] );
                
                //tambahkan keterangan proses yang terjadi pada list pesan
                this.getPesan().add( BilanganSebelumnya + " : " + bilBiner.getBasis() + " = " + hasilBagi + ", sisa " + sisaHasilBagi );
                
                //tambahkan 1 jumlah perulangan """
                jumlahPerulangan += 1;
        }
                
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.getPesan().add( hasilBagi + " : " + bilBiner.getBasis() + " = " + 0 + ", sisa " + hasilBagi );
        //tambahkan sisa hasil bagi terakhir ke list angka hasil konversi
        angkaHasilKonversi +=  Character.toString( bilBiner.getSimbolAngka()[hasilBagi] );  
         
            
        //balik urutan string angka hasil konversi
        angkaHasilKonversi = new StringBuffer(angkaHasilKonversi).reverse().toString(); 
        
        //tambahkan keterangan proses yang terjadi pada list pesan """ 
        this.getPesan().add( "---------------------------------------------" );
        this.getPesan().add( "Bilangan Binernya adalah " + angkaHasilKonversi );
        this.getPesan().add( "=============================================" );
        this.getPesan().add( "" );

        //tampilkan pesan """
        tampilkanPesan();
        
        // isi angka bilangan biner hasil konversi
        bilBiner.setAngka( angkaHasilKonversi );
        
        // kembalingan objek bilangan biner hasil konversi
        return bilBiner;
    }
    
    public BilanganOktal konversiKeOktal() {
        // inisiasi objek bilangan biner 0
        BilanganOktal bilOktal = new BilanganOktal("0");
        
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.pesan = new ArrayList<>();
        this.getPesan().add( "angka = " + this.getAngka() + ", basis " +  this.getBasis() );
        this.getPesan().add("---------------------------------------------");  
        
        //inisiasi variabel-variabel yang diperlukan untuk proses konversi """
        int sisaHasilBagi = 0;
        int hasilBagi = Integer.parseInt( this.getAngka() ) ;
        
        //list angka hasil konversi sepenuhnya dalam bentuk string
        //agar bisa mengadopsi simbol angka hexadesimal juga
        String angkaHasilKonversi = new String();
        int jumlahPerulangan = 0;
        
        while ( hasilBagi > bilOktal.getAngkaMaks() ) {
                int BilanganSebelumnya = hasilBagi;
                sisaHasilBagi = BilanganSebelumnya % bilOktal.getBasis();
                hasilBagi = (BilanganSebelumnya - sisaHasilBagi) / bilOktal.getBasis();
            
                //tambahkan sisa hasil bagi ke list angka hasil konversi
                angkaHasilKonversi += Character.toString( bilOktal.getSimbolAngka()[sisaHasilBagi] );
                
                //tambahkan keterangan proses yang terjadi pada list pesan
                this.getPesan().add( BilanganSebelumnya + " : " + bilOktal.getBasis() + " = " + hasilBagi + ", sisa " + sisaHasilBagi );
                
                //tambahkan 1 jumlah perulangan """
                jumlahPerulangan += 1;
        }
                
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.getPesan().add( hasilBagi + " : " + bilOktal.getBasis() + " = " + 0 + ", sisa " + hasilBagi );
        //tambahkan sisa hasil bagi terakhir ke list angka hasil konversi
        angkaHasilKonversi +=  Character.toString( bilOktal.getSimbolAngka()[hasilBagi] );  
         
            
        //balik urutan string angka hasil konversi
        angkaHasilKonversi = new StringBuffer(angkaHasilKonversi).reverse().toString(); 
        
        //tambahkan keterangan proses yang terjadi pada list pesan """ 
        this.getPesan().add( "---------------------------------------------" );
        this.getPesan().add( "Bilangan Oktalnya adalah " + angkaHasilKonversi );
        this.getPesan().add( "=============================================" );
        this.getPesan().add( "" );

        //tampilkan pesan """
        tampilkanPesan();
        
        // isi angka bilangan biner hasil konversi
        bilOktal.setAngka( angkaHasilKonversi );
        
        // kembalingan objek bilangan biner hasil konversi
        return bilOktal;
    }
    
    public BilanganHexa konversiKeHexa() {
        // inisiasi objek bilangan biner 0
        BilanganHexa bilHexa = new BilanganHexa("0");
        
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.pesan = new ArrayList<>();
        this.getPesan().add( "angka = " + this.getAngka() + ", basis " +  this.getBasis() );
        this.getPesan().add("---------------------------------------------");  
        
        //inisiasi variabel-variabel yang diperlukan untuk proses konversi """
        int sisaHasilBagi = 0;
        int hasilBagi = Integer.parseInt( this.getAngka() ) ;
        
        //list angka hasil konversi sepenuhnya dalam bentuk string
        //agar bisa mengadopsi simbol angka hexadesimal juga
        String angkaHasilKonversi = new String();
        int jumlahPerulangan = 0;
        
        while ( hasilBagi > bilHexa.getAngkaMaks() ) {
                int BilanganSebelumnya = hasilBagi;
                sisaHasilBagi = BilanganSebelumnya % bilHexa.getBasis();
                hasilBagi = (BilanganSebelumnya - sisaHasilBagi) / bilHexa.getBasis();
            
                //tambahkan sisa hasil bagi ke list angka hasil konversi
                angkaHasilKonversi += Character.toString( bilHexa.getSimbolAngka()[sisaHasilBagi] );
                
                //tambahkan keterangan proses yang terjadi pada list pesan
                this.getPesan().add( BilanganSebelumnya + " : " + bilHexa.getBasis() + " = " + hasilBagi + ", sisa " + sisaHasilBagi );
                
                //tambahkan 1 jumlah perulangan """
                jumlahPerulangan += 1;
        }
                
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.getPesan().add( hasilBagi + " : " + bilHexa.getBasis() + " = " + 0 + ", sisa " + hasilBagi );
        //tambahkan sisa hasil bagi terakhir ke list angka hasil konversi
        angkaHasilKonversi +=  Character.toString( bilHexa.getSimbolAngka()[hasilBagi] );  
         
            
        //balik urutan string angka hasil konversi
        angkaHasilKonversi = new StringBuffer(angkaHasilKonversi).reverse().toString(); 
        
        //tambahkan keterangan proses yang terjadi pada list pesan """ 
        this.getPesan().add( "---------------------------------------------" );
        this.getPesan().add( "Bilangan Hexanya adalah " + angkaHasilKonversi );
        this.getPesan().add( "=============================================" );
        this.getPesan().add( "" );

        //tampilkan pesan """
        tampilkanPesan();
        
        // isi angka bilangan biner hasil konversi
        bilHexa.setAngka( angkaHasilKonversi );
        
        // kembalingan objek bilangan biner hasil konversi
        return bilHexa;
    }
    
    public BilanganDesimal konversiDariBiner(String angkaBiner) {
        // buat objek bilangan biner dari angkaBiner
        BilanganBiner bilBiner = new BilanganBiner(angkaBiner);
        
        //tambahkan keterangan proses yang terjadi pada list pesan
        this.pesan = new ArrayList<>();
        this.getPesan().add( "angka = " + bilBiner.getAngka() + ", basis " +  bilBiner.getBasis() );
        this.getPesan().add("---------------------------------------------");
          
        //ubah angka bilangan asal menjadi list angka
        String angkaBilBiner = bilBiner.getAngka();            
            
        //balik urutan angka
        angkaBilBiner = new StringBuffer(angkaBilBiner).reverse().toString();
 
          
        int jumlahPerulangan = 0;
        int angkaHasilKonversi = 0;
        int tmpHasilKonversi;
        for (char cAngka: angkaBilBiner.toCharArray()) {     
            // kalikan setiap karakter dari angka dengan basis pangkat jumlah perulangan
            int intAngka = Character.getNumericValue(cAngka);
            int basisPangkatPerulangan = (int) Math.pow((double) bilBiner.getBasis(), (double) jumlahPerulangan);
            tmpHasilKonversi = intAngka * basisPangkatPerulangan;
            
            //tambahankan dengan hasil konversi sebelumnya
            angkaHasilKonversi += tmpHasilKonversi;
            
            //tambahkan keterangan proses yang terjadi pada list pesan """
            this.getPesan().add( cAngka + " * " + bilBiner.getBasis() + "^" + jumlahPerulangan + " = " + tmpHasilKonversi );
                               
            jumlahPerulangan += 1;
        }
        
        this.setAngka(Integer.toString(angkaHasilKonversi));
        
        //tambahkan keterangan proses yang terjadi pada list pesan """ 
        this.getPesan().add( "---------------------------------------------" );
        this.getPesan().add( "Bilangan Desimalnya adalah " + this.getAngka() );
        this.getPesan().add( "=============================================" );
        this.getPesan().add( "" );                

            
        //tampilkan pesan """
        tampilkanPesan();
            
        return this;  
    }
    
    private void tampilkanPesan() {
        this.getPesan().stream().forEach((isiPesan) -> {
            System.out.println(isiPesan);
        });
            
    }

    /**
     * @return the pesan
     */
    public ArrayList<String> getPesan() {
        return pesan;
    }
    
    
}
