public class TesteMensagem {
    public static void main(String[]args){
        Contato rem= new Contato("Nana", 85, 987864744);
        Contato dest= new Contato("Keko", 48, 991321208);
        Mensagem m= new Mensagem("Eu te amo xuxu", dest, rem);
        System.out.println(m);
    }
}
