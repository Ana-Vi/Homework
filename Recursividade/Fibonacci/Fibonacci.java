/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author avbvi
 */
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner aux= new Scanner(System.in);
        int a, f;
        a=aux.nextInt();
        f=fibonacci(a);
        System.out.println(f);
    }
    public static int fibonacci(int n){
        if (n==1||n==2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
}