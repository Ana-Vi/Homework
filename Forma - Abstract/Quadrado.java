public class Quadrado extends Forma{
    private double lado;
    Quadrado(double l){
        setLado(l);
    }
    void setLado(double eli){
    if(lado>0) this.lado=eli;else this.lado=0;
    }
    @Override
    public double getArea(){
    return (this.lado)*this.lado;
    }
    @Override
    public double getPerimetro(){
    return this.lado*4;
    }
    @Override
    public String toString(){
    return " "+this.lado;
    }
}
/*public class Quadrado {
    float lado, result, a, p;
    void calcArea(){
    this.result= (this.lado)*(this.lado);
    }
    void calcPerim(){
    this.result= (this.lado)*4;
    }
    void aumentaQuad(float aum){
    this.result= (this.lado)+aum;
    this.a= this.result*this.result;
    this.p= this.result*4;
    }
}
*/