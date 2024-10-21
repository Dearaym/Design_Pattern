package org.example.Facade;

public class presentation2 {
    public presentation2() {
        System.out.println("presentation2 constructor");
    }
    public void p2(){
        System.out.println("p2");
        Metier metier = new Metier();
        metier.m1();
        metier.m3();
    }
}
