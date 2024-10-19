package org.example.Adaptateur;


import java.lang.reflect.Array;
import java.util.ArrayList;

//Le client
//Le client utilise les classes InterfaceTravail, Adaptateur et ClasseConcrete
public class Appli {
    public static void main(String[] args) {
        System.out.println("Le client");
        ArrayList<InterfaceTravail> iT = new ArrayList<InterfaceTravail>();
        for(int i=0; i<3; i++){
            iT.add(new ClasseConcrete());
            iT.add(new Adaptateur());
        }

        for(int i=0; i<iT.size(); i++){
            iT.get(i).m1();
            //iT.get(i).m4(); --> m4 n'est pas connu dans interface travail car encapsulé avec l'association
        }

    }

}
