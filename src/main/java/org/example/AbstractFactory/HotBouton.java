package org.example.AbstractFactory;

public class HotBouton extends Control{
    private String val;

    public HotBouton(String val) {
        this.val = val;
    }

    public void afficher(){
        System.out.println(this.val);
    }
}
