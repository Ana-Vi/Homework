package estruturadedados;
/**
 *
 * @author avbvi
 */
public class Fatorial {
    public int Fatorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*Fatorial(n-1);
        }
    }
}