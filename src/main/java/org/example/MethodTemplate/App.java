package org.example.MethodTemplate;

import java.util.ArrayList;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        TriNombre tn = new TriNombre();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        tn.tri(list);
    }
}
