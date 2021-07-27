package atividades;
public class TestaTarefa21902 {
    public static void main(String[]args){
        Tarefa21902 t=new Tarefa21902(3);
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.remove();
        System.out.println(t.toString());
    }
    
}
