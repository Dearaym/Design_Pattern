package org.example.MethodTemplate;

import java.util.ArrayList;

public abstract class TriObjet<T> {
    public abstract int comparer(Object obj1, Object obj2);

    public void tri(ArrayList<T> list){
        System.out.println("algo de tri dans TriObjet");
        int i=0;
        this.comparer(list.get(i), list.get(i + 1));    //appel de la méthode abstraite non implémentée dans TriObject
    }

}
