package estruturadedados;
public class TestaPilha {
  public static void main(String[]args){
      PilhaDeDados p=new PilhaDeDados(4);
      p.add(8);
      p.add(7);
      p.add(6);
      p.remove();
      System.out.println(p.toString());
  }  
}
