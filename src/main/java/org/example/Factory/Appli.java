package org.example.Factory;

import java.util.ArrayList;
import java.util.List;

public class Appli {
    public static void main(String[] args) {
        List<InterfaceA> list = new ArrayList<InterfaceA>();    //création d'une liste d'InterfaceA

        for (int i = 0; i < 10; i++) {
            list.add(InterfaceA.createInterfaceA());     //appel de la méthode factory qui délègue la création
                                                //on ne fait plus de new dans le main
        }

        //utilisation uniforme des objets
        for (int i = 0; i < 10; i++) {
            list.get(i).m1();
        }
    }
}
