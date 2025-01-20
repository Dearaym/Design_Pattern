package org.example.AbstractFactory;

public class Bouton extends Control{
    private String val;

    public Bouton(String val) {
        this.val = val;
    }

    public void afficher(){
        System.out.println(this.val);
    }
}
