package org.example.Observateur;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GestionProduit gp = new GestionProduit(new ArrayList<>());
        gp.ajouterProduit(new Produit("bonbon"));

        Observateur obs1 = new Logger("logger");
        Observateur obs2 = new Historique("historique");
        gp.ajouterObservateur(obs1);
        gp.ajouterObservateur(obs2);
        gp.ajouterProduit(new Produit("pain"));
    }
}
