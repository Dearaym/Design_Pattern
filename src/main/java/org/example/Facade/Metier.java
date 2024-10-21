package org.example.Facade;

public class Metier {
    public Metier() {
        System.out.println("constructor Metier");
    }

    public void m1(){
        System.out.println("m1 dans Metier");
        //On décide de changer m1 par w1 de la classe Wow1
        //couche présentation n'est pas au courant
        //seuls changements dans Metier
        Wow1 wo1 = new Wow1();
        wo1.w1();
    }

    public void m2(){
        System.out.println("m2 dans Metier");
        Metier2 met2 = new Metier2();
        met2.m2();
    }

    public void m3(){
        System.out.println("m3 dans Metier");
        Metier3 met3 = new Metier3();
        met3.m3();
    }
}
