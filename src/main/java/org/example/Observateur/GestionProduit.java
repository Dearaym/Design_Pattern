package org.example.Observateur;

import java.util.ArrayList;
import java.util.Observer;

public class GestionProduit {
    private ArrayList<Produit> produits;
    private ArrayList<Observateur> obs;

    public GestionProduit(ArrayList<Produit> produits) {
        this.produits = produits;
        this.obs = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println("j'ajoute un produit");
        this.notifierTous();
    }

    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
        this.notifierTous();
    }

    protected void notifierTous(){
        for(Observateur o : obs){
            o.notifier();
        }
    }

    public void ajouterObservateur(Observateur o){
        obs.add(o);
    }

    public void supprimerObservateur(Observateur o){
        obs.remove(o);
    }
}
