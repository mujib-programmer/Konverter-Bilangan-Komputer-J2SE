package com.konverter.tes;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.konverter.bilangan.BilanganBiner;
import com.konverter.bilangan.BilanganDesimal;

/**
 *
 * @author phpgeek
 */
public class TesBilanganDesimal {
    public static void main(String[] args) {
        int intAngkaDesimal = 583;
        String angkaDesimal = Integer.toString(intAngkaDesimal);
        
        BilanganDesimal bilDesimal = new BilanganDesimal(angkaDesimal);
        BilanganBiner bilBiner = bilDesimal.konversiKeBiner();
        
        System.out.println(bilBiner.getAngka());
        
        String bBiner = "1001000111";
        BilanganDesimal bDesimal = new BilanganDesimal("0");
        bDesimal.konversiDariBiner(bBiner);
        
    }
}
