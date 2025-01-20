package org.example.AbstractFactory;

public class FabriqueNormal extends FabriqueOG{
    @Override
    public ObjetGraphique createBouton() {
        return new Bouton("boutonNormal");
    }

    @Override
    public ObjetGraphique createPanel() {
        return new PH("PHNormal");
    }
}
