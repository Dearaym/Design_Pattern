package org.example.Strategy;

//Client
public class Appli {
    public static void main(String[] args) {
        Strategist S = new Strategist();    //on créer un stratège qui a pour stratégie par défaut A
        S.m1(); //on utilise la stratégie de S avec la méthode m1
        S.setStrategy(new StrategyB()); //on décide de changer de stratégie à la volée : B
        S.m1(); //on utilise à nouveau la stratégie
        //grâce au polymorphisme, le code de stratégie de B est exécuté

    }


}
