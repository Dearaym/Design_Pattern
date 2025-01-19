package org.example.Observateur;

public class Logger implements Observateur{
    private String nom;
    @Override
    public void notifier() {
        System.out.println("je notifie dans le logger");
    }

    public Logger(String nom) {
        this.nom = nom;
    }

}
