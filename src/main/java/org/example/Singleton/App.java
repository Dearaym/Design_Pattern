package org.example.Singleton;

public class App {
    public static void main(String[] args) {
        //ClasseMère cm = new ClasseMère("test");           //impossible car constructeur privé
        ClasseMère cm = ClasseMère.getClasseMèreUnique();   //on récupère l'instance via la variable statique (de classe)
        System.out.println(cm.getNom());                    //on peut faire des actions dessus

        ClasseMère cm2 = ClasseMère.getClasseMèreUnique();   //on constate qu'elle a déjà été créée
        System.out.println(cm.getNom());
    }
}
