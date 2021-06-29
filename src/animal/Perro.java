/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class Perro extends Animal {
    
    private String raza;
    private String hablar;

    public Perro() {
    }

    
    public Perro(String raza, String hablar) {
        this.raza = raza;
        this.hablar = hablar;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", hablar=" + hablar + '}';
    }

    
    
    
   
   
    
    
    
    
}
