package pkg202001;

 public class Swapper{
    private int x, y;
    int a;
    
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    void setX(int xis){
        this.x= xis;
    }
    void setY(int ypisilon){
        this.y= ypisilon;
    }
    void swap(){
        this.a= this.x;
        this.x= this.y;
        this.y= this.a;
        
    }
    @Override
    public String toString(){
        return this.x + " \n" + this.y;
        
    }
}