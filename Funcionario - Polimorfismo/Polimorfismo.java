public class Polimorfismo {
    public static void main (String[]args){
        //chamando a classe através de vetores
        String []listac= {"Chefe", "Comissionado"};
        Funcionario [] listaf= new Funcionario[2];
        for(int i=0;i<listac.length;i++){
            if(listac[i]=="Chefe"){
                listaf[i]= new Chefe ("Leonam", "Chagas", 1000);
            }if(listac[i]=="Comissionado"){
                listaf[i]= new Comissionado("Ana", "Vitoria", 500,0.20,10);
            }
        }
        for (int a=0; a < listaf.length;a++){
            System.out.println(listaf[a]+" "+listaf[a].salario());
        }
/*        
//em um vetor
        Funcionario [] listaf= new Funcionario[2];
        listaf[0]= new Chefe ("Leonam", "Chagas", 1000);
        listaf[1]= new Comissionado("Ana", "Vitoria", 500,0.20,10);
        for (int a=0; a < listaf.length;a++){
            System.out.println(listaf[a]);
            System.out.println(listaf[a].salario());
        }   */    
                
        
            
        //listaf[0]= new listac[0]("Leonam", "Chagas", 1000);
        //listaf[1]= new listac[1]("Ana", "Vitoria", 500,0.20,10);
        
        
        /*//fazendo uma variável que chama as classes filhas
        Funcionario geral;
        Chefe chefe=new Chefe("Leonam", "Chagas", 1000);
        geral=chefe;
        System.out.println(geral);
        System.out.println(geral.salario());
        
        Comissionado func = new Comissionado("Ana", "Vitoria", 500,0.20,10);
        geral=func;
        System.out.println(geral);
        System.out.println(geral.salario());
        */
        /*//normal
        Funcionario chefe=new Chefe("Leonam", "Chagas", 1000);
        System.out.println(chefe);
        System.out.println(chefe.salario());
        
        Funcionario func = new Comissionado("Ana", "Vitoria", 500,0.2,10);
        System.out.println(func);
        System.out.println(func.salario());*/
    }
}
