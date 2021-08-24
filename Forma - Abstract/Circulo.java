public class Circulo extends Forma{
    static final double PI=3.14;
    private double raio;
    
    Circulo (double r){
    setRaio(r);
    }
    void setRaio(double r){
        if (r>0) this.raio=r; else this.raio=0;
    }
    @Override
    public double getArea(){
    return this.raio*this.raio*PI;
    }
    @Override
    public double getPerimetro(){
    return 2*PI*this.raio;
    }
    @Override
    public String toString(){
    return " "+this.raio;
    }
}

/*public class Circulo extends Ponto2 {
    protected double raio;
    
    Circulo(){
    //chamada implícita
        setRaio(0);
    }
    Circulo(float x, float y,double raio){
    //chamada explícita
    //sempre o super vem antes
        super (x, y);
        this.raio= raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio){
        if(raio>0){
        this.raio= raio;
        }else{
        this.raio=0;
        }
    }
    public double area(){
        return Math.PI*this.raio*this.raio;
    }
    @Override
    /*public String toString(){
        return "Raio"+this.raio+". x: "+super.getX()+". y:"+super.getY();
        //return "Raio"+this.raio+". x: "+this.x+". y:"+this.y;
    }*/
    //outra forma de chamar a superclasse dentro do toString
    /*public String toString(){
        return super.toString()+ ". "+getClass().getName()+": Raio->"+this.raio+": Area-> "+this.area();
    }
}*/
