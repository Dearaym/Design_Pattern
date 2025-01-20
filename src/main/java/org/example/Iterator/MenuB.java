package org.example.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuB implements MenuIterable{
    private ArrayList<Plat> listPlats;

    public MenuB(){
        listPlats = new ArrayList<>();
    }

    @Override
    public IterateurPlat createIterateurPlat() {
        return new IterateurMB(this.listPlats);
    }

    public void addPlat(Plat plat){
        this.listPlats.add(plat);
    }
}
