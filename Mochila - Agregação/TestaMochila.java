/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avbvi
 */
public class TestaMochila {
    public static void main(String[]args){
        Caderno c = new Caderno(10,100,2021,24.50);
        Estojo e = new Estojo(8, 1990, 12.90);
        Mochila m = new Mochila(c,e,350.00);
        System.out.println(m);
    }
}
