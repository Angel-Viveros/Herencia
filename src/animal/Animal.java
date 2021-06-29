/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author angel
 */
public class Animal {
    
    //Atributos
private int numeroPatas;  
private int años;

    public Animal() {
    }

    public Animal(int numeroPatas, int años) {
        this.numeroPatas = numeroPatas;
        this.años = años;
    }
 
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", a\u00f1os=" + años + '}';
    }

    
    
    /**
     * @param args the command line arguments
     */
   
 public static void main(String[] args) {
 // TODO code application logic here
     
 Animal q1 = new Animal(4,5);
         System.out.println(q1);
         
         
         Perro w1 = new Perro ("Doberman", "Ladrar");
     System.out.println(w1);
     
     Gato e1 = new Gato("Bengala", "Maulla");
     System.out.println(e1);
     
 }

}

