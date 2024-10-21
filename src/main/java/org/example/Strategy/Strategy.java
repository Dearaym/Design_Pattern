package org.example.Strategy;

//Interface avec 2 classes concrètes implémentées
public interface Strategy {

    public default void doStrategy(){
        System.out.println("do strategy");
    }
}
