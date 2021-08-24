package moni;

/**
 *
 * @author avbvi
 */
public class at1096 {
    public static void main (String [] args){
        Animal a = new Animal(4.25, "Chihuahua", 0.50, 1.50, "Branco");
        Animal b = new Animal(4.25, "Chihuahua", 0.50, 1.50, "Branco");
        System.out.println(a.equals(b));
    }
}