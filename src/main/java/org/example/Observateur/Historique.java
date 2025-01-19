package org.example.Observateur;

public class Historique implements Observateur {
    private String nom;
    @Override
    public void notifier() {
        System.out.println("je notifie dans l'historique");
    }

    public Historique (String nom) {
        this.nom = nom;
    }
}
