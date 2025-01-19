package org.example.Composite;

import java.awt.*;

public class Feuille implements Noeud{
    private String contenu;

    public Feuille(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public void afficher() {
        System.out.println(this.contenu);
    }

    @Override
    public String getContenu() {
        return this.contenu;
    }
}
