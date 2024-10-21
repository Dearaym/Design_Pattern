package org.example.Facade;

//classes présentation ne connaissent pas les changements dans Métiers car encapsulation
public class presentation1 {
    public presentation1() {
        System.out.println("presentation1 constructor");
    }

    public void p1(){
        System.out.println("p1");
        Metier metier = new Metier();   //créé un Metier pour pouvoir utiliser les méthodes m1 et m2
        metier.m1();                    //méthode dans Metier qui créé un Wow1 suite à la modif et applique la méthode wow1()
        metier.m2();
    }
}
