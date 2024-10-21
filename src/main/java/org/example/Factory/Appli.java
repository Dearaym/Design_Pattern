package org.example.Factory;

import java.util.ArrayList;
import java.util.List;

public class Appli {
    public static void main(String[] args) {
        List<InterfaceA> list = new ArrayList<InterfaceA>();

        for (int i = 0; i < 10; i++) {
            list.add(InterfaceA.factory());     //appel de la méthode factory qui délègue la création
        }
    }
}
