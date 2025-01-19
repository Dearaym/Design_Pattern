package org.example.Facade;

public class Appli {
    public static void main(String[] args) {
        //creation de 3 presentation
        presentation1 pres1 = new presentation1();
        presentation2 pres2 = new presentation2();
        presentation3 pres3 = new presentation3();

        //utilisation de m1 pour chaque presentation
        //m1 était déf dans métier mais redéf dans chaque métier métier1, métier2 et métier3
        pres1.p1();
        pres2.p2();
        pres3.p3();
    }
}
