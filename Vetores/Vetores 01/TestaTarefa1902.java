package atividades;
public class TestaTarefa1902 {
    public static void main(String[]args){
        Tarefa1902 a=new Tarefa1902(3);
        a.add("1");
        a.add("2");
        a.add("UFSC");
        System.out.println(a.getDados());
        a.remove();
        System.out.println(a.getDados());
        System.out.println(a.getLast());
    }
    
}
