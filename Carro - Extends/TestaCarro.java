public class TestaCarro {
    public static void main(String[]args){
    Carro c= new CarroAutomatico("gol", "volks", (float)1.5, "cvt");
    System.out.println(c);
    Carro a= new CarroManual("prisma", "fiat", (float)2.5, 5);
    System.out.println(a);
    
    }
}
