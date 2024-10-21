package org.example.Adaptateur;

//Rôle : intégrer une classe externe au projet via association (ou héritage)
//hérite du comportement initial de l'application
public class Adaptateur implements InterfaceTravail{
    private ClasseExterne adapate;          //association entre adapateur et ClasseExterne

    public Adaptateur() {
        this.adapate = new ClasseExterne();
    }

    public void m1(){
        System.out.println("m1 dans adapte");
        //on peut par ex utiliser les méthodes de la classe externe pour les redéf de m1 et m2
        this.adapate.m5();
    }
    public void m2(){System.out.println("m2 dans adapte");}
    public String toString(){
        return "Adaptateur";
    }
}
