package prova1;
/**
 *
 * @author avbvi
 */
public class FilaAbstract {
    private Nodo head;
    private Nodo tail;
    
    FilaAbstract(){
        head=null;
        tail=null;
    }
    
    protected void enfileirarReverso(Integer valor){
        Nodo novo = new Nodo();
        novo.setValor(valor);
        if(head==null){
            novo.setProximo(head);
            head=novo;
            tail=head;
        }else{
            novo.setProximo(head);
            head=novo;
        }
    }
    protected void desenfileirarReverso(){
        if(head==tail){
            tail=head=null;
        }else{
            Nodo temp=head;
            while(temp.getProximo()!=tail){
                temp=temp.getProximo();
            }
            tail=temp;
            temp.setProximo(null);
        }
    }
    protected void enfileirar(Integer valor){
        Nodo novo = new Nodo();
        novo.setValor(valor);
        if(head==null){
            novo.setProximo(head);
            head=novo;
            tail = head;
        }else{
            tail.setProximo(novo);
            tail=novo;
            //inserir anterior;
        }
    }
    protected Integer desenfileirar(){
        int retorno = head.getValor();
        if(head==tail){
            tail=head=null;
        }else{
            head=head.getProximo();
        }
        //return retirado
        return retorno;
    }
    protected boolean mesclar(FilaAbstract f){
        Nodo novo = new Nodo();
        if(this.head==null){
            novo.setValor(f.head.getValor());
            for(Nodo x = f.head; x!= null; x=x.getProximo()){
                novo.setProximo(f.head.getProximo());
                head = novo;
                tail=head;
            }return false;
        }else if(f.head==null){
            return false;
        }else{            
            tail.setProximo(f.head);
            tail=f.tail;
            return true;
        }   
    }
    protected boolean inverter(){
        if(this.head == null){
            return false;
        }else{
            for (Nodo x = this.head; x != null; x = x.getProximo()) {
                enfileirarReverso(x.getValor());
            }
            for(Nodo x = this.head; x != null; x = x.getProximo()){
                desenfileirarReverso();
            }
    
            
            return true;
        }
    }
    @Override
    public String toString() {
        if(head==null){
            return "Lista vazia!";
        }else{
            String str = "Fila [head=" + head.getValor() + ", tail=" + tail.getValor() + "]";
            for (Nodo x = this.head; x != null; x = x.getProximo()) {
                    str += x.getValor();
                    if (x.getProximo() != null)  str += " --> ";
            }
            return str;
        }
    }

}