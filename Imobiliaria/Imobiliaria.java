package pkg202001;
import java.util.*;
/**
 * @author avbvi
 */
public class Imobiliaria {
    private ArrayList<Imovel>lista_de_imoveis;
    Imobiliaria(){
        lista_de_imoveis=new ArrayList<>();
    }
    public String MensagemExibeError(){
        return "Opa! Parece que não temos imóveis cadastrados. Cadastre para podermos exibir.\n";
    }
    public String MensagemExibeSucesso(){
        return "Exibido Imóveis Cadastrados com sucesso! \n";
    }
    public String MensagemCadastroSucesso(){
        return "Imóvel Cadastrado com Sucesso!\n";
    }
    public String MensagemError(){
        return "Não foi possível adicionar o Imóvel, pois já foi cadastrado um com o mesmo código.\n";
    }
    public String MensagemProcuraSucesso(){
        return "Achamos o resultado! Dê uma olhada nele. ";
    }
    public String MensagemProcuraError(){
        return "Não achamos imóveis com o preço menor que o preço máximo... \n";
    }
    public String MensagemExcluiNullError(){
        return "Opa! Não tem nenhum Imóvel Cadastrado para podermos excluir, cadastre algum.\n";
    }
    public String MensagemExcluiAcharError(){
        return "Opa! Não tem nenhum Imóvel Cadastrado com esse código para podermos excluir, cadastre algum.\n";
    }
    public String MensagemExcluiSucesso(){
        return "Imóvel excluído com sucesso. \n";
    }
    public String MensagemExcluiTodosSucesso(){
        return "Resetada lista de imóveis.\n";
    }
    public String LinhaInserida(){
        return "-------------------------------------";
    }
    
    void cadastraImovel(Imovel im){
        boolean naotem=true;
        for(Imovel item:lista_de_imoveis){
            if (item.getCodigo()== im.getCodigo()){
                naotem=false;
                break;
            }else{
                naotem=true;
            }
        }
        if (naotem==true){
            lista_de_imoveis.add(im);
            System.out.println(MensagemCadastroSucesso());
        }else{
            System.out.println(MensagemError());
        }
        
    }
    void exibeImoveis(){
        if(lista_de_imoveis.size()==0){
            System.out.println(MensagemExibeError());
        }else{
            System.out.println(MensagemExibeSucesso());
            for (Imovel item:lista_de_imoveis){
            System.out.println(item);
            System.out.println(LinhaInserida());
            
            }
        }
    }
    void procuraImoveis(double pmax){
        if(lista_de_imoveis.size()==0){
            System.out.println(MensagemExibeError());
        }else{
            int cont=0;
            for(Imovel item:lista_de_imoveis){
                if (item.getPreco()<pmax){
                    System.out.println(LinhaInserida());
                    System.out.println(MensagemProcuraSucesso());
                    System.out.println(item);
                    
                    cont++;
                }
            }if (cont==0){
                System.out.println(MensagemProcuraError());
            }
        }
    }
    void deletaTodos(){
        if (lista_de_imoveis.size()==0){
            System.out.println(MensagemExcluiNullError());
        }else{
            lista_de_imoveis.removeAll(lista_de_imoveis);
            System.out.println(MensagemExcluiTodosSucesso());
        }
    }
    void deletaImovel(int cdgdel){
        if (lista_de_imoveis.size()==0){
            System.out.println(MensagemExcluiNullError());
        }else{
            int cont=0;
            for (int i=0; i<lista_de_imoveis.size();i++){
                Imovel del=lista_de_imoveis.get(i);
                if(del.getCodigo()==cdgdel){
                    lista_de_imoveis.remove(del);
                    System.out.println(MensagemExcluiSucesso());
                    cont++;
                }
            }if (cont==0){
                System.out.println(MensagemProcuraError());
            }
        }
    }
}
