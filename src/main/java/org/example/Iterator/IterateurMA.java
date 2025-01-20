package org.example.Iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class IterateurMA implements IterateurPlat{
    private ArrayList<Plat> plats;
    private int courant = -1;

    public IterateurMA(ArrayList<Plat> plats){
        this.plats = plats;
    }

    @Override
    public boolean hasNext() {
        return (courant+1<plats.size());
    }

    @Override
    public Plat next() {
        if(!hasNext()) return null;
        return this.plats.get(++courant);
    }
}
