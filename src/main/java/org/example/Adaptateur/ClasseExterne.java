package org.example.Adaptateur;

//Adapté
//Une classe externe que l'on veut intégrer au projet déjà existant
public class ClasseExterne {
    private String nom;
    private String propriExterne;

    public ClasseExterne() {
        this.nom = "nom";
        this.propriExterne = "propriExterne";
    }

    public void m4(){System.out.println("m4 dans ClasseExterne");}
    public void m5(){System.out.println("m5 dans ClasseExterne");}
    public void m6(){System.out.println("m6 dans ClasseExterne");}
}
