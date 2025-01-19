package org.example.Singleton;

public class ClasseMère {
    String nom;
    static ClasseMère cM;                           //attribut statique réfléxif
    public static ClasseMère getClasseMèreUnique(){ //méthode statique de création unique et renvoi
        if(ClasseMère.cM == null){                  //si la variable est nulle, on la créé
            ClasseMère.cM = new ClasseMère("bob");
            System.out.println("l'instance est créée de manière unique");
            return ClasseMère.cM;                       //rajout de la ligne juste pour faire un print si déjà créé
        }
        System.out.println("l'instance a déjà été créée de manière unique");
        return ClasseMère.cM;
    }

    private ClasseMère(String nom){                           //Constructeur en PRIVE
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
