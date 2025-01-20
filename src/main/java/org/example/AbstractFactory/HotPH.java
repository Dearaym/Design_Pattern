package org.example.AbstractFactory;

public class HotPH extends Panel{
    private String val;

    public HotPH(String val) {
        this.val = val;
    }

    public void afficher(){
        System.out.println(this.val);
    }
}
