public class Ex4{
    public static void main (String [] args){
        //fibonacci//
        int ant, pr, suc;
        ant=0;
        pr=1;
        System.out.print(ant+ " "+ pr);
        for (int i = 2; i<21; i++){
            suc=pr+ant;
            ant=pr;
            pr= suc;
            System.out.print(" "+pr);
        }
    }
}