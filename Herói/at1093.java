/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg202001;
import java.util.*;

/**
 *
 * @author avbvi
 */
public class at1093 {
    public static void main(String[]args){
        String[] vetH= new String[3];
        Double[] vetS= new Double[3];
        Scanner aux = new Scanner(System.in);
        Scanner aux1 = new Scanner(System.in);
        Scanner aux2 = new Scanner(System.in);
        Scanner aux3 = new Scanner(System.in);
        for(int i=0;i<vetH.length;i++){
            System.out.println("Add Herói");
            vetH[i]=aux.nextLine();
            System.out.println("Add Horas diárias");
            double horasT=aux1.nextDouble();
            System.out.println("Add Dias Trabalhados");
            int diasT=aux2.nextInt();
            System.out.println("Add Valor da Hora");
            double valorH=aux3.nextDouble();
            vetS[i]=calculoSalario(horasT, diasT, valorH);
        }
        aux.close();
        aux1.close();
        aux2.close();
        aux3.close();
        for(int o=0; o<vetH.length; o++){
            System.out.println("Herói:"+vetH[o]);
            System.out.println("Salario:" + String.format("%.2f",vetS[o]));
        }
    }
    public static double calculoSalario(double horasT, int diasT, double valorH){        
        return horasT*diasT*valorH;
    }

}

