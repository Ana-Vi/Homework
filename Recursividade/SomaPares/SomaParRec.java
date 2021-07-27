
package estruturadedados;

/**
 *
 * @author avbvi
 */
public class SomaParRec {
    public static void main(String[]args){
        System.out.println(somarPares(10));
        System.out.println(somarPares(11));
    }

public static int somarPares(int n){
    if(n==0){ 
        return 0;
    }
    if(n%2==0){
        return n+somarPares(n-2);
    }else{
        return somarPares(n-1);
}
}
}