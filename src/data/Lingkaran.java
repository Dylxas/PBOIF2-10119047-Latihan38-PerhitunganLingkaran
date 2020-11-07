/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG LINGKARAN
 */

public class Lingkaran {
    public double diameter;
    public double jariJari;
    public double luas;
    public double keliling;
    public double phi=3.14159;
    
    public void getDiameter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Diameter Lingkaran : ");
        
        while (!input.hasNextDouble()){
            System.out.println("Nilai Diameter Tidak Sesuai\n ");
            System.out.print("Masukkan Nilai Diameter Lingkaran :");
            input.next();
        }
        diameter = input.nextDouble();
    }
    
    public double hasil(double parDiameter){
        System.out.println();
        System.out.println("=======Hasil Perhitungan Lingkaran=======");
        jariJari = diameter / 2;
        System.out.println("Jari jari lingkaran: " + jariJari+ " cm");
        
        luas = (phi * Math.pow(jariJari, 2));
        System.out.println("Luas Lingkaran: " + String.format("%.2f", jariJari)+ " cm");
        
        keliling = (2 * phi * jariJari);
        System.out.println("Keliling lingkaran: " + String.format("%.2f", keliling) + " cm");
        
        return(jariJari);    
    }
}
