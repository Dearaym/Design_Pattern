package org.example.Composite;

public class App {
    public static void main(String[] args) {

        //Consrtuction de la structure arborescente
        Parent racine = new Parent("Racine");
        Noeud p3 = new Feuille("p3");
        Parent p1 = new Parent("P1");
        Noeud p2 = new Feuille("p2");
        Noeud f1 = new Feuille("f1");
        Noeud f2 = new Feuille("f2");
        racine.addChild(p3);
        racine.addChild(p1);
        racine.addChild(p2);
        p1.addChild(f1);
        p1.addChild(f2);

        //Affichage à partir de la racine
        racine.afficher();      //on a bien toute la structure arborescente

    }
}
