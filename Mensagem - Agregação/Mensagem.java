public class Mensagem {
    private String texto;
    private Contato destinatario;
    private Contato remetente;
    
    Mensagem(String t, Contato d, Contato r){
    this.texto=t;
    this.destinatario= d;
    this.remetente= r;
    }
    
    @Override
    public String toString(){
    return " Mensagem: " + this.texto + "\n Destinatario: " + this.destinatario + ".\n Remetente: " + this.remetente + ".";
    }
}
