/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;

import java.util.Scanner;

/**
 *
 * @author cechinel
 */


public class TestaHeap {

       
    public static void printVet(int a[]){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    
    public static void main(String[] args){
    
        HeapSort heap = new HeapSort();
        
        Scanner leitor = new Scanner(System.in);
        int y = leitor.nextInt();
        int[] lugar=new int[y];

        for (int j=0; j<lugar.length; j++){
            lugar[j]=leitor.nextInt(); 
        }
        printVet(lugar);
        heap.heapSort(lugar, lugar.length);
        printVet(lugar);
        
    }
}
    

