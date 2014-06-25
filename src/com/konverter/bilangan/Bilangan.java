/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konverter.bilangan;

/**
 * Class Bilangan
 * 
 * Untuk membuat objek bilangan dalam berbagai basis bilangan. Nantinya akan 
 * di extend oleh class bilangan lain dengan basis bilangan yang pasti seperti
 * class BilanganDesimal, Class BilanganBiner, Class BilanganOktal Class 
 * Bilangan Hexa
 * 
 * @author phpgeek
 */
public class Bilangan {
    private String angka;
    private int basis;
    private int angkaMaks;
    private char[] simbolAngka;
    
    public void Bilangan(String angka, int basis) {
        this.setAngka(angka);
        init(basis);
    }
    
    private void init(int basis) {
        if (basis == 2) {
            this.setBasis(2);
            this.angkaMaks = 1;
            this.simbolAngka = new char[]{'0','1'};
        } else if(basis == 8) {
            this.setBasis(8);
            this.angkaMaks = 7;
            this.simbolAngka = new char[] {'0','1','2','3','4','5','6','7'};
        } else if (basis == 10) {    
            this.setBasis(10);
            this.angkaMaks = 9;
            this.simbolAngka = new char[] {'0','1','2','3','4','5','6','7','8','9'};       
        } else {
            this.setBasis(16);
            this.angkaMaks = 15;
            this.simbolAngka = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        }
    }

    /**
     * @return the angka
     */
    public String getAngka() {
        return angka;
    }

    /**
     * @param angka the angka to set
     */
    public void setAngka(String angka) {
        this.angka = angka;
    }

    /**
     * @return the basis
     */
    public int getBasis() {
        return basis;
    }

    /**
     * @param basis the basis to set
     */
    public void setBasis(int basis) {
        this.basis = basis;
    }

    /**
     * @return the angkaMaks
     */
    public int getAngkaMaks() {
        return angkaMaks;
    }

    /**
     * @return the simbolAngka
     */
    public char[] getSimbolAngka() {
        return simbolAngka;
    }
    
}
