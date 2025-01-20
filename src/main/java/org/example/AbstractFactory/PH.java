package org.example.AbstractFactory;

public class PH extends Panel{
    private String val;

    public PH(String val) {
        this.val = val;
    }

    public void afficher(){
        System.out.println(this.val);
    }
}
