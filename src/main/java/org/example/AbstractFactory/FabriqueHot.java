package org.example.AbstractFactory;

public class FabriqueHot extends FabriqueOG{
    @Override
    public ObjetGraphique createBouton() {
        return new HotBouton("HotBouton");
    }

    @Override
    public ObjetGraphique createPanel() {
        return new HotPH("HotPH");
    }
}
