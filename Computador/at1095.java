/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg202001;

/**
 *
 * @author avbvi
 */
public class at1095 {
    public static void main(String[]args){
        //criação dos computadores
        Computador c1 = new Computador("ASX001", "I3", "Asus", "GTX 1050", 5000);
        Computador c2 = new Computador("ASX002", "I5", "Gigabyte", "GTX 1660 Super", 6000);
        Computador c3 = new Computador("ASX003", "I9", "Gigabyte", "GTX 1650 Super", 7000);
        Computador c4 = new Computador("ASX004", "Ryzen 5", "Gigabyte", "RTX 580", 6300);
        //impressão antes de aplicar os descontos
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //aplicação dos descontos
        c1.aplicaDesconto(10);
        c2.aplicaDesconto(20);
        //impressão após aplicação dos descontos
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
    
}

