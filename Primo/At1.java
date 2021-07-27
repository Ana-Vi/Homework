package pkg202001;

import java.util.Scanner;
public class At1 {

    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int count, y ;
        count=0;
        boolean primo;
        y=aux.nextInt();
        aux.close();
        for (int i=2; i<=y; i++){
            primo= true;
            for (int j=2; j<=(i/2); j++){
                if (i%j==0){
                primo = false;
                break;
            }
        }
        if (primo){
            count=count+1;
            
                 
        }
        }
        System.out.println(count);
    }
    
}
