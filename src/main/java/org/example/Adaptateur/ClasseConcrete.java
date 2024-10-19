package org.example.Adaptateur;

//Une classe concrete qui faisait déjà parti du projet de base
public class ClasseConcrete implements InterfaceTravail {


    public void m1() {System.out.println("m1 dans Classe concrete");}
    public void m2() {System.out.println("m2 dans Classe concrete");}


    public String toString(){
        return "Classe concrete";
    }
}
