package org.example.AbstractFactory;

public abstract class FabriqueOG {
    public static FabriqueOG createFabriqueOG(){       //je décide d'implémenter une fabrique normal
        return new FabriqueHot();
    }
    public abstract ObjetGraphique createBouton();
    public abstract ObjetGraphique createPanel();
}
