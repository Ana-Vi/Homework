package pkg202001;
/**
 * @author avbvi
 */
import java.util.*;
public class ImobiliariaMain {
    public static void main(String[]args){
        Imobiliaria imobiliaria= new Imobiliaria();
        Scanner aux= new Scanner(System.in);
        System.out.println("Ola bom dia, o que deseja fazer? Digite o número da operação");
        boolean on= true;
        while (on==true){
            System.out.println("1. Cadastrar Imóvel \n2.Listar Imóveis Cadastrados \n3.Procurar por Imóveis \n4.Excluir Imóvel\n5.Sair");
            int ordem= aux.nextInt();
            switch(ordem){
                case 1:
                    int cdg,q;
                    double a,pr;
                    String t;
                    System.out.println("Digite o código: ");
                    cdg=aux.nextInt();
                    System.out.println("Digite a área: ");
                    a=aux.nextDouble();
                    System.out.println("Digite o número de quartos: ");
                    q=aux.nextInt();
                    System.out.println("Digite o preço deste imóvel: ");
                    pr=aux.nextDouble();
                    System.out.println("Digite o tipo do imóvel: ");
                    t=aux.next();
                    Imovel imovel= new Imovel (cdg, a, q, pr, t);
                    imobiliaria.cadastraImovel(imovel);
                    break;
                
                case 2:
                    imobiliaria.exibeImoveis();
                    break;
                    
                case 3:
                    double prmax;
                    System.out.println("Digite o preço máximo para o imóvel que você busca: ");
                    prmax=aux.nextDouble();
                    imobiliaria.procuraImoveis(prmax);
                    break;
                
                case 4:
                    int ordemdel;
                    System.out.println("Deseja deletar: \n1.Todos os Imóveis \n2.Apenas um");
                    ordemdel=aux.nextInt();
                    if (ordemdel==1){
                        imobiliaria.deletaTodos();
                    
                    }else{
                    int cdgdel;
                    System.out.println("Digite o código do Imóvel a ser excluído: ");
                    cdgdel=aux.nextInt();
                    imobiliaria.deletaImovel(cdgdel);
                    }
                    break;
                    
                case 5:
                    System.out.println("Obrigada pelo seu tempo, tenha um ótimo dia.");
                    aux.close();
                    on=false;
                    break;
                default:
                    System.out.println("Comando incorreto.");
                    System.out.println("------------------------");
                    /*aux.close();
                    on=false;*/
                    break;
            }
        }
        
        
       
        
    }
}
