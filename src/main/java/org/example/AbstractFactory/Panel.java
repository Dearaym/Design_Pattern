package org.example.AbstractFactory;

import org.example.Composite.Noeud;

import java.util.ArrayList;

public abstract class Panel implements ObjetGraphique {
    private String valeur;
    private ArrayList<ObjetGraphique> children;

    public void addChild(ObjetGraphique child){
        this.children.add(child);
    }
}
