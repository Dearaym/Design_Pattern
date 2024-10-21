package org.example.Factory;

public interface InterfaceA {
    //Possède 2 méthodes
    default void m1(){System.out.println("m1 dans interface travail");}
    default void m2(){System.out.println("m2 dans interface travail");}

    //possède une méthode de classe : la factory
    //Le type retourné est celui de l'interface pour être modulable
    //il n'y a que le core de la méthode à changer si besoin
    public static InterfaceA factory(){
        //on décide de créer des classes concrètes A1
        return new ClasseA1();

    }
}
