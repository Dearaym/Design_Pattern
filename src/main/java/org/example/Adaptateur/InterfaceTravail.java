package org.example.Adaptateur;

//Peut aussi être une classe abstraite
public interface InterfaceTravail {

    //Possède 2 méthodes
    default void m1(){System.out.println("m1 dans interface travail");}
    default void m2(){System.out.println("m2 dans interface travail");}
}
