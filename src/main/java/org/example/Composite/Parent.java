package org.example.Composite;

import java.awt.*;
import java.util.ArrayList;

public class Parent implements Noeud {
    private String valeur;
    private ArrayList<Noeud> children;

    public Parent(String valeur) {
        this.valeur = valeur;
        this.children = new ArrayList<>();
    }

    @Override
    public void afficher() {
        System.out.println(this.valeur);
        for (Noeud noeud : children) {
            noeud.afficher();
        }
    }

    @Override
    public String getContenu() {
        String result = this.valeur;
        for (Noeud noeud : children) {
            result += noeud.getContenu();
        }
        return result;
    }

    public void addChild(Noeud noeud) {
        this.children.add(noeud);
    }
}
