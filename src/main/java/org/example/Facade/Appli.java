package org.example.Facade;

public class Appli {
    public static void main(String[] args) {
        presentation1 pres1 = new presentation1();
        presentation2 pres2 = new presentation2();
        presentation3 pres3 = new presentation3();

        pres1.p1();
        pres2.p2();
        pres3.p3();
    }
}
