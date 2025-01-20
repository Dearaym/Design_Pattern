package org.example.AbstractFactory;

public class App {
    public static void main(String[] args) {
        FabriqueOG f = FabriqueOG.createFabriqueOG();       //méthode fabrique statique pour récupérer la fabrique. Ici créé une frabrique hot

        //creation des éléments avec les autres méthodes de fabrique
        ObjetGraphique bouton = f.createBouton();
        ObjetGraphique panel = f.createPanel();
        bouton.afficher();
        panel.afficher();

        //si je change la méthode createFabrique, je peux choisir si je créé des object graphique hot ou normaux

        //Je peux également créer directement une fabrique Hot ou normal dans l'app
        FabriqueOG f2 = new FabriqueNormal();
        ObjetGraphique bouton2 = f2.createBouton();
        ObjetGraphique panel2 = f2.createPanel();
        bouton2.afficher();
        panel2.afficher();
    }
}
