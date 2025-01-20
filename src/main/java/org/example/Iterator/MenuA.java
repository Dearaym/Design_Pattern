package org.example.Iterator;

import java.util.ArrayList;

public class MenuA implements MenuIterable{
    private ArrayList<Plat> arrayPlats;

    public MenuA(){
        this.arrayPlats = new ArrayList<>();
    }

    @Override
    public IterateurPlat createIterateurPlat() {
        return new IterateurMA(this.arrayPlats);
    }

    public void addPlat(Plat plat){
        this.arrayPlats.add(plat);
    }

}
